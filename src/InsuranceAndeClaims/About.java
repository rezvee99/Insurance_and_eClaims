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

public class About extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					About frame = new About("","Home");
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
	public About(String email,String pera) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 502);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("Home");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
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
		button.setBounds(10, 42, 89, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Contact");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(pera =="Home")
				{
					ContactUs ob=new ContactUs(email, pera);
					ob.setVisible(true);
					dispose();
					
				}
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
		button_1.setForeground(new Color(255, 255, 204));
		button_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_1.setFocusTraversalKeysEnabled(false);
		button_1.setFocusPainted(false);
		button_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		button_1.setBackground(new Color(34, 139, 34));
		button_1.setBounds(10, 79, 89, 23);
		contentPane.add(button_1);
		
		
		JLabel VersityImageLabel = new JLabel("");
		VersityImageLabel.setBounds(1, 1, 632, 461);
		VersityImageLabel.setForeground(Color.BLUE);
		VersityImageLabel.setIcon(new ImageIcon(HomePage2.class.getResource("aboutus1.jpg")));		
		contentPane.add(VersityImageLabel);
		
		
	}

}
