package com.jspiders.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {
    public static void main(String[] args) {
        System.out.println("program starts");
        try{
            String insertStmt="insert into appusers.users values(2,'jk','8876844532','jk123')";
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/appusers", "root", "jayvee");
            System.out.println("connection successful!");
            Statement stmt=con.createStatement();
            int rowsAffected=stmt.executeUpdate(insertStmt);
            System.out.println("program ends");
        } catch (SQLException e){
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
