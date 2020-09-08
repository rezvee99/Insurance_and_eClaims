package InsuranceAndeClaims;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.omg.CORBA.PUBLIC_MEMBER;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import java.awt.ComponentOrientation;

public class ApplyForLoan extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	JLabel label_5;
	JLabel label_3;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ApplyForLoan frame = new ApplyForLoan("");
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
	private int p_code;
	private int id;
	public ApplyForLoan(String email) {
		CustomerOutput cobj=new CustomerOutput();
		cobj.Output(email);
		 id =cobj.police_Id();
		if(id==0)
		{
			id=801;
		}
		else
		{
			id=id+1;		
		}
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 618, 466);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton back = new JButton("Back");
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Customer ob=new Customer(email);
				ob.setVisible(true);
				dispose();
				
				
			}
		});
		back.setForeground(new Color(255, 255, 204));
		back.setFont(new Font("Tahoma", Font.BOLD, 12));
		back.setFocusPainted(false);
		back.setBackground(Color.BLACK);
		back.setBounds(10, 11, 89, 23);
		contentPane.add(back);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 12));
		comboBox.setForeground(new Color(128, 0, 128));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select One", "All-risk policies", "Named perils policies", "Replacement cost", "Actual cash value"}));
		comboBox.setBounds(214, 149, 190, 20);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_2 = new JLabel("Policy Type : ");
		lblNewLabel_2.setBounds(52, 147, 138, 23);
		contentPane.add(lblNewLabel_2);
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JLabel label = new JLabel("Start_Date:");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setFont(new Font("Tahoma", Font.BOLD, 13));
		label.setBounds(69, 190, 117, 20);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		textField.setColumns(10);
		textField.setBounds(215, 185, 188, 26);
		contentPane.add(textField);
		
		JLabel label_1 = new JLabel("End_Date:");
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_1.setBounds(69, 237, 117, 20);
		contentPane.add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.LEFT);
		textField_1.setColumns(10);
		textField_1.setBounds(215, 232, 188, 26);
		contentPane.add(textField_1);
		
		JLabel label_2 = new JLabel("Customer_ID:");
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		label_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_2.setBounds(89, 80, 99, 19);
		contentPane.add(label_2);
		
		label_3 = new JLabel("");
		label_3.setText(String.valueOf(cobj.customerId));
		label_3.setHorizontalAlignment(SwingConstants.LEFT);
		label_3.setBounds(213, 79, 189, 20);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("Policy_ID:");
		label_4.setHorizontalAlignment(SwingConstants.RIGHT);
		label_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_4.setBounds(116, 111, 74, 20);
		contentPane.add(label_4);
		
		label_5 = new JLabel("");
		label_5.setText(String.valueOf(id));
		label_5.setHorizontalAlignment(SwingConstants.LEFT);
		label_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_5.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		label_5.setBounds(215, 112, 189, 20);
		contentPane.add(label_5);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String Name = (String)comboBox.getSelectedItem();
				if(Name=="All-risk policies")
				{
					p_code=301;
				}
				if(Name=="Named perils policies")
				{
					p_code=302;
				}
				if(Name=="Replacement cost")
				{
					p_code=303;
				}
				if(Name=="Actual cash value")
				{
					p_code=304;
				}
				
                CustomerInput inp = new CustomerInput();	
				inp.policyInsert(id, cobj.customerId, p_code, textField.getText(), textField_1.getText(), "Yes");
				
				if (inp.counter1==1) {
					Customer obj = new Customer(email);
					obj.setVisible(true);
					dispose();	
				}
				
			}
		});
		btnSubmit.setForeground(new Color(255, 255, 204));
		btnSubmit.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSubmit.setFocusPainted(false);
		btnSubmit.setBackground(Color.BLACK);
		btnSubmit.setBounds(260, 291, 89, 23);
		contentPane.add(btnSubmit);
		
	}
}
