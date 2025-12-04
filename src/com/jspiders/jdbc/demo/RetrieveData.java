package com.jspiders.jdbc.demo;

import java.sql.*;
import java.util.Scanner;

public class RetrieveData {
    private static  final String dburl="jdbc:mysql://localhost:3306/appusers";
    private static final String user="root";
    private static final String password="jayvee";
    private static final Scanner sc=new Scanner(System.in);
    public static void getUser(){
        String selectsql="select * from appusers.users";

        System.out.println("program starts");
        try {
            Connection con = DriverManager.getConnection(dburl, user, password);
            Statement stmt=con.createStatement();
           ResultSet rs =stmt.executeQuery(selectsql);
//           boolean b1=rs.next();
//            System.out.println(b1);
//            int userid=rs.getInt("userid");
//            String name=rs.getString("name");
//            String mobile=rs.getString("mobile");
//            String password=rs.getString("password");
//            System.out.println(userid);
//            System.out.println(name);
//            System.out.println(mobile);
//            System.out.println(password);
//            boolean b2=rs.next();
//            System.out.println(b2);
//           userid=rs.getInt("userid");
//         name=rs.getString("name");
//          mobile=rs.getString("mobile");
//          password=rs.getString("password");
//            System.out.println(userid);
//            System.out.println(name);
//            System.out.println(mobile);
//            System.out.println(password);
            while(rs.next()==true){
                int userid=rs.getInt("userid");
            String name=rs.getString("name");
            String mobile=rs.getString("mobile");
            String password=rs.getString("password");
                System.out.println(userid+" "+name+" "+mobile+" "+password);
            }
            System.out.println("program ends");
        } catch (SQLException e){
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
    public static void getUserByMobile(){
        String selectmob="select * from appusers.users where mobile=?";
        System.out.println("program starts");
        try {
            Connection con = DriverManager.getConnection(dburl, user, password);
            PreparedStatement ps=con.prepareStatement(selectmob);
            System.out.println("enter the mobile num: ");
            String mobile=sc.next();
            ps.setString(1,mobile);
            ResultSet rs=ps.executeQuery();
            if(rs.next()==true){
                String name=rs.getString("name");
                System.out.println(name);
            }
            else{
                System.out.println("user not found");
            }
    }catch(SQLException e){
            e.printStackTrace();
            System.out.println("cant connect to the database....");
        }}
    public static void main(String[] args) {
        RetrieveData.getUser();
        RetrieveData.getUserByMobile();
    }
}
