package com.jdbc.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcDelete {
	public static void main(String[] args) {
		String url, username, password,query;
		url = "jdbc:mysql://localhost:3306/jdbc_test?useSSL=false";
		username = "root";
		password = "Ulns@min8";
		query = "Delete from employee where emp_id = 2";
		//try-with-resource
		System.out.println("Deleting employee with emp_id = 2::");
		try(Connection con = DriverManager.getConnection(url,username,password);
			Statement st = con.createStatement()){
			int cnt = st.executeUpdate(query);
			System.out.println("No of row/s affected : " + cnt);
		}
		catch(Exception e) {
			System.out.println("Error occured");
		}
	}
}
