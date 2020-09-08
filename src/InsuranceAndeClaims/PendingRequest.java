package InsuranceAndeClaims;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.omg.CORBA.PRIVATE_MEMBER;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import net.proteanit.sql.DbUtils;

import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.security.Policy;

public class PendingRequest extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JLabel lblNewLabel;
	private JTextField policyFld;
	private JLabel lblPolicyId;
	private JButton btnAccept;
	private JButton cancle;
	private JButton btnBack;
	private int policy_id;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PendingRequest frame = new PendingRequest("");
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
	public PendingRequest(String email) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 759, 494);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.addMouseListener(new MouseAdapter() {
			
			
		});
		
		lblNewLabel = new JLabel("Request List");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(384, 0, 163, 35);
		contentPane.add(lblNewLabel);
		
		policyFld = new JTextField();
		policyFld.setHorizontalAlignment(SwingConstants.CENTER);
		policyFld.setBounds(20, 162, 125, 28);
		contentPane.add(policyFld);
		policyFld.setColumns(10);
		
		lblPolicyId = new JLabel("Policy ID");
		lblPolicyId.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPolicyId.setHorizontalAlignment(SwingConstants.CENTER);
		lblPolicyId.setBounds(41, 132, 75, 21);
		contentPane.add(lblPolicyId);
		
		btnAccept = new JButton("Accept");
		btnAccept.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				 policy_id=Integer.valueOf(policyFld.getText());				
				ClaimDocument claimDocument=new ClaimDocument(email, policy_id);
				claimDocument.setVisible(true);
				dispose();
			}
		});
		btnAccept.setForeground(new Color(255, 255, 204));
		btnAccept.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAccept.setFocusPainted(false);
		btnAccept.setBackground(new Color(0, 0, 51));
		btnAccept.setBounds(40, 201, 89, 23);
		contentPane.add(btnAccept);
		
		cancle = new JButton("Cancel Request\r\n");
		cancle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
					DeleteData dl = new DeleteData();
			    		dl.deletePolicy(policy_id);		    		
			    		PendingRequest pr =new PendingRequest(email);
			    		pr.setVisible(true);
			    		dispose();
				
			}
		});
		cancle.setForeground(new Color(255, 255, 204));
		cancle.setFont(new Font("Tahoma", Font.BOLD, 12));
		cancle.setFocusPainted(false);
		cancle.setBackground(new Color(0, 0, 51));
		cancle.setBounds(19, 235, 135, 23);
		contentPane.add(cancle);
		
		btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Administrator obj=new Administrator(email);
				obj.setVisible(true);
				dispose();
			}
		});
		btnBack.setForeground(new Color(255, 255, 204));
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnBack.setFocusPainted(false);
		btnBack.setBackground(new Color(0, 0, 51));
		btnBack.setBounds(10, 11, 89, 23);
		contentPane.add(btnBack);
		
		scrollPane.setBounds(173, 40, 567, 409);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				int row = table.getSelectedRow();
				policy_id =(int) (table.getModel().getValueAt(row, 3));
				//System.out.println(policy_id);
				policyFld.setText(String.valueOf(policy_id));
			}
		});
		scrollPane.setViewportView(table);
		
		Connection conn = (Connection) Dbconnection.dbcon();
		String query = "select customer.Customer_Id, customer.First_Name ,customer.Last_Name,policies.Policy_ID,ref_policy_types.Policy_Type_Description Polic_Type"
				+ " from customer join policies on customer.Customer_Id= policies.Customer_ID join ref_policy_types on policies.Policy_Type_Code= ref_policy_types.Policy_Types_Code " + 
				"where policies.condition='yes'";
		PreparedStatement pst;
		try {
			pst = (PreparedStatement) conn.prepareStatement(query);
			ResultSet rs = pst.executeQuery();
		    table.setModel(DbUtils.resultSetToTableModel(rs));
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null,e.getMessage());
		}
		
		
		
	}
}
