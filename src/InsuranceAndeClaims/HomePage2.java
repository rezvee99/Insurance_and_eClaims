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

public class HomePage2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage2 frame = new HomePage2("","");
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
	public HomePage2(String email,String pera) {
		setBackground(new Color(240, 240, 240));
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
				if(pera=="admin")
					
				{
					About ob1=new About(email, pera);	
					ob1.setVisible(true);
					dispose();
					
				}
				if(pera=="cust")
				{
					About ob2=new About(email, pera);	
					ob2.setVisible(true);
					dispose();					
				}
				
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
				if(pera=="admin")			
				{
					ContactUs ob1=new ContactUs(email, pera);
					ob1.setVisible(true);
					dispose();
					
				}
				if(pera=="cust")
				{
					ContactUs ob2=new ContactUs(email, pera);
					ob2.setVisible(true);
					dispose();
				}
				
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
		
		JButton back = new JButton("Back");
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(pera=="admin")
				{
					Administrator obj=new Administrator(email);
					obj.setVisible(true);
					dispose();
				}
				if(pera=="cust")
					
				{
					Customer obj1=new Customer(email);
					obj1.setVisible(true);
					dispose();
				}
				
				
			}
		});
		back.setForeground(new Color(255, 255, 204));
		back.setFont(new Font("Tahoma", Font.BOLD, 12));
		back.setFocusPainted(false);
		back.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		back.setBackground(new Color(0, 0, 51));
		back.setBounds(1, 7, 89, 23);
		contentPane.add(back);
		
		JLabel VersityImageLabel = new JLabel("");
		VersityImageLabel.setBounds(1, 1, 632, 461);
		VersityImageLabel.setForeground(Color.BLUE);
		VersityImageLabel.setIcon(new ImageIcon(HomePage2.class.getResource("Welcome.jpg")));		
		contentPane.add(VersityImageLabel);
	}
}
