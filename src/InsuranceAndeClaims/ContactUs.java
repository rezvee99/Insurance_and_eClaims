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

public class ContactUs extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ContactUs frame = new ContactUs("","Home");
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
	 public ContactUs(String email,String pera) {
		
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 502);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("Home");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(pera =="Home")
				{
					HomePage ob1=new HomePage();
					ob1.setVisible(true);
					dispose();
					
				}
				if(pera=="admin")
				{
					HomePage2 ob2=new HomePage2(email, pera);
					ob2.setVisible(true);
					dispose();
					
				}
				if(pera=="cust")
				{
					HomePage2 ob2=new HomePage2(email, pera);
					ob2.setVisible(true);
					dispose();
				}
				
				
			}
		});
		button.setForeground(new Color(255, 255, 204));
		button.setFont(new Font("Tahoma", Font.BOLD, 12));
		button.setFocusPainted(false);
		button.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		button.setBackground(new Color(34, 139, 34));
		button.setBounds(10, 43, 89, 23);
		contentPane.add(button);
		
		JButton btnAboutUs = new JButton("About Us");
		btnAboutUs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(pera =="Home")
				{
				 About ob=new About(email, pera);	
					ob.setVisible(true);
					dispose();
						 
					
				}
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
		btnAboutUs.setForeground(new Color(255, 255, 204));
		btnAboutUs.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAboutUs.setFocusTraversalKeysEnabled(false);
		btnAboutUs.setFocusPainted(false);
		btnAboutUs.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnAboutUs.setBackground(new Color(34, 139, 34));
		btnAboutUs.setBounds(10, 79, 89, 23);
		contentPane.add(btnAboutUs);
		
		
		JLabel VersityImageLabel = new JLabel("");
		VersityImageLabel.setBounds(1, 1, 632, 461);
		VersityImageLabel.setForeground(Color.BLUE);
		VersityImageLabel.setIcon(new ImageIcon(ContactUs.class.getResource("contact2.jpg")));		
		contentPane.add(VersityImageLabel);
		
		
	}

}
