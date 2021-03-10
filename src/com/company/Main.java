package com.company;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {
        Connection con = ConnectionToDb.Connection();
        try {
            String query = "select * from medicines1";
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while(resultSet.next()) {
                System.out.println(resultSet.getString(1) + " " + resultSet.getString(2));
            }
        } catch (Exception e) {
            System.out.println("Connection failed");
        }
    }
}
