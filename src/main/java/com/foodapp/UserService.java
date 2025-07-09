package com.foodapp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class UserService {
public static int register(Scanner sc) throws SQLException {
	System.out.println(" Register your Detials");
	System.out.print("Enter  username: ");
    String username = sc.nextLine();
    System.out.print("Enter password: ");
    String password = sc.nextLine();
    System.out.print("Enter Address: ");
    String address= sc.nextLine();
    System.out.print("Mobile No: ");
     long mobno=sc.nextLong();


try(Connection con=DButil.getConnection();
		PreparedStatement ps=con.prepareStatement("insert into users(username ,password)values(?,?)");)		
		{
	ps.setString(1,username);
	ps.setString(2,password);
	ps.executeUpdate();
	System.out.println("Registration successful.");
return 1;
}
catch(SQLException e) {
	 System.out.println("Registration failed: Username might be taken.");
return -1;
	
}
}
}
