/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Dell
 */
import Bean.LoginBean;
import java.sql.*;
public class LoginDao {
    public String authenticateUser(LoginBean loginBean) throws SQLException
     {
         String userName = loginBean.getUserName(); //Assign user entered values to temporary variables.
         String password = loginBean.getPassword();
 
         Connection con = null;
         Statement statement = null;
         ResultSet resultSet = null;
 
         String userNameDB = "";
         String passwordDB = "";
 
         
         try{
             con = DBConnection.createConnection(); //Fetch database connection object
             statement = con.createStatement(); //Statement is used to write queries. Read more about it.
             resultSet = statement.executeQuery("select username,password from employee"); //the table name is users and userName,password are columns. Fetching all the records and storing in a resultSet.
 
             while(resultSet.next()) // Until next row is present otherwise it return false
             {
              userNameDB = resultSet.getString("userName"); //fetch the values present in database
              passwordDB = resultSet.getString("password");
 
               if(userName.equals(userNameDB) && password.equals(passwordDB))
               {
                  return "SUCCESS"; ////If the user entered values are already present in the database, which means user has already registered so return a SUCCESS message.
               }
             }
             }
         catch(SQLException e){
             e.printStackTrace();
         }
            
            
             return "Invalid user credentials"; // Return appropriate message in case of failure
         }
     public String[] Status(LoginBean loginBean) throws SQLException
     {
         String userName = loginBean.getUserName(); //Assign user entered values to temporary variables.
 
         Connection con = null;
         Statement statement = null;
         ResultSet resultSet = null;
 
         String employee[] = new String[7];
         
         try{
             con = DBConnection.createConnection(); //Fetch database connection object
             statement = con.createStatement(); //Statement is used to write queries. Read more about it.
             String query="Select * from employee where username='"+userName+"'";
             resultSet = statement.executeQuery(query); //the table name is users and userName,password are columns. Fetching all the records and storing in a resultSet.
 
             while(resultSet.next()) // Until next row is present otherwise it return false
             {
              employee[0] = resultSet.getString(2); //fetch the values present in database
            employee[1] = resultSet.getString(3);
               employee[2]= resultSet.getString(6);
              employee[3]= resultSet.getString(7); 
             employee[4]  = resultSet.getString(8);
           employee[5] = resultSet.getString(9);
           employee[6]=resultSet.getString(10);
             }
             
             }
         catch(SQLException e){
             e.printStackTrace();
         }return(employee);
}}
            
            
         
     


