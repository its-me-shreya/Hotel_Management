package hotelService;

import bins.customer;

public interface Icustomer {
	public String addcus(customer c);
	public int login(String email,String pass);
	public String updatecus(String email,String pass,String cusId);
	public String bookroom(String cus_id,String room_id,Double price,String date);
}
