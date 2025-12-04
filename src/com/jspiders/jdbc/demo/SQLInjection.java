package com.jspiders.jdbc.demo;

import java.sql.*;

public class SQLInjection {
    private static final String dburl="jdbc:mysql://localhost:3306/appusers";
        private static final String user="root";
    private static final String password="jayvee";

    public static void loginV2(String mobile,String pass){
        String selectSql="SELECT * FROM users WHERE mobile=? AND password=?";
        try{
            Connection con= DriverManager.getConnection(dburl,user,password);
            PreparedStatement psm1=con.prepareStatement(selectSql);
            psm1.setString(1,mobile);
            psm1.setString(2,pass);
            System.out.println("query: " +psm1);
            ResultSet rs=psm1.executeQuery();
            if(rs.next())
                System.out.println("login success");
            else System.out.println("Login failed");
        }catch(Exception e){
            throw  new RuntimeException(e);
        }
    }
    public static void login(String mobile,String pass){
        String selectSql="SELECT * FROM USERS WHERE MOBILE='"+mobile+"' and password='"+pass+"';";
        try{
            Connection con= DriverManager.getConnection(dburl,user,password);
            Statement stm1=con.createStatement();

            System.out.println("query: " +selectSql);
            ResultSet rs=stm1.executeQuery(selectSql);
            if(rs.next())
                System.out.println("login success");
            else System.out.println("Login failed");
        }catch(Exception e){
            throw  new RuntimeException(e);
        }
        }

public static void main(String[] args) {
       String mobile="' OR '1'='1";
       String pass="' OR '1'='1";
       login(mobile,pass);
//       loginV2(mobile,pass);
}

}