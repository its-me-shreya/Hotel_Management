package dao;
import java.util.List;

import Util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bins.book;
import bins.customer;
import bins.rooms;
public class Employeedao {
	Connection con = ConnectionUtil.getConnection();
	public String addroom(rooms r) {
	 String sql="insert into rooms values(?,?,?,?,?,?,?)";
     try {	 
         PreparedStatement pst1=con.prepareStatement(sql);
         pst1.setString(1,r.getRoom_id());
         pst1.setString(2,r.getRoom_type());
         pst1.setString(3,r.getWifi());
         pst1.setString(4,r.getTv());
         pst1.setDouble(5,r.getPrice());
         pst1.setString(6,r.getXtra_fea()); 
         pst1.setString(7,r.getStatus());
         
         System.out.println(pst1.executeUpdate()); 
        } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
        }
	return "success";
	}
	public String updateroom(rooms r,String updId) {
		String sql1="update rooms set room_status=? where room_id=? ";
		 try {
	            PreparedStatement pst2=con.prepareStatement(sql1);
	            pst2.setString(1,"vacant");
	            pst2.setString(2,updId);
	            System.out.println(pst2.executeUpdate());      
		 }
		 catch(SQLException e) {
			 e.printStackTrace();
		 }
		return "success";
	}
	public String deleteroom(rooms r, String dltId) {
		String sql1="delete from rooms where room_id=? ";
		 try {
	            PreparedStatement pst2=con.prepareStatement(sql1);
	  
	            pst2.setString(1,dltId);
	            System.out.println(pst2.executeUpdate());      
		 }
		 catch(SQLException e) {
			 e.printStackTrace();
		 }

	return "success";
	}
	public List<rooms> display(rooms r) {
		List<rooms> ar=new ArrayList<rooms>();
		String sql1="select * from rooms ";
		 try {
	            PreparedStatement pst2=con.prepareStatement(sql1);
	            ResultSet rs=pst2.executeQuery();
	            while (rs.next()) {
	            	r.setRoom_id(rs.getString(1));
	            	r.setRoom_type(rs.getString(2));
	            	r.setWifi(rs.getString(3));
	            	r.setTv(rs.getString(4));
	            	r.setPrice(rs.getLong(5));
	            	r.setXtra_fea(rs.getString(6));
	            	r.setStatus(rs.getString(7));
	            	ar.add(r);
	            }    
		 }
		 catch(SQLException e) {
			 e.printStackTrace();
		 }
		 return ar;
	}
		public List<customer> displaycus() {
		
		List<customer> cr=new ArrayList<customer>();
		String sql1="select * from customer ";
		 try {
	            PreparedStatement pst2=con.prepareStatement(sql1);
	            ResultSet rs2=pst2.executeQuery();
	            while (rs2.next()) {
	            	customer c=new customer();
	            	c.setCus_id(rs2.getString(1));
	            	c.setCus_name(rs2.getString(2));
	            	c.setCus_email(rs2.getString(3));
	            	c.setCus_pass(rs2.getString(4));
	            	c.setCus_num(rs2.getLong(5));
	            	cr.add(c);
	            }    
		 }
		 catch(SQLException e) {
			 e.printStackTrace();
		 }
		 return cr;
	}
		public List<book> books() {
			List<book> ar=new ArrayList<book>();
			String sql1="select * from bookings ";
			 try {
		            PreparedStatement pst2=con.prepareStatement(sql1);
		            ResultSet rs=pst2.executeQuery();
		            while (rs.next()) {
		            	book b=new book();
		            	b.setCus_id(rs.getString(1));
		            	b.setRoom_id(rs.getString(2));
		            	b.setPrice(rs.getDouble(3));
		            	b.setCheckout(rs.getString(4));
		            	ar.add(b);
		            }    
			 }
			 catch(SQLException e) {
				 e.printStackTrace();
			 }
			 return ar;
		}
		public String checkout(String room_id) {
			String sql1="update rooms set room_status=? where room_id=?";
			 try {
		            PreparedStatement pst2=con.prepareStatement(sql1);
		            pst2.setString(1,"vacant");
		            pst2.setString(2,room_id);
		            System.out.println(pst2.executeUpdate());      
			 }
			 catch(SQLException e) {
				 e.printStackTrace();
			 }
			return "success";
		}
}
