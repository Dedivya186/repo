package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo2 {

	public static void main(String[] args) {
		final String URL="jdbc:mysql://localhost:3306/mydata";
		String user="root";
		String password="Dedivya@5b8";
        String query="delete from student where id=1";
        try {
			Connection connection=DriverManager.getConnection(URL, user, password);
			Statement st=connection.createStatement();
			int rows=st.executeUpdate(query);
			System.out.println(rows+" deleted");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        

	}

}
