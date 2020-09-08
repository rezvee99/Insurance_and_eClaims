package InsuranceAndeClaims;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class SignUpPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUpPage frame = new SignUpPage("H");
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
	public SignUpPage(String bac) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 502);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton CustomerSignUp = new JButton("Customer Signup");
		CustomerSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CustomerSignUp obj=new CustomerSignUp();
				obj.setVisible(true);
				dispose();
			}
		});
		CustomerSignUp.setForeground(new Color(255, 255, 153));
		CustomerSignUp.setFont(new Font("Tahoma", Font.BOLD, 12));
		CustomerSignUp.setBackground(new Color(102, 51, 51));
		CustomerSignUp.setBounds(230, 217, 175, 35);
		contentPane.add(CustomerSignUp);
		
		JButton btnAdministration = new JButton("Administrator Signup");
		btnAdministration.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AdministratorSignup obj=new AdministratorSignup();
				obj.setVisible(true);
				dispose();
				
			}
		});
		btnAdministration.setForeground(new Color(255, 255, 153));
		btnAdministration.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAdministration.setBackground(new Color(102, 51, 51));
		btnAdministration.setBounds(230, 277, 175, 35);
		contentPane.add(btnAdministration);
		
		JLabel lblSignup = new JLabel("Signup");
		lblSignup.setHorizontalAlignment(SwingConstants.CENTER);
		lblSignup.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblSignup.setBounds(232, 1, 142, 23);
		contentPane.add(lblSignup);
		
		JLabel label_1 = new JLabel("  *********************");
		label_1.setBounds(242, 22, 157, 14);
		contentPane.add(label_1);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LogInPage ob = new LogInPage();
				ob.setVisible(true);
				dispose();
				
				
			}
		});
		btnLogin.setForeground(new Color(255, 255, 204));
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnLogin.setFocusPainted(false);
		btnLogin.setBackground(new Color(0, 0, 51));
		btnLogin.setBounds(270, 348, 104, 35);
		contentPane.add(btnLogin);
		
		JButton button_1 = new JButton("Home");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				HomePage obj=new HomePage();
				obj.setVisible(true);
				dispose();
			}
		});
		button_1.setForeground(new Color(255, 255, 204));
		button_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_1.setFocusPainted(false);
		button_1.setBackground(new Color(0, 0, 51));
		button_1.setBounds(111, 29, 88, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("Back");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(bac=="H") {
				HomePage obj=new HomePage();
				obj.setVisible(true);
				dispose();
				}
				if(bac=="L")
				{
					LogInPage obj1=new LogInPage();
					obj1.setVisible(true);
					dispose();
					
				}
				if(bac=="C")
				{
					CustomerSignUp obj2=new CustomerSignUp();
					obj2.setVisible(true);
					dispose();
					
				}
			}
		});
		button_2.setForeground(new Color(255, 255, 204));
		button_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_2.setFocusPainted(false);
		button_2.setBackground(new Color(0, 0, 51));
		button_2.setBounds(1, 29, 88, 23);
		contentPane.add(button_2);
		
		JLabel VersityImageLabel = new JLabel("");
		VersityImageLabel.setForeground(Color.BLUE);
		VersityImageLabel.setIcon(new ImageIcon(LogInPage.class.getResource("01.jpg")));
		VersityImageLabel.setBounds(1, 1, 632, 461);
		contentPane.add(VersityImageLabel);
		
	}
}
