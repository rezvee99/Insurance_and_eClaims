package InsuranceAndeClaims;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

public class DeleteData {
	
	void deletePolicy(int policy_id) {
		try {
	        Connection connection = Dbconnection.dbcon();
	        PreparedStatement ps = connection.prepareStatement("DELETE FROM `insurance`.`policies` WHERE `Policy_ID`= ? ;");
	        ps.setInt(1, policy_id);
	        ps.executeUpdate();   
	       
	        JOptionPane.showMessageDialog(null, "Request Cancel");
	       }
	       catch (Exception e) {
	    	  // System.err.println(e.getMessage());
	    	   JOptionPane.showMessageDialog(null, e.getMessage());
		}
		
		
		
	}
	
	




}
