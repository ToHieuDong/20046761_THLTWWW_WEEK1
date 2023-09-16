package com.example.demoweek1.repositories;

import java.sql.*;

public class Database {
    private Connection connection = null;

    public Database() {
        String url = "jdbc:mariadb://localhost:3306/student";
        try {
            connection = DriverManager.getConnection(url, "root", "1234");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }



}
