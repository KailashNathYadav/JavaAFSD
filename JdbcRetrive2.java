package com.jdbc.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcRetrive2 {
		public static void main(String[] args) {
			String url, username, password,query;
			url = "jdbc:mysql://localhost:3306/jdbc_test?useSSL=false";
			username = "root";
			password = "Ulns@min8";
			query = "Select * from employee where emp_id = ?";
			//try-with-resource
			System.out.println("Trying to retrieve some data.");
			try(Connection con = DriverManager.getConnection(url,username,password);
				PreparedStatement pst = con.prepareStatement(query)){
				pst.setInt(1,1);
				ResultSet rs = pst.executeQuery();
				while(rs.next()) {
					System.out.println(rs.getInt(1) + " | " + rs.getString(2));
				}
			}
			catch(Exception e) {
				System.out.println("Error occured!! ");
			}
		}
}