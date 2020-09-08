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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class StaffSearch extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StaffSearch frame = new StaffSearch("");
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
	public StaffSearch(String email) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 666, 491);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("********************************\r\n");
		lblNewLabel_1.setForeground(new Color(0, 0, 139));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(234, 32, 213, 14);
		contentPane.add(lblNewLabel_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(230, 230, 250));
		panel.setBounds(0, 0, 650, 452);
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
		button.setBounds(8, 7, 89, 23);
		panel.add(button);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(8, 41, 632, 400);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 14));
		scrollPane.setViewportView(table);
		
		Connection conn = (Connection) Dbconnection.dbcon();
		String query = "Select * from staff";
		PreparedStatement pst;
		try {
			pst = (PreparedStatement) conn.prepareStatement(query);
			ResultSet rs = pst.executeQuery();
		    table.setModel(DbUtils.resultSetToTableModel(rs));
		    
		    JLabel lblNewLabel = new JLabel("Staff Info");
		    lblNewLabel.setBounds(234, 7, 207, 26);
		    panel.add(lblNewLabel);
		    lblNewLabel.setForeground(new Color(0, 0, 139));
		    lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		    lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null,e.getMessage());
		}
		
		
		
		
	}
}
