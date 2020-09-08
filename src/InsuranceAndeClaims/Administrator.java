package InsuranceAndeClaims;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Administrator extends JFrame {

	private JPanel contentPane;
	public JPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Administrator frame = new Administrator("");
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
	public Administrator(String email) {
		
		AdminOutput ob=new AdminOutput();
		ob.Output(email);
		setTitle("Administrator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 656, 407);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("Home");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				HomePage2 obj = new HomePage2(email,"admin");
				obj.setVisible(true);
				dispose();
			}
		});
		button.setForeground(new Color(255, 255, 204));
		button.setFont(new Font("Tahoma", Font.BOLD, 12));
		button.setFocusPainted(false);
		button.setBackground(new Color(0, 0, 51));
		button.setBounds(0, 5, 89, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Profile");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdministratorProfile obj=new AdministratorProfile(email);
				obj.setVisible(true);
				dispose();
				
			}
		});
		button_1.setForeground(new Color(255, 255, 204));
		button_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_1.setFocusPainted(false);
		button_1.setBackground(new Color(0, 0, 51));
		button_1.setBounds(123, 5, 89, 23);
		contentPane.add(button_1);
		
		JButton btnPendingRequest = new JButton("Pending Request\r\n");
		btnPendingRequest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PendingRequest obj=new PendingRequest(email);
				obj.setVisible(true);
				dispose();
				
			}
		});
		btnPendingRequest.setForeground(new Color(255, 255, 204));
		btnPendingRequest.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnPendingRequest.setFocusPainted(false);
		btnPendingRequest.setBackground(new Color(0, 0, 51));
		btnPendingRequest.setBounds(241, 5, 149, 23);
		contentPane.add(btnPendingRequest);
		
		JButton btnSearch = new JButton("Information");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(true);
				
			}
		});
		btnSearch.setForeground(new Color(255, 255, 204));
		btnSearch.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSearch.setFocusPainted(false);
		btnSearch.setBackground(new Color(0, 0, 51));
		btnSearch.setBounds(416, 5, 114, 23);
		contentPane.add(btnSearch);
		
		JButton button_4 = new JButton("Logout");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LogInPage obj = new LogInPage();
				obj.setVisible(true);
				dispose();
			}
		});
		button_4.setForeground(new Color(255, 255, 204));
		button_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_4.setFocusPainted(false);
		button_4.setBackground(new Color(0, 0, 51));
		button_4.setBounds(549, 5, 89, 23);
		contentPane.add(button_4);
		
		JLabel label_1 = new JLabel("");
		label_1.setText(ob.Administrator_Name);
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_1.setBounds(421, 36, 209, 24);
		contentPane.add(label_1);
		
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 640, 70);
		label.setIcon(new ImageIcon(Administrator.class.getResource("TitelPic.jpg")));
		contentPane.add(label);
		
		panel = new JPanel();
		panel.setVisible(false);
		panel.setBounds(0, 70, 638, 298);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnCustomerSearch = new JButton("Customer Info\r\n\r\n");
		btnCustomerSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustomerSearch obj=new CustomerSearch(email);
				obj.setVisible(true);
				dispose();
			}
		});
		btnCustomerSearch.setForeground(new Color(255, 255, 204));
		btnCustomerSearch.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCustomerSearch.setFocusPainted(false);
		btnCustomerSearch.setBackground(new Color(0, 0, 51));
		btnCustomerSearch.setBounds(253, 80, 149, 23);
		panel.add(btnCustomerSearch);
		
		JButton btnAdministration = new JButton("Staff Info\r\n");
		btnAdministration.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StaffSearch obj1=new StaffSearch(email);
				obj1.setVisible(true);
				dispose();
			}
		});
		btnAdministration.setForeground(new Color(255, 255, 204));
		btnAdministration.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAdministration.setFocusPainted(false);
		btnAdministration.setBackground(new Color(0, 0, 51));
		btnAdministration.setBounds(253, 124, 149, 23);
		panel.add(btnAdministration);
		
		JButton btnCancle = new JButton("Cancle");
		btnCancle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
			}
		});
		btnCancle.setForeground(new Color(255, 255, 204));
		btnCancle.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCancle.setFocusPainted(false);
		btnCancle.setBackground(new Color(0, 0, 51));
		btnCancle.setBounds(281, 176, 89, 23);
		panel.add(btnCancle);
	}
}
