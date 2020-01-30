package com.account.connectionutil;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class ConnectionUtil {
	private static Properties properties = null;
	static {
		properties = new Properties();
		try {
			properties.load(ConnectionUtil.class.getResourceAsStream("db.properties"));
			Class.forName(properties.getProperty("driver"));

		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(properties.getProperty("url"), properties.getProperty("username"),
					properties.getProperty("password"));
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return connection;

	}
	public static void close(ResultSet resultSet, Statement statement, Connection connection) {

		try {
			if (resultSet != null) {
				resultSet.close();
			}
			close(statement, connection);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void close(Statement statement, Connection connection) {

		try {
			if (statement != null) {
				statement.close();
			}
			close(connection);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void close(Connection connection) {

		try {
			if (connection != null) {
				connection.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		System.out.println(ConnectionUtil.getConnection());
	}
	

}
