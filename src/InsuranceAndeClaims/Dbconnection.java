package InsuranceAndeClaims;
import java.sql.*;
import javax.swing.*;

public class Dbconnection {
	
	public static Connection dbcon () {
        Connection con = null;
        try{
            String userName = "root";
            String password = "root";
            String url = "jdbc:mysql://localhost/insurance";
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection(url,userName,password);
            //JOptionPane.showMessageDialog(null,"Connected");
           // System.out.println("Database Connected Succesfully");   
        }
        catch(Exception e){
           // System.out.println("Cannot connect to database");
            JOptionPane.showMessageDialog(null,"Database Connection Failed");
        }
       return con; 
    }
	
//	public static void main(String[] args) {
//		dbcon();
//	
//	}
	
}
