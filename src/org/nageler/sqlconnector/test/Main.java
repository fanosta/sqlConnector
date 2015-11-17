package org.nageler.sqlconnector.test;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.nageler.sqlconnector.dbconn.DBConn;

public class Main {
	public static void main(String[] args) throws IllegalArgumentException, SQLException {
		Logger.getLogger(DBConn.class.getName()).setLevel(Level.INFO);
		
		Driver driver = new com.mysql.jdbc.Driver();
		DriverManager.registerDriver(driver);
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "");
		
		DBConn dbconn = new DBConn(conn);
		
		Book b = new Book("Buch der Bücher", "Franz Auerswald");

		System.out.println(dbconn.selectAll(Book.class));
		System.out.println(dbconn.select(Book.class, "WHERE author = ?", "J. K. Rowling"));
		System.out.println(dbconn.select(Book.class, "WHERE author = ?", "Stieg Larson"));
		System.out.println(dbconn.select(Book.class, "WHERE author = ?", "Franz Auerswald"));
	}
}
