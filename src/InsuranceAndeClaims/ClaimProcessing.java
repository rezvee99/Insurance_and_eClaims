package InsuranceAndeClaims;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ClaimProcessing extends JFrame {

	private JPanel contentPane;
	private JLabel lblPolicyId;
	private JLabel label_1;
    private JLabel label_3;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClaimProcessing frame = new ClaimProcessing("",0,0);
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
	
	private int processingId;
	private JLabel lblClaimProcessingId;
	private JLabel processing;
	private JLabel lblClaimOutcome;
	private JComboBox comboBox_1;
	private JLabel lblStaffId;
	private JTextField textField;
	private JLabel lblNewLabel;
	private int claimOutput;
	private int claimStage;
	
	
	
	
	public ClaimProcessing(String email,int policyID,int claimID) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 614, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(176, 224, 230));
		contentPane.setForeground(Color.RED);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		AdminOutput output=new AdminOutput();
		processingId=output.maxProcessingID()+1;
		
		
		JLabel lblClaimProcessingForm = new JLabel("Claim Processing Form");
		lblClaimProcessingForm.setHorizontalAlignment(SwingConstants.CENTER);
		lblClaimProcessingForm.setForeground(new Color(0, 128, 0));
		lblClaimProcessingForm.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblClaimProcessingForm.setBounds(201, 11, 200, 26);
		contentPane.add(lblClaimProcessingForm);
		
		lblPolicyId = new JLabel("Policy ID :");
		lblPolicyId.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPolicyId.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPolicyId.setBounds(126, 108, 83, 21);
		contentPane.add(lblPolicyId);
		
		label_1 = new JLabel("0");
		label_1.setText(String.valueOf(policyID));
		label_1.setHorizontalAlignment(SwingConstants.LEFT);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_1.setBounds(237, 108, 177, 21);
		contentPane.add(label_1);
		
		JLabel lblClaimId = new JLabel("Claim ID :");
		lblClaimId.setHorizontalAlignment(SwingConstants.RIGHT);
		lblClaimId.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblClaimId.setBounds(126, 147, 83, 21);
		contentPane.add(lblClaimId);
		
		label_3 = new JLabel(" ");
		label_3.setText(String.valueOf(claimID));
		label_3.setHorizontalAlignment(SwingConstants.LEFT);
		label_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_3.setBounds(237, 147, 177, 21);
		contentPane.add(label_3);
		
		lblClaimProcessingId = new JLabel("Claim Processing ID :");
		lblClaimProcessingId.setHorizontalAlignment(SwingConstants.RIGHT);
		lblClaimProcessingId.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblClaimProcessingId.setBounds(57, 185, 152, 21);
		contentPane.add(lblClaimProcessingId);
		
		processing = new JLabel(" ");
		processing.setText(String.valueOf(processingId));
		processing.setHorizontalAlignment(SwingConstants.LEFT);
		processing.setFont(new Font("Tahoma", Font.BOLD, 13));
		processing.setBounds(237, 185, 177, 21);
		contentPane.add(processing);
		
		lblClaimOutcome = new JLabel("Claim Outcome Description :");
		lblClaimOutcome.setHorizontalAlignment(SwingConstants.RIGHT);
		lblClaimOutcome.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblClaimOutcome.setBounds(29, 234, 180, 21);
		contentPane.add(lblClaimOutcome);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setForeground(new Color(0, 0, 0));
		comboBox.setBackground(new Color(176, 224, 230));
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 13));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select One", "Disputed", "In Progress", "Settled"}));
		comboBox.setBounds(237, 230, 164, 26);
		contentPane.add(comboBox);
		
		JLabel lblClaimStatusDescription = new JLabel("Claim Status Name\r\n :");
		lblClaimStatusDescription.setHorizontalAlignment(SwingConstants.RIGHT);
		lblClaimStatusDescription.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblClaimStatusDescription.setBounds(29, 280, 180, 21);
		contentPane.add(lblClaimStatusDescription);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setBackground(new Color(176, 224, 230));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Select One", "Disputed", "In Progress", "Settled"}));
		comboBox_1.setToolTipText("Select One\r\nDisputed\r\nIn Progress\r\nSettled");
		comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		comboBox_1.setBounds(237, 278, 164, 26);
		contentPane.add(comboBox_1);
		
		lblStaffId = new JLabel("Staff ID :");
		lblStaffId.setHorizontalAlignment(SwingConstants.RIGHT);
		lblStaffId.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblStaffId.setBounds(57, 322, 152, 21);
		contentPane.add(lblStaffId);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 13));
		textField.setBackground(new Color(176, 224, 230));
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		textField.setBounds(237, 321, 164, 24);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Name = (String)comboBox.getSelectedItem();
				String name1=(String)comboBox_1.getSelectedItem();
				if(Name=="Disputed")
				{
					claimOutput=201;
				}
				else if(Name=="In Progress")
				{
					claimOutput=202;
				}
				else if(Name=="Settled")
				{
					claimOutput=203;
					
				}
				
				
				if(name1=="Disputed")
				{
					claimStage=1;
				}
				else if(name1=="In Progress")
				{
					claimStage=2;
				}
				else if(name1=="Settled")
				{
					claimStage=3;
					
				}
				
				AdministratorInput input=new AdministratorInput();
				input.claimProcessing(processingId, claimID, claimOutput, claimStage, Integer.valueOf(textField.getText()));
				
				if(input.counter2==1)
				{
					ClaimHeader obj=new ClaimHeader(email, policyID, processingId, claimID);
					obj.setVisible(true);
					dispose();			
				}
				
				
				
			
			}
		});
		btnNext.setForeground(new Color(255, 255, 204));
		btnNext.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNext.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnNext.setBackground(new Color(0, 0, 51));
		btnNext.setBounds(254, 376, 89, 23);
		contentPane.add(btnNext);
		
		lblNewLabel = new JLabel("*****************************************************\r\n");
		lblNewLabel.setForeground(new Color(34, 139, 34));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(149, 34, 306, 14);
		contentPane.add(lblNewLabel);
	}
}
