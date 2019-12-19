package com.test.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.test.service.UserDao;
import com.test.service.UserDaoImpl;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LogInForm extends JFrame {
	private JPanel contentPane;
	private JLabel lblLogIn;
	private JLabel lblUserName;
	private JTextField userNameTxt;
	private JPasswordField passwordTxt;
	private JLabel lblPassword;
	private JButton btnLogIn;
	private JLabel lblDoNotHave;
	private JButton btnSignUp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogInForm frame = new LogInForm();
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
	public LogInForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 435, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblLogIn());
		contentPane.add(getLblUserName());
		contentPane.add(getUserNameTxt());
		contentPane.add(getPasswordTxt());
		contentPane.add(getLblPassword());
		contentPane.add(getBtnLogIn());
		contentPane.add(getLblDoNotHave());
		contentPane.add(getBtnSignUp());
	}

	private JLabel getLblLogIn() {
		if (lblLogIn == null) {
			lblLogIn = new JLabel("Log In");
			lblLogIn.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblLogIn.setBounds(210, 14, 117, 36);
		}
		return lblLogIn;
	}
	private JLabel getLblUserName() {
		if (lblUserName == null) {
			lblUserName = new JLabel("User Name");
			lblUserName.setBounds(55, 64, 106, 14);
		}
		return lblUserName;
	}
	private JTextField getUserNameTxt() {
		if (userNameTxt == null) {
			userNameTxt = new JTextField();
			userNameTxt.setBounds(160, 61, 205, 20);
			userNameTxt.setColumns(10);
		}
		return userNameTxt;
	}
	private JPasswordField getPasswordTxt() {
		if (passwordTxt == null) {
			passwordTxt = new JPasswordField();
			passwordTxt.setBounds(160, 109, 205, 20);
		}
		return passwordTxt;
	}
	private JLabel getLblPassword() {
		if (lblPassword == null) {
			lblPassword = new JLabel("Password");
			lblPassword.setBounds(55, 112, 85, 14);
		}
		return lblPassword;
	}
	private JButton getBtnLogIn() {
		if (btnLogIn == null) {
			btnLogIn = new JButton("Log In");
			btnLogIn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					String userName = userNameTxt.getText();
					String password = passwordTxt.getText();
					
					UserDao udao = new UserDaoImpl();
					
					if(udao.logIn(userName, password)) {
	                      JOptionPane.showMessageDialog(null, "Welcome!!!");
	                      dispose();
					}else {
						JOptionPane.showMessageDialog(null, "Couldn't log in, your password or user name is wrong!!!");
					}
					
					
				}
			});
			btnLogIn.setBackground(Color.GREEN);
			btnLogIn.setFont(new Font("Tahoma", Font.BOLD, 20));
			btnLogIn.setBounds(160, 154, 205, 78);
		}
		return btnLogIn;
	}
	private JLabel getLblDoNotHave() {
		if (lblDoNotHave == null) {
			lblDoNotHave = new JLabel("Do not have account yet");
			lblDoNotHave.setBounds(206, 257, 139, 14);
		}
		return lblDoNotHave;
	}
	private JButton getBtnSignUp() {
		if (btnSignUp == null) {
			btnSignUp = new JButton("Sign Up");
			btnSignUp.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					SignUpForm sf = new SignUpForm();
					sf.setVisible(true);
					dispose();
				}
			});
			btnSignUp.setBounds(218, 283, 89, 23);
		}
		return btnSignUp;
	}
}
