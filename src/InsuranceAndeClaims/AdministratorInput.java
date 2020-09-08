package InsuranceAndeClaims;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;


public class AdministratorInput {
	
	//INSERT INTO `insurance`.`customer` (`First_Name`, `Last_Name`, `Email`, `Phone_Number`, `Password`, `Pin`) VALUES (?,?,?,?,?,?);

	Connection connection = Dbconnection.dbcon();
	int counter;
    public void adminInsert(String firstName,String email,String pNumber,String password,int pin ){
    try{         
            PreparedStatement ps = connection.prepareStatement("INSERT INTO `administration` (`Administrator_Name`, `Administrator_Email`, `AdministratorPassword`, `Phone_Number`, `Pin`) VALUES (?,?,?,?,?);");
             
            ps.setString(1, firstName);
            ps.setString(2, email);
            ps.setString(4, pNumber);
            ps.setString(3, password);
            ps.setInt(5, pin);           
            ps.executeUpdate();   
           // System.out.println("Inserted");
            JOptionPane.showMessageDialog(null,"Sign Up Successfully");    
            counter=1;
        }catch(SQLException e){
            //System.err.println(e.getMessage());
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }
	
    
    
    int counter1;
    public void claimDocument(int Claim_ID,int Document_Type_Code,int Created_by_Staff_ID,String Created_Date) {
    	try {
    		Connection connection = Dbconnection.dbcon();
            
            PreparedStatement ps = connection.prepareStatement("INSERT INTO `insurance`.`claims_document` (`Claim_ID`, `Document_Type_Code`, `Created_by_Staff_ID`, `Created_Date`) VALUES (?,?,?,?);");
               
            ps.setInt(1, Claim_ID);
            ps.setInt(2, Document_Type_Code);
            ps.setInt(3, Created_by_Staff_ID);
            ps.setString(4, Created_Date);     
            
            ps.executeUpdate();   

            //JOptionPane.showMessageDialog(null,"Submited Successfully");    
            counter1=1;	
		} catch (SQLException e) {
			 JOptionPane.showMessageDialog(null,e.getMessage());
		}
    	
		
	}
    
    
    
    //INSERT INTO `insurance`.`claims_processing` (`Claim_Processing_ID`, `Claim_ID`, `Claim_Outcome_Code`, `Claim_Stage_ID`, `Staff_ID`) VALUES (?, ?, ?, ?, ?);
    int counter2;
    public void claimProcessing(int Claim_Processing_ID,int Claim_ID,int Claim_Outcome_Code,int Claim_Stage_ID,int Staff_ID)
    {
    	try {
    		Connection connection = Dbconnection.dbcon();
            
            PreparedStatement ps = connection.prepareStatement("INSERT INTO `insurance`.`claims_processing` (`Claim_Processing_ID`, `Claim_ID`, `Claim_Outcome_Code`, `Claim_Stage_ID`, `Staff_ID`) VALUES (?, ?, ?, ?, ?);");
               
            ps.setInt(1, Claim_Processing_ID);
            ps.setInt(2, Claim_ID);
            ps.setInt(3, Claim_Outcome_Code);
            ps.setInt(4, Claim_Stage_ID);     
            ps.setInt(5,  Staff_ID);
            ps.executeUpdate();   
            //JOptionPane.showMessageDialog(null,"Submited Successfully");    
            counter2=1;	
		} catch (SQLException e) {
			 JOptionPane.showMessageDialog(null,e.getMessage());
		}
   	
    }
    
    
    
    
    
    //INSERT INTO `insurance`.`claim_headers` (`Claim_Header_ID`, `Claim_Status_Code`, `Claim_Type_Code`, `Policy_ID`, `Date_Of_Claim`, `Date_Of_Settlement`, `Amount_Claimed`, `Amount_Paid`, `Claim_Processing_ID`, `Claim_ID`) VALUES (?, ?, ?, ?,?, ?, ?, ?, ?, ?);
     int counter3;
     public void claimHeader(int Claim_Header_ID,int Claim_Status_Code,int Claim_Type_Code,int Policy_ID ,String Date_Of_Claim ,String Date_Of_Settlement,int Amount_Claimed ,int Amount_Paid,int Claim_Processing_ID,int Claim_ID)
     {
    	 
    	 try {
     		Connection connection = Dbconnection.dbcon();
             
             PreparedStatement ps = connection.prepareStatement("INSERT INTO `insurance`.`claim_headers` (`Claim_Header_ID`, `Claim_Status_Code`, `Claim_Type_Code`, `Policy_ID`, `Date_Of_Claim`, `Date_Of_Settlement`, `Amount_Claimed`, `Amount_Paid`, `Claim_Processing_ID`, `Claim_ID`) VALUES (?, ?, ?, ?,?, ?, ?, ?, ?, ?);");
                
             ps.setInt(1, Claim_Header_ID);
             ps.setInt(2, Claim_Status_Code);
             ps.setInt(3, Claim_Type_Code);
             ps.setInt(4, Policy_ID);     
             ps.setString(5,  Date_Of_Claim);
             ps.setString(6, Date_Of_Settlement);
             ps.setInt(7, Amount_Claimed);
             ps.setInt(8, Amount_Paid);
             ps.setInt(9, Claim_Processing_ID);
             ps.setInt(10, Claim_ID);
             ps.executeUpdate();   
             //JOptionPane.showMessageDialog(null,"Submited Successfully");    
             counter3=1;	
 		} catch (SQLException e) {
 			 JOptionPane.showMessageDialog(null,e.getMessage());
 		}
    	 	 
     }
    
}
