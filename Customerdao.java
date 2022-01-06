package dao;
import Util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import bins.customer;
public class Customerdao {
	Connection con = ConnectionUtil.getConnection();

	public String addcus(customer c) {

		// TODO Auto-generated method stub
		String sql="insert into customer values(?,?,?,?,?)";
	     try {	 
	         PreparedStatement pst1=con.prepareStatement(sql);
	         pst1.setString(1,c.getCus_id());
	         pst1.setString(2,c.getCus_name());
	         pst1.setString(3,c.getCus_email());
	         pst1.setString(4,c.getCus_pass());
	         pst1.setLong(5,c.getCus_num());
	         System.out.println(pst1.executeUpdate()); 
	        } catch (SQLException e) {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	        }
		return "success";
	}
	public int login(String cname, String cpassword) {
		int login=0;
		String Sql=" select count(*) from customer where cus_mail=? and cus_pass=?";

		try {
			PreparedStatement pst5=con.prepareStatement(Sql);
			pst5.setString(1,cname);
			pst5.setString(2, cpassword);
			ResultSet rs=pst5.executeQuery();
			rs.next();
			login=rs.getInt(1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	return login;
	}
	public String updatecus(String email, String pass,String cusId) {
		String sql1="update customer set cus_mail=?, cus_pass=? where cus_id=?; ";
		 try {
	            PreparedStatement pst2=con.prepareStatement(sql1);
	            pst2.setString(1,email);
	            pst2.setString(2,pass);
	            pst2.setString(3,cusId);
	            System.out.println(pst2.executeUpdate());      
		 }
		 catch(SQLException e) {
			 e.printStackTrace();
		 }
		return "success";
	}
	public String bookroom(String cus_id, String room_id, Double price, String date) {
		String sql="insert into bookings values(?,?,?,?)";
	     try {	 
	         PreparedStatement pst1=con.prepareStatement(sql);
	         pst1.setString(1,cus_id);
	         pst1.setString(2,room_id);
	         pst1.setDouble(3,price);
	         pst1.setString(4,date);
	         System.out.println(pst1.executeUpdate()); 
	        } catch (SQLException e) {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	        }
		return "success";
	}
}
