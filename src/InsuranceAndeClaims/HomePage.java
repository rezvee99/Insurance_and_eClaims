package InsuranceAndeClaims;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HomePage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
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
	private String pera="Home";
	public HomePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 502);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("Home");
		button.setEnabled(false);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setForeground(new Color(255, 255, 204));
		button.setFont(new Font("Tahoma", Font.BOLD, 12));
		button.setFocusPainted(false);
		button.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		button.setBackground(new Color(0, 0, 51));
		button.setBounds(1, 39, 89, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("About Us");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				About ob=new About("", pera);	
				ob.setVisible(true);
				dispose();
			}
		});
		button_1.setForeground(new Color(255, 255, 204));
		button_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_1.setFocusTraversalKeysEnabled(false);
		button_1.setFocusPainted(false);
		button_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		button_1.setBackground(new Color(0, 0, 51));
		button_1.setBounds(1, 73, 89, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("Contact");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ContactUs obj=new ContactUs("", pera);
				obj.setVisible(true);
				dispose();
			}
		});
		button_2.setForeground(new Color(255, 255, 204));
		button_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_2.setFocusTraversalKeysEnabled(false);
		button_2.setFocusPainted(false);
		button_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		button_2.setBackground(new Color(0, 0, 51));
		button_2.setBounds(1, 107, 89, 23);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("Sign Up");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SignUpPage ob=new SignUpPage("H");
				ob.setVisible(true);
				dispose();
			}
		});
		button_3.setForeground(new Color(255, 255, 204));
		button_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_3.setFocusPainted(false);
		button_3.setBackground(new Color(0, 0, 51));
		button_3.setBounds(387, 39, 90, 23);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("Log In");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LogInPage obj= new LogInPage();
				obj.setVisible(true);
				dispose();
			}
		});
		button_4.setForeground(new Color(255, 255, 204));
		button_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_4.setFocusPainted(false);
		button_4.setBackground(new Color(0, 0, 51));
		button_4.setBounds(484, 39, 90, 23);
		contentPane.add(button_4);
		
		JLabel VersityImageLabel = new JLabel("");
		VersityImageLabel.setBounds(1, 1, 632, 461);
		VersityImageLabel.setForeground(Color.BLUE);
		VersityImageLabel.setIcon(new ImageIcon(HomePage.class.getResource("Welcome.jpg")));		
		contentPane.add(VersityImageLabel);
	}
}
