package Util;

import java.sql.*;

public class ConnectionUtil {
	 private static String url="jdbc:mysql://localhost:3306/shreya";
	 private static String user="root";
	 private static String password="root";
		
	 public static Connection getConnection() {
	  
	  Connection con=null;
	  try {
	   con=DriverManager.getConnection(url, user, password);
	  } catch (SQLException e) {
	   // TODO Auto-generated catch block
	   e.printStackTrace();
	  }
	  return con;
	 }


}
