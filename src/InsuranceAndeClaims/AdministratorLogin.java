package InsuranceAndeClaims;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.CaretListener;
import javax.swing.event.CaretEvent;

public class AdministratorLogin extends JFrame {

	private JPanel contentPane;
	private JTextField email;
	private JPasswordField passwordField;

	JLabel emailLvl = new JLabel("");
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdministratorLogin frame = new AdministratorLogin("");
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
	public AdministratorLogin(String something) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 620, 407);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Administrator Login");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(192, 11, 206, 37);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("************************\r\n");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(189, 41, 215, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblEmail = new JLabel("Email :");
		lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblEmail.setBounds(144, 123, 56, 22);
		contentPane.add(lblEmail);
		
		email = new JTextField();
		email.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
				String Email_Pattern="^[a-zA-Z0-9]{3,30}@[a-zA-Z0-9]{3,40}.[a-zA-Z]{2,3}$";
				Pattern pattern=Pattern.compile(Email_Pattern);
				Matcher regexMatcher =pattern.matcher(email.getText());
				if(!regexMatcher.matches())
				{
					emailLvl.setText("Please Enter A Valid Email");					
				}
				else {
					emailLvl.setText("       ");
				}
			}
		});
		
		
		email.setColumns(10);
		email.setBounds(226, 121, 230, 29);
		contentPane.add(email);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPassword.setBounds(109, 181, 91, 22);
		contentPane.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(226, 179, 230, 29);
		contentPane.add(passwordField);
		
		
		emailLvl.setForeground(Color.RED);
		emailLvl.setBounds(226, 150, 230, 18);
		contentPane.add(emailLvl);
		
		JButton button = new JButton("Log In");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminOutput ob=new AdminOutput();
				ob.Output(email.getText());
				String password=passwordField.getText();
				if (password.equals(ob.AdministratorPassword)) {
	            	//JOptionPane.showMessageDialog(null,"Logged In Successfully");

	            	Administrator ob1=new Administrator(email.getText());
	            	ob1.setVisible(true);
	            	dispose();
				}
	            else {
	            	JOptionPane.showMessageDialog(null,"The email or the password that you've entered is incorrect.");
	            }	
				
				
				
			}
		});
		button.setForeground(new Color(255, 255, 204));
		button.setFont(new Font("Tahoma", Font.BOLD, 12));
		button.setBackground(new Color(0, 0, 51));
		button.setBounds(228, 240, 89, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Forget Password");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ForgetPassword obj=new ForgetPassword("admin");
				obj.setVisible(true);
				dispose();
			}
		});
		button_1.setForeground(new Color(255, 255, 204));
		button_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_1.setBackground(new Color(204, 0, 51));
		button_1.setBounds(228, 274, 170, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("Back");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LogInPage ob=new LogInPage();
				ob.setVisible(true);
				dispose();
			}
		});
		button_2.setForeground(new Color(255, 255, 204));
		button_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_2.setFocusPainted(false);
		button_2.setBackground(new Color(0, 0, 51));
		button_2.setBounds(0, 19, 88, 23);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("Home");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				HomePage obj = new HomePage();
				obj.setVisible(true);
				dispose();
			}
		});
		button_3.setForeground(new Color(255, 255, 204));
		button_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_3.setFocusPainted(false);
		button_3.setBackground(new Color(0, 0, 51));
		button_3.setBounds(94, 19, 88, 23);
		contentPane.add(button_3);
	}
}
