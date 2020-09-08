package InsuranceAndeClaims;

import java.awt.BorderLayout;



import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import net.proteanit.sql.DbUtils;

import javax.management.Query;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.JScrollPane;

import java.sql.ResultSet;
import java.sql.SQLException;



public class PaymentHistory extends JFrame {

	private JPanel contentPane;
	private JLabel label_L, label_P,label_D;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PaymentHistory frame = new PaymentHistory("",0);
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
	public PaymentHistory(String email,int custID) {
		CustomerOutput cout=new CustomerOutput();
		cout.customerPayment(custID);
			
		setTitle(" Payment");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 544, 366);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button_1 = new JButton("Logout");
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
		button_1.setBackground(Color.BLACK);
		button_1.setBounds(429, 5, 89, 23);
		contentPane.add(button_1);
		
		JLabel lblTatalAmountOf = new JLabel("Tatal Amount Of Loan :");
		lblTatalAmountOf.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTatalAmountOf.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTatalAmountOf.setBounds(23, 102, 164, 23);
		contentPane.add(lblTatalAmountOf);
		
		label_L = new JLabel("");
		label_L.setText(String.valueOf(cout.claimAmout));
		label_L.setHorizontalAlignment(SwingConstants.LEFT);
		label_L.setForeground(new Color(0, 0, 0));
		label_L.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_L.setBounds(218, 102, 175, 23);
		contentPane.add(label_L);
		
		label_P = new JLabel("");
		label_P.setText(String.valueOf(cout.paid));
		label_P.setHorizontalAlignment(SwingConstants.LEFT);
		label_P.setForeground(Color.BLACK);
		label_P.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_P.setBounds(218, 151, 175, 23);
		contentPane.add(label_P);
		
		JLabel lblTotalPay = new JLabel("Total Pay :");
		lblTotalPay.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTotalPay.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTotalPay.setBounds(23, 151, 164, 23);
		contentPane.add(lblTotalPay);
		
		int due=cout.claimAmout-cout.paid;
		
		label_D = new JLabel("");
		label_D.setText(String.valueOf(due));
		label_D.setHorizontalAlignment(SwingConstants.LEFT);
		label_D.setForeground(Color.BLACK);
		label_D.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_D.setBounds(218, 200, 175, 23);
		contentPane.add(label_D);
		
		JLabel lblTotalDue = new JLabel("Total Due :");
		lblTotalDue.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTotalDue.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTotalDue.setBounds(23, 200, 164, 23);
		contentPane.add(lblTotalDue);
		
		JButton button_2 = new JButton("Back");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Customer obj=new Customer(email);
				obj.setVisible(true);
				dispose();
			}
		});
		button_2.setForeground(new Color(255, 255, 204));
		button_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_2.setFocusPainted(false);
		button_2.setBackground(Color.BLACK);
		button_2.setBounds(10, 11, 89, 23);
		contentPane.add(button_2);
		
	}
	

}
