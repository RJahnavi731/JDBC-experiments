package com.jspiders.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DynamicUpdate {
    private static final Scanner sc=new Scanner(System.in);
    public static void updateUser(){
        System.out.println("enter the current number: ");
        String currmobile= sc.next();
        System.out.println("enter the newnum: ");
        String newmobile= sc.next();
        String updateSQL="update appusers.users set mobile=? where mobile=?";
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", "jayvee");
            PreparedStatement ps=con.prepareStatement(updateSQL);
            ps.setString(1,newmobile);
            ps.setString(2,currmobile);
            ps.executeUpdate();
            System.out.println("connection suucessful!");
        } catch(SQLException e){
            e.printStackTrace();
            System.out.println("cant connect to the database....");
        }
    }
    public static void main(String[] args) {
   DynamicUpdate.updateUser();
    }
}
