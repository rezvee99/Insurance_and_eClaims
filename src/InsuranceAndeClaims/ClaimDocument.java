package InsuranceAndeClaims;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class ClaimDocument extends JFrame {

	private JPanel contentPane;
	private JTextField stuffId;
	private JTextField date;
	private int claimId;
    private int tCode;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClaimDocument frame = new ClaimDocument("",0);
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
	public ClaimDocument(String email ,int policyID) {
		setTitle("Claim Document Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 537, 417);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(176, 224, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		AdminOutput ob=new AdminOutput();
		
		claimId=ob.maxClaimId();
		
		claimId=claimId+1;
		
		
		
		JLabel lblNewLabel = new JLabel("Claim documnet Form");
		lblNewLabel.setForeground(new Color(25, 25, 112));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(143, 11, 200, 26);
		contentPane.add(lblNewLabel);
		
		JLabel lblClaimId = new JLabel("Claim Id :");
		lblClaimId.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblClaimId.setHorizontalAlignment(SwingConstants.RIGHT);
		lblClaimId.setBounds(94, 118, 83, 21);
		contentPane.add(lblClaimId);
		
		JLabel lblDocumentType = new JLabel("Document Type :");
		lblDocumentType.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDocumentType.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDocumentType.setBounds(28, 160, 149, 21);
		contentPane.add(lblDocumentType);
		
		JLabel lblCreatedByStuff = new JLabel("Created By Stuff Id :");
		lblCreatedByStuff.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCreatedByStuff.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCreatedByStuff.setBounds(28, 208, 149, 21);
		contentPane.add(lblCreatedByStuff);
		
		JLabel lblDate = new JLabel("Create Date :");
		lblDate.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDate.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDate.setBounds(80, 256, 97, 21);
		contentPane.add(lblDate);
		
		JLabel claim_id = new JLabel("");
		claim_id.setText(String.valueOf(claimId));
		claim_id.setHorizontalAlignment(SwingConstants.LEFT);
		claim_id.setFont(new Font("Tahoma", Font.BOLD, 13));
		claim_id.setBounds(205, 118, 177, 21);
		contentPane.add(claim_id);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(176, 224, 230));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select one", "Assessors Report", "Medical Report"}));
		comboBox.setBounds(205, 161, 177, 20);
		contentPane.add(comboBox);
		
		
		
		
		stuffId = new JTextField();
		stuffId.setBackground(new Color(176, 224, 230));
		stuffId.setFont(new Font("Tahoma", Font.PLAIN, 13));
		stuffId.setBounds(205, 208, 177, 21);
		contentPane.add(stuffId);
		stuffId.setColumns(10);
		
		date = new JTextField();
		date.setBackground(new Color(176, 224, 230));
		date.setFont(new Font("Tahoma", Font.PLAIN, 13));
		date.setBounds(205, 256, 177, 21);
		contentPane.add(date);
		date.setColumns(10);
		
		JButton next = new JButton("Next");
		next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Name = (String)comboBox.getSelectedItem();
				if(Name=="Assessors Report")
				{
					tCode=401;
				}
				if(Name=="Medical Report")
				{
					tCode=402;
				}
				
				AdministratorInput input=new AdministratorInput();
				input.claimDocument(claimId, tCode,Integer.valueOf(stuffId.getText()) ,date.getText());
				
				
				if (input.counter1==1) {
					ClaimProcessing ob=new ClaimProcessing(email, policyID, claimId);
					ob.setVisible(true);
					dispose();
						
				}
				
				
				
			}
		});
		next.setForeground(new Color(255, 255, 204));
		next.setFont(new Font("Tahoma", Font.BOLD, 12));
		next.setFocusPainted(false);
		next.setBackground(new Color(0, 0, 51));
		next.setBounds(242, 310, 88, 23);
		contentPane.add(next);
		
		JLabel Poly = new JLabel("Policy Id :");
		Poly.setHorizontalAlignment(SwingConstants.RIGHT);
		Poly.setFont(new Font("Tahoma", Font.BOLD, 13));
		Poly.setBounds(94, 79, 83, 21);
		contentPane.add(Poly);
		
		JLabel polyshow = new JLabel("1");
		polyshow.setText(String.valueOf(policyID));
		polyshow.setHorizontalAlignment(SwingConstants.LEFT);
		polyshow.setFont(new Font("Tahoma", Font.BOLD, 13));
		polyshow.setBounds(205, 79, 177, 21);
		contentPane.add(polyshow);
		
		JLabel label = new JLabel("*******************************************\r\n");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(new Color(25, 25, 112));
		label.setBounds(104, 34, 278, 14);
		contentPane.add(label);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PendingRequest obj=new PendingRequest(email);
				obj.setVisible(true);
				dispose();
			}
		});
		btnBack.setForeground(new Color(255, 255, 204));
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnBack.setFocusPainted(false);
		btnBack.setBackground(new Color(0, 0, 51));
		btnBack.setBounds(3, 12, 88, 23);
		contentPane.add(btnBack);
	}
}
