package com.jspiders.jdbc.demo;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class ConnectionDemo {
    public static void main(String[] args) {
        System.out.println("program starts.....//");
        String username="root";
        String password="jayvee";
        String dburl="jdbc:mysql://localhost:3306/appusers";
        try{
            Connection connection= DriverManager.getConnection(dburl,username,password);
        } catch(SQLException e){
            e.printStackTrace();
            System.out.println("cant connect to the database....");
        }
        System.out.println("program ends...");
    }
}
