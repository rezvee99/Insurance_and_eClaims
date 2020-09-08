package InsuranceAndeClaims;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Color;

public class NewPassword extends JFrame {

	private JPanel contentPane;
	private JPasswordField Npassword;
	private JPasswordField Cpassword;
	public String email;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewPassword frame = new NewPassword("");
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
	public NewPassword(String email) {
		//System.out.println(email);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 672, 412);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewPassword = new JLabel("New Password ");
		lblNewPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewPassword.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewPassword.setBounds(151, 11, 313, 26);
		contentPane.add(lblNewPassword);
		
		Npassword = new JPasswordField();
		Npassword.setBounds(271, 124, 223, 26);
		contentPane.add(Npassword);
		
		Cpassword = new JPasswordField();
		Cpassword.setBounds(271, 163, 223, 26);
		contentPane.add(Cpassword);
		
		JLabel lblConfirmPassword = new JLabel("Confirm Password :");
		lblConfirmPassword.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblConfirmPassword.setBounds(121, 159, 124, 26);
		contentPane.add(lblConfirmPassword);
		
		JButton btnOk = new JButton("OK");
		btnOk.setBackground(new Color(0, 0, 51));
		btnOk.setForeground(new Color(255, 255, 204));
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String NPassword = Npassword.getText();
				String CPassword = Cpassword.getText();
				
				CustomerOutput ob1= new CustomerOutput();
				ob1.Output(email);
				if(NPassword.equals("") && CPassword.equals(""))
				{
					
					JOptionPane.showMessageDialog(null,"Please Enter A Password");
					
				}
				else {
				
				if (NPassword.equals(CPassword))
				{
					UpdateData ob = new UpdateData();
					ob.updatePassword(NPassword, email);
					LogInPage obj=new LogInPage();
					obj.setVisible(true);
					dispose();
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Password not matched!!");
					Npassword.setText("");
					Cpassword.setText("");
				}
				}
				
			}
		});
		
		JLabel label = new JLabel("****************************************");
		label.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label.setBounds(170, 37, 294, 14);
		contentPane.add(label);
		btnOk.setBounds(271, 214, 89, 23);
		contentPane.add(btnOk);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LogInPage lm = new LogInPage();
				lm.setVisible(true);
			}
		});
		btnBack.setForeground(new Color(255, 255, 204));
		btnBack.setBackground(new Color(0, 0, 51));
		btnBack.setBounds(386, 214, 89, 23);
		contentPane.add(btnBack);
		
		JLabel lblNewPassword_1 = new JLabel("New Password :");
		lblNewPassword_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewPassword_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewPassword_1.setBounds(117, 120, 124, 26);
		contentPane.add(lblNewPassword_1);
	}
}
