package com.jspiders.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//Staic sql queries
public class Demo {
  public static void adduser(){
        System.out.println("program starts...");
       String name="jimin";
       String mobile="9945688773";
       String password="jimin123@";
       String insertSql="insert into appusers.users vlaues(0,"+"'"+name+"'," +"'"+mobile+"',"+"'"+password+"')";
      System.out.println(insertSql);
        System.out.println("program ends...");
  }
    public static void main(String[] args) {
      Demo.adduser();
    }
}
