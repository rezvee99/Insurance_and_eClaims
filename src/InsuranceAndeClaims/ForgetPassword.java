package InsuranceAndeClaims;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.event.CaretListener;

import javax.swing.event.CaretEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ForgetPassword extends JFrame {

	private JPanel contentPane;
	private JTextField email;
	private JTextField textField_1;
	
	JLabel emailLvl = new JLabel("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogInPage frame = new LogInPage();
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
	public ForgetPassword(String some) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 620, 407);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblForgetPassword = new JLabel("Forget Password\r\n");
		lblForgetPassword.setBounds(245, 11, 162, 31);
		lblForgetPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblForgetPassword.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.add(lblForgetPassword);
		
		JLabel label = new JLabel("************************\r\n");
		label.setBounds(216, 38, 215, 14);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(label);
		
		JButton button = new JButton("Home");
		button.setBounds(96, 16, 88, 23);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				HomePage obj = new HomePage();
				obj.setVisible(true);
				dispose();
			}
		});
		button.setForeground(new Color(255, 255, 204));
		button.setFont(new Font("Tahoma", Font.BOLD, 12));
		button.setFocusPainted(false);
		button.setBackground(new Color(0, 0, 51));
		contentPane.add(button);
		
		JButton button_1 = new JButton("Back");
		button_1.setBounds(0, 16, 88, 23);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(some=="customer") {
					CustomerLogin obj = new CustomerLogin("");
					obj.setVisible(true);
					dispose();
				}
				if(some=="admin") {
					AdministratorLogin ob=new AdministratorLogin("");
					ob.setVisible(true);
					dispose();
					
					}
			}
		});
		button_1.setForeground(new Color(255, 255, 204));
		button_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_1.setFocusPainted(false);
		button_1.setBackground(new Color(0, 0, 51));
		contentPane.add(button_1);
		
		JLabel label_1 = new JLabel("Email :");
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_1.setBounds(157, 117, 65, 23);
		contentPane.add(label_1);
		
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
		email.setBounds(249, 116, 243, 29);
		contentPane.add(email);
		
		JLabel label_2 = new JLabel("Security Pin :");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_2.setBounds(142, 166, 99, 29);
		contentPane.add(label_2);
		
		textField_1 = new JTextField();
		textField_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				char c= arg0.getKeyChar();
				if(!(Character.isDigit(c))||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE)) {
					getToolkit().beep();
					arg0.consume();
				}
			}
		});
		textField_1.setColumns(10);
		textField_1.setBounds(249, 168, 243, 29);
		contentPane.add(textField_1);
		
		JButton button_2 = new JButton("Continue");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				if(some=="customer") {
					
					
					CustomerOutput ob=new CustomerOutput();
					ob.Output(email.getText());
					int pin=Integer.valueOf(textField_1.getText());	
					if(pin==ob.pin) { 
					NewPassword obj = new NewPassword(email.getText());
					obj.setVisible(true);
					dispose();
					}
					else {
						JOptionPane.showMessageDialog(null,"The pin Doesn't Matched");
					}
				}
				if(some=="admin") {
					AdminOutput ob=new AdminOutput();
					ob.Output(email.getText());
					int pin=Integer.valueOf(textField_1.getText());						
					if(pin==ob.pin) { 
					NewPassword2 obj1 = new NewPassword2(email.getText());
					obj1.setVisible(true);
					dispose();
					}
					else {
						JOptionPane.showMessageDialog(null,"The pin Doesn't Matched");
					}
					
					}
				
				
						
				
			}
		});
		button_2.setForeground(new Color(255, 255, 204));
		button_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_2.setBackground(new Color(0, 0, 51));
		button_2.setBounds(251, 224, 111, 23);
		contentPane.add(button_2);
		emailLvl.setForeground(Color.RED);
		
		
		emailLvl.setBounds(259, 147, 233, 16);
		contentPane.add(emailLvl);
	}
}
