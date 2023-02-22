package com.jdbc.crud;
import java.sql.*;

public class JdbcRetrive1 {
	public static void main(String[] args) {
		String url, username, password,query;
		url = "jdbc:mysql://localhost:3306/jdbc_test?useSSL=false";
		username = "root";
		password = "Ulns@min8";
		query = "select * from Employee";
		// try with resource
		System.out.println("Retriving data from employee table.");
		try(Connection conn = DriverManager.getConnection(url,username,password);
			Statement st = conn.createStatement()){
			ResultSet rs = st.executeQuery(query);
			while(rs.next()) {
				System.out.println(rs.getString(1) + " | " + rs.getString(2));
			}
		}
		catch(Exception e) {
			System.out.println("Error Occured while trying to retrive info!!");
		}
	}
}
