package InsuranceAndeClaims;
import java.sql.*;

import javax.swing.JOptionPane;




public class AdminOutput {
	
	String Administrator_Name,Administrator_Email,Phone_Number,AdministratorPassword;
	int pin;
	int Administration_Id;
	
	
	
	
	public void Output(String Email)  {
    	try {
        Connection conn = Dbconnection.dbcon();
        Statement statement = conn.createStatement();
        
        ResultSet rs = statement.executeQuery("SELECT * FROM `administration` WHERE `Administrator_Email` LIKE '"+Email+"'");
 
        while(rs.next()){
        	AdministratorPassword = rs.getString("AdministratorPassword");
            Administration_Id=rs.getInt("Administration_Id");
            Administrator_Email = rs.getString("Administrator_Email");
            pin= rs.getInt("Pin");
            Administrator_Name = rs.getString("Administrator_Name");
            Phone_Number = rs.getString("Phone_Number");
        }
        conn.close();
    	}
    	catch (Exception e) {
    		//System.err.println(e.getMessage());
    		JOptionPane.showMessageDialog(null,e.getMessage());
		}
    }
	
	
	
	private int claim_id;
	public int maxClaimId() {
		try {
	        Connection conn = Dbconnection.dbcon();
	        Statement statement = conn.createStatement();
	        
	        ResultSet rs = statement.executeQuery("SELECT max(claims_document.Claim_ID) FROM claims_document");
	 
	        while(rs.next()){
	        	claim_id=rs.getInt("max(claims_document.Claim_ID)"); 
	        }
	        conn.close();
	    	}
	    	catch (Exception e) {
	    		JOptionPane.showMessageDialog(null,e.getMessage());
			}	
		return claim_id;		
	}
	
	
	private int claim_processing_ID;
	public int maxProcessingID() {
		try {
	        Connection conn = Dbconnection.dbcon();
	        Statement statement = conn.createStatement();
	        
	        ResultSet rs = statement.executeQuery("SELECT max(claims_processing.Claim_Processing_ID) FROM claims_processing");
	 
	        while(rs.next()){
	        	claim_processing_ID=rs.getInt("max(claims_processing.Claim_Processing_ID)"); 
	        }
	        conn.close();
	    	}
	    	catch (Exception e) {
	    		JOptionPane.showMessageDialog(null,e.getMessage());
			}
		
		
		
		
		return claim_processing_ID ;
	}
	
	

	private int claim_header_ID;
	public int maxHeaderID() {
		try {
	        Connection conn = Dbconnection.dbcon();
	        Statement statement = conn.createStatement();
	        
	        ResultSet rs = statement.executeQuery("SELECT max(claim_headers.Claim_Header_ID) FROM claim_headers");
	 
	        while(rs.next()){
	        	claim_header_ID=rs.getInt("max(claim_headers.Claim_Header_ID)"); 
	        }
	        conn.close();
	    	}
	    	catch (Exception e) {
	    		JOptionPane.showMessageDialog(null,e.getMessage());
			}	
		
		return claim_header_ID ;
	}
	
	

}
