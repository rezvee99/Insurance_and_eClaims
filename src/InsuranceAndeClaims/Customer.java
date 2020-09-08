package InsuranceAndeClaims;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.net.ssl.HostnameVerifier;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Customer extends JFrame {

	
	private JPanel contentPane;
	public String name;
	JLabel namelb ;
	private int p_ID;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Customer frame = new Customer("");
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
	public Customer(String email) {
		setTitle("Customer Page\r\n");
		CustomerOutput ob1 = new CustomerOutput();
		ob1.Output(email);
		p_ID=ob1.p_id(ob1.customerId);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 664, 412);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnProfile = new JButton("Home");
		btnProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomePage2 obj1=new HomePage2(email, "cust");
				obj1.setVisible(true);
				dispose();
				
				
			}
		});
		btnProfile.setFocusPainted(false);
		btnProfile.setBackground(new Color(0, 0, 51));
		btnProfile.setForeground(new Color(255, 255, 204));
		btnProfile.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnProfile.setBounds(0, 5, 89, 23);
		contentPane.add(btnProfile);
		
		JButton btnLogOut = new JButton("Logout");
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				LogInPage obj = new LogInPage();
				obj.setVisible(true);
				dispose();
			}
		});
		btnLogOut.setForeground(new Color(255, 255, 204));
		btnLogOut.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnLogOut.setFocusPainted(false);
		btnLogOut.setBackground(Color.BLACK);
		btnLogOut.setBounds(551, 5, 89, 23);
		contentPane.add(btnLogOut);
		
		JButton btnP = new JButton("Payment History");
		
		btnP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PaymentHistory obj=new PaymentHistory(email,ob1.customerId);
				obj.setVisible(true);
				dispose();
			}
		});
		btnP.setForeground(new Color(255, 255, 204));
		btnP.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnP.setFocusPainted(false);
		btnP.setBackground(Color.BLACK);
		btnP.setBounds(385, 5, 141, 23);
		contentPane.add(btnP);
		
		JButton button = new JButton("Profile");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CustomerProfile obj= new CustomerProfile(email);
				obj.setVisible(true);
				dispose();
				
				
			}
		});
		
		namelb = new JLabel("");
		namelb.setText(ob1.firstName+" "+ob1.lastName);
		namelb.setFont(new Font("Tahoma", Font.BOLD, 14));
		namelb.setForeground(Color.WHITE);
		namelb.setHorizontalAlignment(SwingConstants.CENTER);
		namelb.setBounds(451, 43, 189, 24);
		contentPane.add(namelb);
		button.setForeground(new Color(255, 255, 204));
		button.setFont(new Font("Tahoma", Font.BOLD, 12));
		button.setFocusPainted(false);
		button.setBackground(Color.BLACK);
		button.setBounds(116, 5, 89, 23);
		contentPane.add(button);
		
		JButton btnClaimLoan = new JButton("Apply For Loan");
		btnClaimLoan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				if(p_ID==0) {
				ApplyForLoan obj=new ApplyForLoan(email);
					obj.setVisible(true);	
					dispose();
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Already you have loan or your request Pending");
				}
				
			}
		});
		btnClaimLoan.setForeground(new Color(255, 255, 204));
		btnClaimLoan.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnClaimLoan.setFocusPainted(false);
		btnClaimLoan.setBackground(new Color(0, 0, 51));
		btnClaimLoan.setBounds(226, 5, 132, 23);
		contentPane.add(btnClaimLoan);
		
		JLabel lblTitellabel = new JLabel("");
		lblTitellabel.setBounds(0,0, 646, 70);
		lblTitellabel.setIcon(new ImageIcon(HomePage.class.getResource("TitelPic.jpg")));
		contentPane.add(lblTitellabel);
	}
}
