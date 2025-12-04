//package com.jspiders.jdbc.demo;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//public class TransactionDemo {
//    private static final String dburl="jdbc:mysql://localhost:3306/appusers";
//    private static final String user="root";
//    private static final String password="jayvee";
//    private static Connection con=null;
//    public static void main(String[] args) {
//        try {
//            con = DriverManager.getConnection(dburl,user,password);
//            con.setAutoCommit(false);
//            String insertSql="insert into appusers.users values(0,'TransactionUser','7677855645','transuser12');";
//            Statement stmt1=con.createStatement();
//            stmt1.executeUpdate(insertSql);
//            System.out.println("adding user successfully");
//            System.out.println("update user");
//            String Updatesql="update appusers.users" + "set mobile='7656797865', where mobile='9898756473';";
//            Statement stmt2=con.createStatement();
//            int rowsAffected=stmt2.executeUpdate(Updatesql);
//            if(rowsAffected==0){
//                throw new SQLException("user with mobile number is not found");
//            }
//            System.out.println("update user successfull for" + rowsAffected+"user(s)");
//        }catch (){
//
//        }
//
//    }
//}
