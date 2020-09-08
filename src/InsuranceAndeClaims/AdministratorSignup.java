package InsuranceAndeClaims;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class AdministratorSignup extends JFrame {
	

	private JPanel contentPane;
	private JTextField firstName;
	private JTextField pNumber;
	private JTextField email;
	private JTextField password;
	private JTextField pin;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdministratorSignup frame = new AdministratorSignup();
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
	public AdministratorSignup() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 672, 412);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblStudentName = new JLabel("Name :");
		lblStudentName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblStudentName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblStudentName.setBounds(109, 70, 108, 23);
		contentPane.add(lblStudentName);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPassword.setBounds(110, 194, 108, 23);
		contentPane.add(lblPassword);
		
		pin = new JTextField();
		pin.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				char c= arg0.getKeyChar();
				if(!(Character.isDigit(c))||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE)) {
					getToolkit().beep();
					arg0.consume();
				}
			}
		});
		pin.setColumns(10);
		pin.setBounds(243, 235, 217, 23);
		contentPane.add(pin);
		
		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.setForeground(new Color(255, 255, 204));
		btnSignUp.setBackground(new Color(0, 0, 51));
		btnSignUp.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String FirstName= firstName.getText();
				String Email = email.getText();
				String Password = password.getText();
				String Number = pNumber.getText();
				int Pin = Integer.parseInt(pin.getText());
				
				AdministratorInput inp = new AdministratorInput();
				
				inp.adminInsert(FirstName, Email, Password, Password, Pin);
				
				if (inp.counter==1) {
					AdministratorLogin obj = new AdministratorLogin("");
					obj.setVisible(true);
					dispose();	
				}
				
				
			}
		});
		btnSignUp.setBounds(293, 280, 89, 23);
		contentPane.add(btnSignUp);
		
		JButton btnHome = new JButton("Home");
		btnHome.setForeground(new Color(255, 255, 204));
		btnHome.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnHome.setBackground(new Color(0, 0, 51));
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				HomePage obj = new HomePage();
				obj.setVisible(true);
				dispose();
			}
		});
		btnHome.setFocusPainted(false);
		btnHome.setBounds(10, 11, 89, 23);
		contentPane.add(btnHome);
		
		email = new JTextField();
		email.setColumns(10);
		email.setBounds(243, 114, 217, 23);
		contentPane.add(email);
		
		password = new JTextField();
		password.setColumns(10);
		password.setBounds(243, 195, 217, 23);
		contentPane.add(password);
		
		JLabel lblStudentSignUp = new JLabel("Administrator Sign Up");
		lblStudentSignUp.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblStudentSignUp.setForeground(new Color(0, 0, 0));
		lblStudentSignUp.setHorizontalAlignment(SwingConstants.CENTER);
		lblStudentSignUp.setBounds(238, 9, 222, 24);
		contentPane.add(lblStudentSignUp);
		
		pNumber = new JTextField();
		pNumber.setColumns(10);
		pNumber.setBounds(243, 156, 217, 23);
		contentPane.add(pNumber);
		
		JLabel lblHidepin = new JLabel("Security Pin :");
		lblHidepin.setHorizontalAlignment(SwingConstants.RIGHT);
		lblHidepin.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblHidepin.setBounds(110, 234, 108, 23);
		contentPane.add(lblHidepin);
		
		JLabel lblDepartment = new JLabel("Phone Number :");
		lblDepartment.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDepartment.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDepartment.setBounds(93, 155, 124, 23);
		contentPane.add(lblDepartment);
		
		JButton btnBack = new JButton("Back");
		btnBack.setForeground(new Color(255, 255, 204));
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnBack.setBackground(new Color(0, 0, 51));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				SignUpPage ob=new SignUpPage("C");
				ob.setVisible(true);
				dispose();
			
			}
		});
		btnBack.setFocusPainted(false);
		btnBack.setBounds(10, 40, 89, 23);
		contentPane.add(btnBack);
		
		JLabel lblEmail = new JLabel("Email :");
		lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEmail.setForeground(new Color(0, 0, 0));
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEmail.setBounds(109, 113, 108, 23);
		contentPane.add(lblEmail);
		
		JLabel label = new JLabel("*****************************************");
		label.setBounds(232, 34, 285, 14);
		contentPane.add(label);
		
		firstName = new JTextField();
		firstName.setBounds(243, 71, 217, 23);
		contentPane.add(firstName);
		firstName.setColumns(10);
	}
}
