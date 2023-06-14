package com.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnect {
	private static Connection conn;

	public static Connection getConn() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "FM_GENERALHOSPITAL", "fm");

		} catch (Exception e) {
			e.printStackTrace();
		}

		return conn;
	}

}
