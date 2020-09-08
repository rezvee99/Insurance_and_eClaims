package InsuranceAndeClaims;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;


public class CustomerInput {
	
	//INSERT INTO `insurance`.`customer` (`First_Name`, `Last_Name`, `Email`, `Phone_Number`, `Password`, `Pin`) VALUES (?,?,?,?,?,?);

	int counter;
    public void customerInsert(String firstName,String lastName,String email,String pNumber,String password,int pin ){
    try{
            
            Connection connection = Dbconnection.dbcon();
          
            PreparedStatement ps = connection.prepareStatement("INSERT INTO `customer` (`First_Name`, `Last_Name`, `Email`, `Phone_Number`, `Password`, `Pin`) VALUES (?,?,?,?,?,?);");
             
            ps.setString(1, firstName);
            ps.setString(2, lastName);
            ps.setString(3, email);
            ps.setString(4, pNumber);
            ps.setString(5, password);
            ps.setInt(6, pin);           
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
    public void policyInsert(int policy_id,int customer_id,int Policy_Type_Code,String Start_Date,String End_Date,String condition) {
    	try {
    		Connection connection = Dbconnection.dbcon();
            
            PreparedStatement ps = connection.prepareStatement("INSERT INTO `insurance`.`policies` (`Policy_ID`, `Customer_ID`, `Policy_Type_Code`, `Start_Date`, `End_Date`, `condition`) VALUES (?, ?, ?, ?, ?, ?);");
               
            ps.setInt(1, policy_id);
            ps.setInt(2, customer_id);
            ps.setInt(3, Policy_Type_Code);
            ps.setString(4, Start_Date);
            ps.setString(5, End_Date);
            ps.setString(6, condition);           
            ps.executeUpdate();   

            JOptionPane.showMessageDialog(null,"Submited Successfully");    
            counter1=1;	
		} catch (SQLException e) {
			 JOptionPane.showMessageDialog(null,e.getMessage());
		}
    	
		
	}
	
}
