package com.manasmishra.expensetracker.db;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnect {
    public static Connection connection;
    public static Statement statement;

    static {
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:expense.db");
            statement = connection.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }
}
