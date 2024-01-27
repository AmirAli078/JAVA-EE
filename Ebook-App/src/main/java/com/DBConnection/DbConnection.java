package com.DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

    private Connection connection;

    private DbConnection() {
        // Private constructor to prevent instantiation
    }

    public static Connection getConnection() {
        DbConnection instance = new DbConnection();

        if (instance.connection == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                instance.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/college_db", "root", "123456");
                System.out.println("Connected");
            } catch (SQLException | ClassNotFoundException e) {
                e.printStackTrace(); 
                throw new RuntimeException("Error connecting to database", e);
            }
        }

        return instance.connection;
    }

    public static void closeConnection() {
        DbConnection instance = new DbConnection();

        if (instance.connection != null) {
            try {
                instance.connection.close();
                instance.connection = null;
                System.out.println("Connection closed");
            } catch (SQLException e) {
                e.printStackTrace(); 
            }
        }
    }
}
