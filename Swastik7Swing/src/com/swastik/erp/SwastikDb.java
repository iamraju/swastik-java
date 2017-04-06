/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swastik.erp;

import java.sql.*;

/**
 *
 * @author rajug
 */
public class SwastikDb {
    // JDBC driver name and database URL
   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   static final String DB_URL = "jdbc:mysql://localhost/";

   //  Database credentials
   static final String USER = "root";
   static final String PASS = "myp@33W0rd#";
   
   private Connection jConnection = null;
   private Statement jStatement = null;
   
   public SwastikDb(String database){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
            jConnection = DriverManager.getConnection(DB_URL + database, USER, PASS);
            
            jStatement = jConnection.createStatement();
        }catch(SQLException se){
            //Handle errors for JDBC
            se.printStackTrace();
        }catch(Exception e){
            //Handle errors for Class.forName
            e.printStackTrace();
        }finally{
            //finally block used to close resources
            try{
                if(jStatement != null)
                    jStatement.close();
            } catch(SQLException se2){

            }// nothing we can do
            try{
                if(jConnection != null)
                    jConnection.close();
            }catch(SQLException se){
                se.printStackTrace();
            }
        }
   }
   
   public Connection getConnection(){
       return jConnection;
   }
   
   public Statement getStatement(){
       return jStatement;
   }
   
//   public Array getData(String sql){
////       Array arr[] = [];
////       return new Array[];
//   }
   
   public static void main(String[] args) {
    Connection conn = null;
    Statement stmt = null;
    try{
       //STEP 2: Register JDBC driver
       Class.forName("com.mysql.jdbc.Driver");

       //STEP 3: Open a connection
       System.out.println("Connecting to database...");
       conn = DriverManager.getConnection(DB_URL, USER, PASS);

       //STEP 4: Execute a query
       System.out.println("Creating statement...");
       stmt = conn.createStatement();
       String sql;
       sql = "SELECT id, first, last, age FROM Employees";
       ResultSet rs = stmt.executeQuery(sql);

       //STEP 5: Extract data from result set
       while(rs.next()){
          //Retrieve by column name
          int id  = rs.getInt("id");
          int age = rs.getInt("age");
          String first = rs.getString("first");
          String last = rs.getString("last");

          //Display values
          System.out.print("ID: " + id);
          System.out.print(", Age: " + age);
          System.out.print(", First: " + first);
          System.out.println(", Last: " + last);
       }
       //STEP 6: Clean-up environment
       rs.close();
       stmt.close();
       conn.close();
    }catch(SQLException se){
       //Handle errors for JDBC
       se.printStackTrace();
    }catch(Exception e){
       //Handle errors for Class.forName
       e.printStackTrace();
    }finally{
       //finally block used to close resources
       try{
          if(stmt!=null)
             stmt.close();
       }catch(SQLException se2){
       }// nothing we can do
       try{
          if(conn!=null)
             conn.close();
       }catch(SQLException se){
          se.printStackTrace();
       }//end finally try
    }//end try
    System.out.println("Goodbye!");
    }
}
