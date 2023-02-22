package com.jdbc.test;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcTest {
	public static void main(String[] args) {
		String url, username, password;
		url = "jdbc:mysql://localhost:3306/jdbc_test?useSSL=false";
		username = "root";
		password = "Ulns@min8";
		// try with resources
		System.out.println("Connecting to database: ");
		try (Connection conn = DriverManager.getConnection(url, username, password)){
			System.out.println("Connection established successfully:: Wow!!");
		} catch (Exception e) {
			System.out.println("Exception occured while connecting to db:	" + e.getMessage());
		}
	}
}
