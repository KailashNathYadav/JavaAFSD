package com.jdbc.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcCreate {
	public static void main(String[] args) {
		String url, username, password,query;
		url = "jdbc:mysql://localhost:3306/jdbc_test?useSSL=false";
		username = "root";
		password = "Ulns@min8";
		query = "create table department(dept_id int, dept_name varchar(20))";
		//try-with-resource
		System.out.println("Creating table using jdbc:: ");
		try(Connection con = DriverManager.getConnection(url,username,password);
			Statement st = con.createStatement()){
			int cnt = st.executeUpdate(query);
			System.out.println("Row/s affected: " + cnt);
		}
		catch(Exception e) {
			System.out.println("Error Occured!!");
		}
	}
}
