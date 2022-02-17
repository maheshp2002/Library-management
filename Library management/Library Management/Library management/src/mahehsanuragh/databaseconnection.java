/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mahehsanuragh;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author sssssssssssssss
 */
public class databaseconnection {
    
    
     static Connection con;
    
    public static Connection getConnection() {
	try
	{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/librarymanagement","root","");
            System.out.println("connected");
	}
	catch(Exception e)
	{
            System.out.println("class error: "+e.getMessage());
	}
	return con;
    }
    
}
    
    
    

