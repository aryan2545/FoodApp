package com.foodapp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Menuservice {
	public void displayMenu() {
        try (Connection con = DButil.getConnection()) {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM menu");

            System.out.println("Menu:");
            while (rs.next()) {
                System.out.printf("%d. %s - ₹%.2f\n",
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getDouble("price"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}



