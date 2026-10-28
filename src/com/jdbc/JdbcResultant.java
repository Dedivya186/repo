package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcResultant {

	public static void main(String[] args) {
		final String URL="jdbc:mysql://localhost:3306/mydata";
		String user="root";
		String password="Dedivya@5b8";
		String Query="select * from student";
		try {
			Connection connection=DriverManager.getConnection(URL, user, password);
			Statement st=connection.createStatement();
			ResultSet res=st.executeQuery(Query);
			System.out.println("ID \t Name \t Marks \t Age");
			while(res.next()) {
				int id=res.getInt(1);
				String name=res.getString(2);
				int marks=res.getInt(3);
				int age=res.getInt(4);
				System.out.println(id +"\t"+name+"\t"+marks+"\t"+age);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
