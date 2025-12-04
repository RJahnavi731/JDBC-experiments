package com.jspiders.jdbc.demo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
public class DynamicDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name=sc.next();
        System.out.println("Enter the moblie: ");
        String mobile=sc.next();
        System.out.println("Enter the password: ");
        String password=sc.next();
        String insertSql="insert into appusers.users values(0,?,?,?)";
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/appusers", "root", "jayvee");
            PreparedStatement ps=con.prepareStatement(insertSql);
            ps.setString(1,name);
            ps.setString(2,mobile);
            ps.setString(3,password);
            ps.executeUpdate();
            System.out.println("connection suucessful!");
        } catch(SQLException e){
            e.printStackTrace();
            System.out.println("cant connect to the database....");
        }


    }
}
