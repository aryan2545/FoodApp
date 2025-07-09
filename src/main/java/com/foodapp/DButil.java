package com.foodapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DButil {
	private static final String URL = "jdbc:postgresql://localhost:5432/foodapp";
	private static final String USER = "postgres";
	private static final String PASSWD = "root123";

	

	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(URL, USER, PASSWD);
	}

}
