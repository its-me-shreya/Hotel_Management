package main;
import java.util.Scanner;
import Util.EmailValid;
import bins.book;
import bins.customer;
import bins.rooms;
import hotelService.CustomerServiceImpl;
import hotelService.EmployeeServiceImpl;

public class hmain {
	public static void main(String[] args) {
		rooms r=new rooms();
		customer c=new customer();
		book b=new book();
		EmailValid vmail=new EmailValid();
		EmployeeServiceImpl e=new EmployeeServiceImpl();
		CustomerServiceImpl cu=new CustomerServiceImpl();
		int choice2;
		System.out.println("Hello User! Welcome to the hotel!");
		System.out.println("Enter 1 for employee");
		System.out.println("Enter 2 for customer");
		System.out.println("Enter 3 for exit");
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		choice2=s.nextInt();
		switch(choice2) {
			case 1:
				System.out.println("Enter 1 to add a room ");
				System.out.println("Enter 2 to update a room ");
				System.out.println("Enter 3 to delete a room ");
				System.out.println("Enter 4 to display all rooms ");
				System.out.println("Enter 5 to show all customers ");
				System.out.println("Enter 6 to show all bookings ");
				System.out.println("Enter 7 to checkout from a room ");
				int choice=s.nextInt();
				switch(choice) {
				case 1:
					System.out.println("Enter room id:");
					r.setRoom_id(s.next());
					System.out.println("Enter yes for ac room else no:");
					r.setRoom_type(s.next());
					System.out.println("Enter yes for wifi else no:");
					r.setWifi(s.next());
					System.out.println("Enter yes for tv else no:");
					r.setTv(s.next());
					System.out.println("Enter the suitable room price:");
					r.setPrice(s.nextDouble());
					System.out.println("Enter room status booked or vacant:");
					r.setStatus(s.next());
					System.out.println("Enter any extra feature you want to add:");
					s.nextLine();
					r.setXtra_fea(s.nextLine());
			        e.addroom(r);
					break;	
				case 2:
					System.out.println("Enter room id to update:");
					String updId=s.next();
					e.updateroom(r, updId);
					break;
				case 3:
					System.out.println("Enter room id to delete");
					String dltId=s.next();
					e.deleteroom(r,dltId);
					break;
				case 4:
					System.out.println("The rooms are given below:");
					System.out.println(e.display(r));
					break;
				case 5:
					System.out.println("The customer details are given below:");
					System.out.println(e.displaycus());
					break;
				case 6:
					System.out.println("The booking details are given below");
					System.out.println(e.books());
					break;
				case 7:
					System.out.println("Enter room_id to checkout");
					String room_id=s.next();
					System.out.println(e.checkout(room_id));
				}
				break;
			case 2:
				System.out.println("Hello customer!");
				System.out.println("Enter 1 for new registration");
				System.out.println("Enter 2 for existing login");
				System.out.println("Enter 3 to update customer ");
				System.out.println("Enter 4 to book a room ");
				int option=s.nextInt();
				switch(option) {
				case 1:
					System.out.println("Enter your customer id:");
					c.setCus_id(s.next());
					String name=null;
					do {
					System.out.println("Enter your full name:");
					name=s.next();
					}while(vmail.validname(name)!=true);
					c.setCus_name(name);
					String mail=null;
					do {
					System.out.println("Enter your Email:");
					mail=s.next();
					}while(vmail.validmail(mail)!=true);
					c.setCus_email(mail);
					System.out.println("Enter your new password:");
					c.setCus_pass(s.next());
					System.out.println("Enter your phone num:");
					c.setCus_num(s.nextLong());
					cu.addcus(c);
					break;
				case 2:
					System.out.println("Enter Email to login:");
					String email=s.next();
					System.out.println("Enter correct password");
					String pass=s.next();
					System.out.println(cu.login(email, pass));
					break;
				case 3:
					System.out.println("Enter the cusId to update email and pass:");
					String cusId=s.next();
					System.out.println("Enter customer email to update:");
					String update_email=s.next();
					System.out.println("Enter customer pass to update");
					String update_pass=s.next();
					System.out.println(cu.updatecus(update_email, update_pass, cusId));
					break;
				case 4:
					System.out.println("Enter your customer id:");
					String cus_id=s.next();
					b.setCus_id(cus_id);
					System.out.println("Enter the room id to book:");
					String room_id=s.next();
					b.setRoom_id(room_id);
					System.out.println("Enter the total price:");
					Double price=s.nextDouble();
					b.setPrice(price);
					System.out.println("Enter the checkout date:");
					String date=s.next();
					b.setCheckout(date);
					System.out.println(cu.bookroom(cus_id, room_id, price, date));
					break;
			}
			case 3:
				System.out.println("Successfully existed !");
				System.exit(1);
				break;
		}
	}
}

