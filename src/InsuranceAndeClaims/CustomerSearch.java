package InsuranceAndeClaims;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import net.proteanit.sql.DbUtils;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class CustomerSearch extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	private JLabel label,label_1,label_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerSearch frame = new CustomerSearch("");
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
	
	private int custID;
	
	public CustomerSearch(String email) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1021, 642);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("********************************\r\n");
		lblNewLabel_1.setBackground(new Color(0, 0, 128));
		lblNewLabel_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(416, 31, 223, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Customer Info");
		lblNewLabel.setForeground(new Color(0, 0, 128));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(410, 4, 231, 26);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(176, 224, 230));
		panel.setBackground(new Color(176, 224, 230));
		panel.setBounds(0, 0, 1016, 616);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton button = new JButton("Back");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Administrator obj=new Administrator(email);
	    		obj.setVisible(true);
	    		dispose();
			}
		});
		button.setForeground(new Color(255, 255, 204));
		button.setFont(new Font("Tahoma", Font.BOLD, 12));
		button.setFocusPainted(false);
		button.setBackground(new Color(0, 0, 51));
		button.setBounds(7, 6, 89, 23);
		panel.add(button);
		
		JButton btnView = new JButton("View");
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				custID= Integer.valueOf(textField.getText());
				
				CustomerOutput cout=new CustomerOutput();
				cout.customerPayment(custID);
				
				
				
				
				label.setText(String.valueOf(cout.claimAmout));
				label_1.setText(String.valueOf(cout.paid));
				
				int due=cout.claimAmout-cout.paid;
				label_3.setText(String.valueOf(due));
				
				
				
			}
		});
		btnView.setForeground(new Color(255, 255, 204));
		btnView.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnView.setFocusPainted(false);
		btnView.setBackground(new Color(0, 0, 51));
		btnView.setBounds(90, 141, 89, 23);
		panel.add(btnView);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setForeground(new Color(176, 224, 230));
		scrollPane.setBackground(new Color(176, 224, 230));
		
		scrollPane.setBounds(254, 59, 748, 546);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 14));
		scrollPane.setViewportView(table);
		
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				int row = table.getSelectedRow();
				custID =(int) (table.getModel().getValueAt(row, 0));
				textField.setText(String.valueOf(custID));
			}
		});
		
		Connection conn = (Connection) Dbconnection.dbcon();
		String query = "select Customer_ID,First_Name , Last_Name, customer.Email , Phone_Number  from customer";
		PreparedStatement pst;
		try {
			pst = (PreparedStatement) conn.prepareStatement(query);
			ResultSet rs = pst.executeQuery();
		    table.setModel(DbUtils.resultSetToTableModel(rs));
		    
		    JLabel lblNewLabel_2 = new JLabel("Cust. ID :");
		    lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		    lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		    lblNewLabel_2.setBounds(7, 102, 63, 21);
		    panel.add(lblNewLabel_2);
		    
		    textField = new JTextField();
		    textField.setHorizontalAlignment(SwingConstants.CENTER);
		    textField.setFont(new Font("Tahoma", Font.BOLD, 13));
		    textField.setBackground(new Color(176, 224, 230));
		    textField.setBounds(80, 103, 123, 20);
		    panel.add(textField);
		    textField.setColumns(10);
		    
		    JLabel lblClaimAmount = new JLabel("Claim Amount :");
		    lblClaimAmount.setHorizontalAlignment(SwingConstants.RIGHT);
		    lblClaimAmount.setFont(new Font("Tahoma", Font.BOLD, 13));
		    lblClaimAmount.setBounds(8, 236, 97, 23);
		    panel.add(lblClaimAmount);
		    
		    JLabel lblPaidAmount = new JLabel("Paid Amount :");
		    lblPaidAmount.setHorizontalAlignment(SwingConstants.RIGHT);
		    lblPaidAmount.setFont(new Font("Tahoma", Font.BOLD, 13));
		    lblPaidAmount.setBounds(8, 285, 97, 23);
		    panel.add(lblPaidAmount);
		    
		    JLabel label_2 = new JLabel("Total Due :");
		    label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		    label_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		    label_2.setBounds(29, 334, 76, 23);
		    panel.add(label_2);
		    
		    label = new JLabel("0");
		    
		    label.setHorizontalAlignment(SwingConstants.LEFT);
		    label.setForeground(Color.BLACK);
		    label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		    label.setBounds(117, 236, 110, 23);
		    panel.add(label);
		    
		    label_1 = new JLabel("0");
		    label_1.setHorizontalAlignment(SwingConstants.LEFT);
		    label_1.setForeground(Color.BLACK);
		    label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		    label_1.setBounds(117, 285, 110, 23);
		    panel.add(label_1);
		    
		    label_3 = new JLabel("0");
		    label_3.setHorizontalAlignment(SwingConstants.LEFT);
		    label_3.setForeground(Color.BLACK);
		    label_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		    label_3.setBounds(117, 334, 110, 23);
		    panel.add(label_3);
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null,e.getMessage());
		}
	}
}
