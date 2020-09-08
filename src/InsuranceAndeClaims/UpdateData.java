package InsuranceAndeClaims;

import java.security.Policy;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;


public class UpdateData {
	
//UPDATE `in`.`customer` SET `Password`='544' WHERE `Customer_Id`='1' and`Email`='mdre';

	public void updatePassword(String password, String email) {
		try {
	        Connection connection = Dbconnection.dbcon();
	        PreparedStatement ps = connection.prepareStatement("UPDATE `customer` SET `Password` = ? WHERE `customer`.`Email` = ?");
	        ps.setString(1, password);
	        ps.setString(2, email);
	        ps.executeUpdate();   
	        //System.out.println("updated success");
	        JOptionPane.showMessageDialog(null, "Updated success!!");
	       }
	       catch (Exception e) {
	    	  // System.err.println(e.getMessage());
	    	   JOptionPane.showMessageDialog(null, e.getMessage());
		}
		
	}
	
    public void updatePasswordA(String password, String email) {
    	
    	try {
	        Connection connection = Dbconnection.dbcon();
	        PreparedStatement ps = connection.prepareStatement("UPDATE `administration` SET `AdministratorPassword` = ? WHERE `administration`.`Administrator_Email` = ?");
	        ps.setString(1, password);
	        ps.setString(2, email);
	        ps.executeUpdate();   
	        //System.out.println("updated success");
	        JOptionPane.showMessageDialog(null, "Updated success!!");
	       }
	       catch (Exception e) {
	    	  // System.err.println(e.getMessage());
	    	   JOptionPane.showMessageDialog(null, e.getMessage());
		}
		
		
	}
    
    
    
    public void UpdatePolicyCondition(int PolicyID)
    {
    	try {
	        Connection connection = Dbconnection.dbcon();
	        PreparedStatement ps = connection.prepareStatement("UPDATE `insurance`.`policies` SET `condition`='No' WHERE `Policy_ID`= ? ;" );
	        ps.setInt(1, PolicyID);
	        ps.executeUpdate();   
	        //System.out.println("updated success");
	        JOptionPane.showMessageDialog(null, "Updated success!!");
	       }
	       catch (Exception e) {
	    	  // System.err.println(e.getMessage());
	    	   JOptionPane.showMessageDialog(null, e.getMessage());
		}
    	
    	
    }
	

}
