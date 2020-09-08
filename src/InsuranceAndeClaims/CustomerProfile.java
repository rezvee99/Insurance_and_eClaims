package InsuranceAndeClaims;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class CustomerProfile extends JFrame {

	private JPanel contentPane;
	//String email="mdrezvee@gmail.com";
	String email;
	JLabel namelv;
	JLabel idlv;
	JLabel emaillv;
	JLabel Pinlv;
	JLabel phonelv;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerProfile frame = new CustomerProfile("");
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
	public CustomerProfile(String email) {
		//System.out.println("profile page "+email);
		CustomerOutput ob=new CustomerOutput();
		
		
		this.email=email;
		ob.Output(email);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 672, 412);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblStudentProfile = new JLabel("Customer Profile");
		lblStudentProfile.setHorizontalAlignment(SwingConstants.CENTER);
		lblStudentProfile.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblStudentProfile.setForeground(new Color(0, 0, 0));
		lblStudentProfile.setBounds(218, 11, 215, 32);
		contentPane.add(lblStudentProfile);
		
		JButton btnHome = new JButton("Log Out");
		btnHome.setBackground(new Color(0, 0, 51));
		btnHome.setForeground(new Color(255, 255, 204));
		btnHome.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomePage obj = new HomePage();
				obj.setVisible(true);
				dispose();
			}
		});
		
		JButton btnBack = new JButton("Back");
		btnBack.setFocusPainted(false);
		btnBack.setForeground(new Color(255, 255, 204));
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnBack.setBackground(new Color(0, 0, 51));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Customer obj=new Customer(email);
				obj.setVisible(true);
				dispose();
				
			}
		});
		btnBack.setBounds(10, 18, 89, 23);
		contentPane.add(btnBack);
		btnHome.setBounds(11, 51, 89, 23);
		contentPane.add(btnHome);
		
		JLabel lblName = new JLabel("Name :");
		lblName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblName.setBounds(144, 106, 89, 14);
		contentPane.add(lblName);
		
		namelv = new JLabel(" ");
		
		namelv.setFont(new Font("Tahoma", Font.BOLD, 12));
		namelv.setText("");
		namelv.setText(ob.firstName+" "+ob.lastName);
		namelv.setBounds(251, 106, 288, 14);
		contentPane.add(namelv);
		
		JLabel lblId = new JLabel("Customer ID : ");
		lblId.setHorizontalAlignment(SwingConstants.RIGHT);
		lblId.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblId.setBounds(118, 75, 118, 14);
		contentPane.add(lblId);
		
		idlv = new JLabel("");
		idlv.setText(String.valueOf(ob.customerId));
		idlv.setFont(new Font("Tahoma", Font.BOLD, 12));
		idlv.setBounds(254, 75, 169, 14);
		contentPane.add(idlv);
		
		JLabel lblEmail = new JLabel("Email :");
		lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEmail.setBounds(146, 141, 89, 14);
		contentPane.add(lblEmail);
		
		emaillv = new JLabel("");
		emaillv.setText(ob.email);
		emaillv.setFont(new Font("Tahoma", Font.BOLD, 12));
		emaillv.setBounds(256, 141, 300, 14);
		contentPane.add(emaillv);
		
		JLabel lblSection = new JLabel("Pin: ");
		lblSection.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSection.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSection.setBounds(91, 166, 144, 14);
		contentPane.add(lblSection);
		
		Pinlv = new JLabel("");
		Pinlv.setText(String.valueOf(ob.pin));
		Pinlv.setFont(new Font("Tahoma", Font.BOLD, 12));
		Pinlv.setBounds(257, 166, 281, 14);
		contentPane.add(Pinlv);
		
		JLabel lblPhoneNo = new JLabel("Phone No :");
		lblPhoneNo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPhoneNo.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPhoneNo.setBounds(74, 196, 161, 14);
		contentPane.add(lblPhoneNo);
		
		phonelv = new JLabel("");
		phonelv.setText(ob.pNumber);
		phonelv.setHorizontalAlignment(SwingConstants.LEFT);
		phonelv.setFont(new Font("Tahoma", Font.BOLD, 12));
		phonelv.setBounds(258, 196, 329, 14);
		contentPane.add(phonelv);
		
		JLabel label = new JLabel("***************************************");
		label.setBounds(220, 40, 272, 14);
		contentPane.add(label);
		
		
	}
}
