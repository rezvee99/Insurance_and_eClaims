package InsuranceAndeClaims;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.omg.CORBA.PRIVATE_MEMBER;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ClaimHeader extends JFrame {

	private JPanel contentPane;
	private JTextField claimDateFld;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClaimHeader frame = new ClaimHeader("",0,0,0);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	    
	    private int claimHeaderID;
	private JTextField sattlementDateFld;
	private JTextField claimAmountFld;
	private JTextField paidAmoutFld;
    private JComboBox comboBox;    
    private JComboBox comboBox_1;    
    private int claimStatusCode;
    private int claimTypeCode;
    
    
	    
	public ClaimHeader(String email,int policyID,int claimProcessingID , int claimID) {
		
		AdminOutput output = new AdminOutput();
		claimHeaderID=output.maxHeaderID()+1;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 614, 517);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(176, 224, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		claimDateFld = new JTextField();
		claimDateFld.setHorizontalAlignment(SwingConstants.LEFT);
		claimDateFld.setFont(new Font("Tahoma", Font.BOLD, 13));
		claimDateFld.setColumns(10);
		claimDateFld.setBackground(new Color(176, 224, 230));
		claimDateFld.setBounds(262, 270, 164, 24);
		contentPane.add(claimDateFld);
		
		JLabel lblClaimTypeDescription = new JLabel("Claim Type Description :");
		lblClaimTypeDescription.setHorizontalAlignment(SwingConstants.RIGHT);
		lblClaimTypeDescription.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblClaimTypeDescription.setBounds(64, 235, 170, 21);
		contentPane.add(lblClaimTypeDescription);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Select One", "Child Birth", "Handphone Subsidy", "Overtime Meal Subsidy"}));
		comboBox_1.setToolTipText("Select One\r\nDisputed\r\nIn Progress\r\nSettled");
		comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		comboBox_1.setBackground(new Color(176, 224, 230));
		comboBox_1.setBounds(262, 233, 164, 26);
		contentPane.add(comboBox_1);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select One", "Disputed", "In Progress", "Settled"}));
		comboBox.setForeground(Color.BLACK);
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 13));
		comboBox.setBackground(new Color(176, 224, 230));
		comboBox.setBounds(262, 197, 164, 26);
		contentPane.add(comboBox);
		
		JLabel lblClaimstatusdescription = new JLabel("Claim Status Description :");
		lblClaimstatusdescription.setHorizontalAlignment(SwingConstants.RIGHT);
		lblClaimstatusdescription.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblClaimstatusdescription.setBounds(54, 201, 180, 21);
		contentPane.add(lblClaimstatusdescription);
		
		JLabel label_3 = new JLabel("Claim Processing ID :");
		label_3.setHorizontalAlignment(SwingConstants.RIGHT);
		label_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_3.setBounds(82, 162, 152, 21);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel(" ");
		label_4.setText(String.valueOf(claimProcessingID));
		label_4.setHorizontalAlignment(SwingConstants.LEFT);
		label_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_4.setBounds(262, 162, 164, 21);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("0");
		label_5.setText(String.valueOf(claimID));
		label_5.setHorizontalAlignment(SwingConstants.LEFT);
		label_5.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_5.setBounds(262, 126, 164, 21);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("Claim ID :");
		label_6.setHorizontalAlignment(SwingConstants.RIGHT);
		label_6.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_6.setBounds(151, 126, 83, 21);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("Policy ID :");
		label_7.setHorizontalAlignment(SwingConstants.RIGHT);
		label_7.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_7.setBounds(151, 91, 83, 21);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("0");
		label_8.setText(String.valueOf(policyID));
		label_8.setHorizontalAlignment(SwingConstants.LEFT);
		label_8.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_8.setBounds(262, 91, 164, 21);
		contentPane.add(label_8);
		
		JLabel lblClaimHeaderForm = new JLabel("Claim Header Form");
		lblClaimHeaderForm.setHorizontalAlignment(SwingConstants.CENTER);
		lblClaimHeaderForm.setForeground(new Color(25, 25, 112));
		lblClaimHeaderForm.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblClaimHeaderForm.setBounds(202, 0, 200, 26);
		contentPane.add(lblClaimHeaderForm);
		
		JLabel label_10 = new JLabel("*****************************************************\r\n");
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setForeground(new Color(25, 25, 112));
		label_10.setBounds(167, 23, 278, 14);
		contentPane.add(label_10);
		
		JLabel lblClaimHeaderId = new JLabel("Claim Header ID :");
		lblClaimHeaderId.setHorizontalAlignment(SwingConstants.RIGHT);
		lblClaimHeaderId.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblClaimHeaderId.setBounds(110, 58, 124, 21);
		contentPane.add(lblClaimHeaderId);
		
		JLabel label_11 = new JLabel("0");
		label_11.setText(String.valueOf(claimHeaderID));
		label_11.setHorizontalAlignment(SwingConstants.LEFT);
		label_11.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_11.setBounds(262, 58, 164, 21);
		contentPane.add(label_11);
		
		sattlementDateFld = new JTextField();
		sattlementDateFld.setHorizontalAlignment(SwingConstants.LEFT);
		sattlementDateFld.setFont(new Font("Tahoma", Font.BOLD, 13));
		sattlementDateFld.setColumns(10);
		sattlementDateFld.setBackground(new Color(176, 224, 230));
		sattlementDateFld.setBounds(262, 312, 164, 24);
		contentPane.add(sattlementDateFld);
		
		claimAmountFld = new JTextField();
		claimAmountFld.setHorizontalAlignment(SwingConstants.LEFT);
		claimAmountFld.setFont(new Font("Tahoma", Font.BOLD, 13));
		claimAmountFld.setColumns(10);
		claimAmountFld.setBackground(new Color(176, 224, 230));
		claimAmountFld.setBounds(262, 351, 164, 24);
		contentPane.add(claimAmountFld);
		
		paidAmoutFld = new JTextField();
		paidAmoutFld.setHorizontalAlignment(SwingConstants.LEFT);
		paidAmoutFld.setFont(new Font("Tahoma", Font.BOLD, 13));
		paidAmoutFld.setColumns(10);
		paidAmoutFld.setBackground(new Color(176, 224, 230));
		paidAmoutFld.setBounds(262, 388, 164, 24);
		contentPane.add(paidAmoutFld);
		
		JLabel lblDateofclaim = new JLabel("Date Of Claim :");
		lblDateofclaim.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDateofclaim.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDateofclaim.setBounds(82, 271, 152, 21);
		contentPane.add(lblDateofclaim);
		
		JLabel lblDateOfSettlement = new JLabel("Date Of Settlement :");
		lblDateOfSettlement.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDateOfSettlement.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDateOfSettlement.setBounds(82, 312, 152, 21);
		contentPane.add(lblDateOfSettlement);
		
		JLabel lblAmountClaimed = new JLabel("Amount Claimed :");
		lblAmountClaimed.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAmountClaimed.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblAmountClaimed.setBounds(82, 351, 152, 21);
		contentPane.add(lblAmountClaimed);
		
		JLabel lblAmountpaid = new JLabel("Amount_Paid :\r\n");
		lblAmountpaid.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAmountpaid.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblAmountpaid.setBounds(82, 389, 152, 21);
		contentPane.add(lblAmountpaid);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String Name =(String)comboBox.getSelectedItem();
				String name1=(String)comboBox_1.getSelectedItem();
				if(Name=="Disputed")
				{
					claimStatusCode=401;
				}
				else if(Name=="In Progress")
				{
					claimStatusCode=402;
				}
				else if(Name=="Settled")
				{
					claimStatusCode=403;
					
				}
				
				
				if(name1=="Child Birth")
				{
					claimTypeCode=101;
				}
				else if(name1=="Handphone Subsidy")
				{
					claimTypeCode=102;
				}
				else if(name1=="Overtime Meal Subsidy")
				{
					claimTypeCode=103;
					
				}
				
				String dateOfClaim=claimDateFld.getText();
				String dateOfSattlement=sattlementDateFld.getText();
				int claimAmount=Integer.valueOf(claimAmountFld.getText()) ;
				int paidAmount = Integer.valueOf(paidAmoutFld.getText());
				
				AdministratorInput ob=new AdministratorInput();
				ob.claimHeader(claimHeaderID, claimStatusCode, claimTypeCode, policyID, dateOfClaim, dateOfSattlement, claimAmount, paidAmount, claimProcessingID, claimID);
				
				if(ob.counter3==1)
				{
					UpdateData update = new UpdateData();
					update.UpdatePolicyCondition(policyID);
					
					PendingRequest obj=new PendingRequest(email);
					obj.setVisible(true);
					dispose();
					
				}
								
			}
		});
		btnSubmit.setForeground(new Color(255, 255, 204));
		btnSubmit.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSubmit.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnSubmit.setBackground(new Color(0, 0, 51));
		btnSubmit.setBounds(282, 431, 89, 23);
		contentPane.add(btnSubmit);
		
		
		
	}
}
