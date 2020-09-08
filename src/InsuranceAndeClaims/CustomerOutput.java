package InsuranceAndeClaims;
import java.sql.*;

import javax.swing.JOptionPane;

import org.omg.CORBA.PRIVATE_MEMBER;




public class CustomerOutput {
	
	String firstName,lastName,email,pNumber,password;
	int pin;
	int customerId;
	
	//First_Name`, `Last_Name`, `Email`, `Phone_Number`, `Password`, `Pin`
	
	
	
	
	public void Output(String Email)  {
    	try {
        Connection conn = Dbconnection.dbcon();
        Statement statement = conn.createStatement();
        
        ResultSet rs = statement.executeQuery("SELECT * FROM `Customer` WHERE `Email` LIKE '"+Email+"'");
 
        while(rs.next()){
            password = rs.getString("Password");
            customerId=rs.getInt("Customer_Id");
            email = rs.getString("email");
            pin= rs.getInt("Pin");
            firstName = rs.getString("First_Name");
            lastName = rs.getString("Last_Name");
            pNumber = rs.getString("Phone_Number");
        }
        conn.close();
    	}
    	catch (Exception e) {
    		JOptionPane.showMessageDialog(null,e.getMessage());
		}
    }
	private int Policy_id;
	public int police_Id() {
		try {
	        Connection conn = Dbconnection.dbcon();
	        Statement statement = conn.createStatement();
	        
	        ResultSet rs = statement.executeQuery("SELECT max(policies.Policy_ID) FROM policies");
	 
	        while(rs.next()){
	        	Policy_id=rs.getInt("max(policies.Policy_ID)"); 
	        }
	        conn.close();
	    	}
	    	catch (Exception e) {
	    		JOptionPane.showMessageDialog(null,e.getMessage());
			}	
		return Policy_id;		
	}
	
	
	
	
	private int id;
	public int p_id(int C_ID) {
		
		try {
	        Connection conn = Dbconnection.dbcon();
	        Statement statement = conn.createStatement();
	        
	        ResultSet rs = statement.executeQuery("SELECT policies.Policy_ID from policies where policies.Customer_ID= "+C_ID);
	 
	        while(rs.next()){
	        	id=rs.getInt("policies.Policy_ID"); 
	        }
	        conn.close();
	    	}
	    	catch (Exception e) {
	    		JOptionPane.showMessageDialog(null,e.getMessage());
			}	
		return id;
		
	}
	
	
	

	//select claim_headers.Amount_Claimed ,claim_headers.Amount_Paid from claim_headers join policies on claim_headers.Policy_ID=policies.Policy_ID join customer on policies.Customer_Id=customer.Customer_Id  where customer.Customer_Id=2
	protected int claimAmout,paid;
	
   public void customerPayment(int custID) {
	   try {
	        Connection conn = Dbconnection.dbcon();
	        Statement statement = conn.createStatement();
	        
	        ResultSet rs = statement.executeQuery("select claim_headers.Amount_Claimed ,claim_headers.Amount_Paid from claim_headers join policies on claim_headers.Policy_ID=policies.Policy_ID join customer on policies.Customer_Id=customer.Customer_Id  where customer.Customer_Id="+custID);
	 
	        while(rs.next()){
	        	claimAmout=rs.getInt("claim_headers.Amount_Claimed"); 
	        	paid=rs.getInt("claim_headers.Amount_Paid");
	        }
	        conn.close();
	    	}
	    	catch (Exception e) {
	    		JOptionPane.showMessageDialog(null,e.getMessage());
			}	
    }
   
	
	
	

}
