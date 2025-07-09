package com.foodapp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Orderservice {
    public void placeOrder(Scanner sc,int userid) throws SQLException {
    	UserService.register(sc);
        System.out.print("Enter the food id to order: ");
        int foodid = sc.nextInt();

        try (Connection con = DButil.getConnection()) {
            PreparedStatement ps = con.prepareStatement("INSERT INTO orders(user_id, food_id) VALUES (?, ?)");
            ps.setInt(1, userid);
            ps.setInt(2, foodid);
            ps.executeUpdate();
            System.out.println("Order placed successfully.\n");
        } catch (SQLException e) {
            System.out.println("Order failed: \n" + e.getMessage());
        }
    }

    public void viewOrder(int user_id) {
        String sql = "SELECT  orders.id AS order_id,menu.name, menu.price FROM orders " +
                     "JOIN menu ON orders.food_id = menu.id " +
                     "WHERE orders.user_id = ?";

        try (Connection con = DButil.getConnection()) {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, user_id);
            ResultSet rs = ps.executeQuery();

            boolean hasOrders = false;
            while (rs.next()) {
                hasOrders = true;
                int orderid = rs.getInt("order_id");
                String name = rs.getString("name");
                int price = rs.getInt("price");
                System.out.println("Order ID: " + orderid + ", Food: " + name + ", Price: ₹" + price);
            }

            if (!hasOrders) {
                System.out.println("No orders found for user ID: " + user_id);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

public void cancelOrder(Scanner sc,int userid) throws SQLException {
	System.out.print("Enter Order ID to cancel: ");
int orderid=sc.nextInt();
try(Connection con=DButil.getConnection()){
	PreparedStatement ps=con.prepareStatement("Delete from \"orders\" where id=? and user_id=?");
	ps.setInt(1, orderid);
	ps.setInt(2, userid);
	int rowsAffected=ps.executeUpdate();
	if(rowsAffected>0) {
		System.out.println("Order cancelled successfully ");
	}	
	else {
		System.out.println("Invalid Order id");
	}
}
catch(SQLException e) {
	e.printStackTrace();
}
}
}
