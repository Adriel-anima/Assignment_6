package com.company;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionToDb {
    static Connection con = null;

    private ConnectionToDb() {
    }

    public static Connection Connection() {
        try {
            if(con == null) {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = (Connection) DriverManager.getConnection("jdbc:postgresql://localhost:5432/SimpleDB", "localhost", "root1");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return con;
    }
}

