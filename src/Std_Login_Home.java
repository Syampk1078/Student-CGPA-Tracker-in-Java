import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Std_Login_Home {
	
	public String post;
	public int sem1;
	public int sem2;
	
	public void post() {
		JOptionPane.showMessageDialog(null, "Notification : "+post);
	}

	private JFrame frame;
	private JTextField btnId;
	private JPasswordField btnPassword;
	private JTextField btnName;
	private JTextField btnRoll;
	private JTextField btnBranch;
	private JTextField btnSection;
	private JButton btnlogout;
	private JTextField cgpa;
	private JTextField sgpa;
    private JComboBox comboBox;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Std_Login_Home window = new Std_Login_Home();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Std_Login_Home() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(128, 128, 128));
		frame.getContentPane().setForeground(new Color(128, 128, 128));
		frame.setBounds(100, 100, 822, 511);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Student_Details", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 162, 791, 305);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "CGPA", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(396, 11, 385, 283);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblCgpa = new JLabel("CGPA");
		lblCgpa.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblCgpa.setBounds(21, 35, 136, 25);
		panel_1.add(lblCgpa);
		
		JLabel lblSemister = new JLabel("Semister");
		lblSemister.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSemister.setBounds(21, 83, 136, 25);
		panel_1.add(lblSemister);
		
		JLabel lblSgpa = new JLabel("SGPA");
		lblSgpa.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSgpa.setBounds(21, 139, 136, 25);
		panel_1.add(lblSgpa);
		
		
		String[] colums = {"","Semister-1","Semister-2"};
		comboBox = new JComboBox(colums);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int indx = comboBox.getSelectedIndex();
				if(indx == 1)
				sgpa.setText(""+sem1);
				else if(indx == 2)
				sgpa.setText(""+sem2);
			}
		});
		
		comboBox.setBounds(198, 88, 158, 22);
		panel_1.add(comboBox);
		
		cgpa = new JTextField();
		cgpa.setEditable(false);
		cgpa.setBounds(198, 41, 158, 20);
		panel_1.add(cgpa);
		cgpa.setColumns(10);
		
		sgpa = new JTextField();
		sgpa.setEditable(false);
		sgpa.setBounds(198, 145, 158, 20);
		panel_1.add(sgpa);
		sgpa.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBackground(new Color(64, 0, 64));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(21, 46, 136, 25);
		panel.add(lblNewLabel);
		
		JLabel lblRollNumber = new JLabel("Roll Number");
		lblRollNumber.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblRollNumber.setBounds(21, 96, 136, 25);
		panel.add(lblRollNumber);
		
		JLabel lblBranch = new JLabel("Branch");
		lblBranch.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblBranch.setBounds(21, 147, 136, 25);
		panel.add(lblBranch);
		
		JLabel lblSection = new JLabel("Section");
		lblSection.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSection.setBounds(21, 201, 136, 25);
		panel.add(lblSection);
		
		btnName = new JTextField();
		btnName.setEditable(false);
		btnName.setBounds(195, 52, 178, 20);
		panel.add(btnName);
		btnName.setColumns(10);
		
		btnRoll = new JTextField();
		btnRoll.setEditable(false);
		btnRoll.setColumns(10);
		btnRoll.setBounds(195, 102, 178, 20);
		panel.add(btnRoll);
		
		btnBranch = new JTextField();
		btnBranch.setEditable(false);
		btnBranch.setColumns(10);
		btnBranch.setBounds(195, 153, 178, 20);
		panel.add(btnBranch);
		
		btnSection = new JTextField();
		btnSection.setEditable(false);
		btnSection.setColumns(10);
		btnSection.setBounds(195, 207, 178, 20);
		panel.add(btnSection);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Login_Page", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(10, 11, 791, 140);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Student ID");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_2.setBounds(20, 11, 218, 57);
		panel_2.add(lblNewLabel_2);
		
		btnId = new JTextField();
		btnId.setColumns(10);
		btnId.setBounds(248, 37, 218, 20);
		panel_2.add(btnId);
		
		JLabel lblPassword = new JLabel("password");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblPassword.setBounds(20, 79, 218, 57);
		panel_2.add(lblPassword);
		
		btnPassword = new JPasswordField();
		btnPassword.setBounds(248, 105, 218, 20);
		panel_2.add(btnPassword);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(487, 37, 294, 27);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel btnNotification = new JLabel("");
		btnNotification.setHorizontalAlignment(SwingConstants.CENTER);
		btnNotification.setBounds(0, 0, 294, 25);
		panel_3.add(btnNotification);
		
		JButton btnlog = new JButton("Login");
		btnlog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 try {
					   Class.forName("com.mysql.jdbc.Driver");
					   Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project?useSSL=false","root","1234");
					   
					   
					   String username = btnId.getText();
					   String pass  = btnPassword.getText();
					   
					   Statement stmt = con.createStatement();
					   //String sql = "select * from student where roll='"+username+"' and password='"+pass+"'";
					   String sql = "select Name,Roll,Branch,Section from student where roll='"+username+"' and password='"+pass+"'";
					   
					   //Execute Query
					   ResultSet rs = stmt.executeQuery(sql);
					   
					   if(rs.next()) {
						   //JOptionPane.showMessageDialog(null, "Connected");
						   
						   
						   
						   String name = rs.getString(1);
						   String branch = rs.getString(3);
						   String roll = rs.getString(2);
						   String section = rs.getString(4);
						   
						   btnName.setText(name);
						   btnBranch.setText(branch);
						   btnRoll.setText(roll);
						   btnSection.setText(section);
						   
						   btnNotification.setText("=> Login Successful <=");
						   
						   
						   
						   
						   
						   
						   btnId.setEditable(false);
						   btnPassword.setEditable(false);
							btnlog.setEnabled(false);
						   btnlogout.setEnabled(true);
							//btnName.setText(sql)
						   
						   //Semister - 1
						   String semi = "select C,BC from First_Sem where roll='"+username+"'";
						   ResultSet s = stmt.executeQuery(semi);
						   
						   if(s.next()) {
						   String C = s.getString(1);
						   String BC = s.getString(2);
						   
						   int cgp = (Integer.valueOf(C) + Integer.valueOf(BC))/2;
						   if(cgp>90) {
							   sem1 = 10;
						    // cgpa.setText(""+10);
						   }
						   else if(cgp>80 && cgp<=90) {
							   sem1 = 9;
							 // cgpa.setText(""+9);
						   }
						   else {
							   sem1 = 7;
						   }
						   }
						   
						   
						   
						 
					   }
					   else {
						   if(username.equals("") & pass.equals("")) btnNotification.setText("=> Enter UserId and Password <=");
						   else if(username.length()==0) btnNotification.setText("=> Enter Student ID <=");
						   else if(pass.length()==0) btnNotification.setText("=> Enter Password <=");
						   else
							   btnNotification.setText("=> Invalid User <=");
						   
						  
						  
					   }
					   
					   
					   
				   }
				   catch(Exception xe) {
					  JOptionPane.showMessageDialog(btnlog, e);
				   }
				 
				//Semister -2 
				   sem2();
				   
				   cgpa.setText(""+((sem1+sem2)/2));
				 
			
			}

			private void sem2() {
				// TODO Auto-generated method stub
				
				
				try {
					   Class.forName("com.mysql.jdbc.Driver");
					   Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project?useSSL=false","root","1234");
					   
					   
					   String username = btnId.getText();
					   String pass  = btnPassword.getText();
					   
					   Statement stmt = con.createStatement();
					   //String sql = "select * from student where roll='"+username+"' and password='"+pass+"'";
					   String semi2 = "select Java,DBMS from Sec_Sem where roll='"+username+"'";
					   ResultSet s2 = stmt.executeQuery(semi2);
					   
					   if(s2.next()) {
					   String Java = s2.getString(1);
					   String DBMS = s2.getString(2);
					   
					   int cgp1 = (Integer.valueOf(Java) + Integer.valueOf(DBMS))/2;
					   if(cgp1>90) {
						   sem2 = 10;
					     //  cgpa.setText(""+10);
					   }
					   else if(cgp1>80 && cgp1<=90) {
						   sem2 = 9;
						  // cgpa.setText(""+9);
					   }
					   else {
						   sem2=7;
					   }
					   }
					   
					   
					   
				   }
				   catch(Exception xe) {
					   JOptionPane.showMessageDialog(null, xe);
				   }

				
				
				
				
				
				
			}
		});
		btnlog.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnlog.setBounds(649, 77, 132, 48);
		panel_2.add(btnlog);
		
		btnlogout = new JButton("Logout");
		btnlogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnId.setEditable(true);
				btnPassword.setEditable(true);
				btnNotification.setText("=> Logout Successful <=");
				btnlogout.setEnabled(false);
				btnlog.setEnabled(true);
				
				   btnName.setText("");
				   btnBranch.setText("");
				   btnRoll.setText("");
				   btnSection.setText("");
				   
				   btnId.setText("");
				   btnPassword.setText("");
				   
				   cgpa.setText("");
				   sgpa.setText("");
				   
				   String[] colums = {""};
					comboBox = new JComboBox(colums);
				   
			
			}
		});
		btnlogout.setEnabled(false);
		btnlogout.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnlogout.setBounds(497, 79, 132, 48);
		panel_2.add(btnlogout);
	}
}
