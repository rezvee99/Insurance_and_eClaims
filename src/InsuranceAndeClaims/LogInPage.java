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

public class LogInPage extends JFrame {

	private JPanel contentPane;

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
	public LogInPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 502);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCustomerlogin = new JButton("Customer Login");
		btnCustomerlogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CustomerLogin obj=new CustomerLogin("");
				obj.setVisible(true);
				dispose();
			}
		});
		btnCustomerlogin.setForeground(new Color(255, 255, 153));
		btnCustomerlogin.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCustomerlogin.setBackground(new Color(102, 51, 51));
		btnCustomerlogin.setBounds(230, 217, 175, 35);
		contentPane.add(btnCustomerlogin);
		
		JButton btnAdministration = new JButton("Administrator Login\r\n\r\n");
		btnAdministration.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AdministratorLogin ob = new AdministratorLogin("");
				ob.setVisible(true);
				dispose();
			}
		});
		btnAdministration.setForeground(new Color(255, 255, 153));
		btnAdministration.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAdministration.setBackground(new Color(102, 51, 51));
		btnAdministration.setBounds(230, 277, 175, 35);
		contentPane.add(btnAdministration);
		
		JLabel label = new JLabel("Log In");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.BOLD, 16));
		label.setBounds(232, 1, 142, 23);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("  *********************");
		label_1.setBounds(242, 22, 157, 14);
		contentPane.add(label_1);
		
		JButton button = new JButton("Sign Up");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SignUpPage ob=new SignUpPage("L");
				ob.setVisible(true);
				dispose();
			}
		});
		button.setForeground(new Color(255, 255, 204));
		button.setFont(new Font("Tahoma", Font.BOLD, 12));
		button.setFocusPainted(false);
		button.setBackground(new Color(0, 0, 51));
		button.setBounds(270, 348, 104, 35);
		contentPane.add(button);
		
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
				HomePage obj=new HomePage();
				obj.setVisible(true);
				dispose();
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
