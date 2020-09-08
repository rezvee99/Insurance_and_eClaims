package InsuranceAndeClaims;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class AdministratorProfile extends JFrame {

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
					AdministratorProfile frame = new AdministratorProfile("");
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
	public AdministratorProfile(String email) {
		setTitle("Administrator Profile");
		//System.out.println("profile page "+email);
		AdminOutput ob=new AdminOutput();
		this.email=email;
		ob.Output(email);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 672, 412);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblStudentProfile = new JLabel("Administrator Profile");
		lblStudentProfile.setHorizontalAlignment(SwingConstants.CENTER);
		lblStudentProfile.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblStudentProfile.setForeground(new Color(0, 0, 0));
		lblStudentProfile.setBounds(229, 11, 215, 32);
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
				Administrator obj=new Administrator(email);
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
		lblName.setBounds(150, 104, 89, 14);
		contentPane.add(lblName);
		
		namelv = new JLabel(" ");
		namelv.setText(ob.Administrator_Name);
		namelv.setFont(new Font("Tahoma", Font.BOLD, 12));
		namelv.setBounds(257, 104, 288, 14);
		contentPane.add(namelv);
		
		JLabel lblId = new JLabel("ID : ");
		lblId.setHorizontalAlignment(SwingConstants.RIGHT);
		lblId.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblId.setBounds(118, 74, 118, 14);
		contentPane.add(lblId);
		
		idlv = new JLabel("");
		idlv.setText(String.valueOf(ob.Administration_Id));
		idlv.setFont(new Font("Tahoma", Font.BOLD, 12));
		idlv.setBounds(254, 74, 169, 14);
		contentPane.add(idlv);
		
		JLabel lblEmail = new JLabel("Email :");
		lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEmail.setBounds(146, 138, 89, 14);
		contentPane.add(lblEmail);
		
		emaillv = new JLabel("");
		emaillv.setText(ob.Administrator_Email);
		emaillv.setFont(new Font("Tahoma", Font.BOLD, 12));
		emaillv.setBounds(256, 139, 300, 14);
		contentPane.add(emaillv);
		
		JLabel lblSection = new JLabel("Pin: ");
		lblSection.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSection.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSection.setBounds(156, 166, 79, 14);
		contentPane.add(lblSection);
		
		Pinlv = new JLabel("");
		Pinlv.setText(String.valueOf(ob.pin));
		Pinlv.setFont(new Font("Tahoma", Font.BOLD, 12));
		Pinlv.setBounds(257, 166, 281, 14);
		contentPane.add(Pinlv);
		
		JLabel lblPhoneNo = new JLabel("Phone No :");
		lblPhoneNo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPhoneNo.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPhoneNo.setBounds(122, 196, 113, 14);
		contentPane.add(lblPhoneNo);
		
		phonelv = new JLabel("");
		phonelv.setText(ob.Phone_Number);
		phonelv.setHorizontalAlignment(SwingConstants.LEFT);
		phonelv.setFont(new Font("Tahoma", Font.BOLD, 12));
		phonelv.setBounds(258, 196, 329, 14);
		contentPane.add(phonelv);
		
		JLabel label = new JLabel("**************************************************");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(188, 40, 300, 14);
		contentPane.add(label);
		
		
	}
}
