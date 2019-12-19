package com.test.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class Db {
    public static Connection getDb() {
    	try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/swingdb","root",""); 
		} catch (Exception e) {
			e.getMessage();
		}
    	return null;
    }
}
