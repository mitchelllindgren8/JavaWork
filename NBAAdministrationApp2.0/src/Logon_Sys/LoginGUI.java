package Logon_Sys;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import NBAapp.NBAAdminApp;

import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JSeparator;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.awt.event.ActionEvent;

public class LoginGUI {

	private JFrame frame;
	private JTextField txtUsername;
	private JPasswordField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginGUI window = new LoginGUI();
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
	public LoginGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.BLACK);
		frame.setBounds(200, 200, 500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNbaAdministrationApp = new JLabel("NBA Administration App");
		lblNbaAdministrationApp.setFont(new Font("Helvetica", Font.BOLD, 27));
		lblNbaAdministrationApp.setBounds(77, 27, 314, 31);
		frame.getContentPane().add(lblNbaAdministrationApp);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Arial", Font.BOLD, 13));
		lblUsername.setBounds(87, 94, 64, 16);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Arial", Font.BOLD, 13));
		lblPassword.setBounds(87, 147, 64, 16);
		frame.getContentPane().add(lblPassword);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(163, 88, 201, 26);
		frame.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(163, 141, 201, 26);
		frame.getContentPane().add(txtPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				boolean logonSuccess = false;
				String username = txtUsername.getText();
				String password = txtPassword.getText();
				
				//change logic to
				if(username.contains("Celtics") && password.contains("Celtics123")) {

					System.out.println("Test login: Works");
					//NBAAdminApp info = new NBAAdminApp();
					
					try {
						NBAAdminApp.main(null);
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

				}
				else{
					
					txtUsername.setText(null);
					txtPassword.setText(null);
					JOptionPane.showMessageDialog(null, "Invalid Username or Password", "Login Error", JOptionPane.ERROR_MESSAGE);
					System.out.println("Test login: FAILURE");
				}
				
				
			}
		});
		btnLogin.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		btnLogin.setBounds(77, 202, 331, 29);
		frame.getContentPane().add(btnLogin);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnExit.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		btnExit.setBounds(377, 243, 117, 29);
		frame.getContentPane().add(btnExit);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(6, 178, 488, 12);
		frame.getContentPane().add(separator);
	}
}
