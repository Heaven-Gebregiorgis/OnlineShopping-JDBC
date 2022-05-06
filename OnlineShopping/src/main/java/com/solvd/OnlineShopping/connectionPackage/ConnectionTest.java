package com.solvd.OnlineShopping.connectionPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;





public class ConnectionTest {

	private static final Logger LOGGER = LogManager.getLogger(ConnectionTest.class);
	public static void main(String[] args) {
		
		Connection conn = null;
		
		
		Properties p = new Properties();
		try {
			p.load(new FileInputStream("/Users/apple/Desktop/Solvd automation/OnlineShopping/src/main/resources/db.properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String url = p.getProperty("db.url");
		String username = p.getProperty("db.username");
		String password = p.getProperty("db.password");
		
		LOGGER.info("database URL " + url);
		LOGGER.info("database user " + username);
		System.out.println("database url " + url);
		try {
			conn = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("connection succesful!");
	}
}
