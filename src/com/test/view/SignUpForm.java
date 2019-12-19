package com.test.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.test.model.User;
import com.test.service.UserDao;
import com.test.service.UserDaoImpl;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SignUpForm extends JFrame {

	private JPanel contentPane;
	private JLabel lblCreateYourAccount;
	private JLabel lblSignUp;
	private JLabel lblFirstName;
	private JTextField userFnameTxt;
	private JTextField userLnameTxt;
	private JLabel lblLastName;
	private JLabel lblGender;
	private JLabel lblEmail;
	private JTextField userEmailTxt;
	private JLabel lblPhone;
	private JTextField userPhoneTxt;
	private JLabel lblUserName;
	private JTextField userUserNameTxt;
	private JLabel lblPassword;
	private JPasswordField userPasswordTxt;
	private JRadioButton rdbtnMale;
	private JRadioButton rdbtnFemale;
	private JButton btnSignUp;
	private JLabel lblAlreadyHaveAccount;
	private JButton btnLogIn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUpForm frame = new SignUpForm();
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
	public SignUpForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 435, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblCreateYourAccount());
		contentPane.add(getLblSignUp());
		contentPane.add(getLblFirstName());
		contentPane.add(getUserFnameTxt());
		contentPane.add(getUserLnameTxt());
		contentPane.add(getLblLastName());
		contentPane.add(getLblGender());
		contentPane.add(getLblEmail());
		contentPane.add(getUserEmailTxt());
		contentPane.add(getLblPhone());
		contentPane.add(getUserPhoneTxt());
		contentPane.add(getLblUserName());
		contentPane.add(getUserUserNameTxt());
		contentPane.add(getLblPassword());
		contentPane.add(getUserPasswordTxt());
		contentPane.add(getRdbtnMale());
		contentPane.add(getRdbtnFemale());
		contentPane.add(getBtnSignUp());
		contentPane.add(getLblAlreadyHaveAccount());
		contentPane.add(getBtnLogIn());
	}
	private JLabel getLblCreateYourAccount() {
		if (lblCreateYourAccount == null) {
			lblCreateYourAccount = new JLabel("Create your account here.");
			lblCreateYourAccount.setBounds(170, 11, 194, 14);
		}
		return lblCreateYourAccount;
	}
	private JLabel getLblSignUp() {
		if (lblSignUp == null) {
			lblSignUp = new JLabel("Sign Up");
			lblSignUp.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblSignUp.setBounds(191, 26, 97, 33);
		}
		return lblSignUp;
	}
	private JLabel getLblFirstName() {
		if (lblFirstName == null) {
			lblFirstName = new JLabel("First Name");
			lblFirstName.setBounds(32, 73, 86, 14);
		}
		return lblFirstName;
	}
	private JTextField getUserFnameTxt() {
		if (userFnameTxt == null) {
			userFnameTxt = new JTextField();
			userFnameTxt.setBounds(128, 70, 103, 20);
			userFnameTxt.setColumns(10);
		}
		return userFnameTxt;
	}
	private JTextField getUserLnameTxt() {
		if (userLnameTxt == null) {
			userLnameTxt = new JTextField();
			userLnameTxt.setBounds(304, 70, 97, 20);
			userLnameTxt.setColumns(10);
		}
		return userLnameTxt;
	}
	private JLabel getLblLastName() {
		if (lblLastName == null) {
			lblLastName = new JLabel("Last Name");
			lblLastName.setBounds(232, 73, 62, 14);
		}
		return lblLastName;
	}
	private JLabel getLblGender() {
		if (lblGender == null) {
			lblGender = new JLabel("Gender");
			lblGender.setBounds(32, 256, 87, 14);
		}
		return lblGender;
	}
	private JLabel getLblEmail() {
		if (lblEmail == null) {
			lblEmail = new JLabel("Email");
			lblEmail.setBounds(32, 113, 81, 14);
		}
		return lblEmail;
	}
	private JTextField getUserEmailTxt() {
		if (userEmailTxt == null) {
			userEmailTxt = new JTextField();
			userEmailTxt.setBounds(128, 110, 273, 20);
			userEmailTxt.setColumns(10);
		}
		return userEmailTxt;
	}
	private JLabel getLblPhone() {
		if (lblPhone == null) {
			lblPhone = new JLabel("Phone");
			lblPhone.setBounds(32, 147, 62, 14);
		}
		return lblPhone;
	}
	private JTextField getUserPhoneTxt() {
		if (userPhoneTxt == null) {
			userPhoneTxt = new JTextField();
			userPhoneTxt.setBounds(128, 144, 273, 20);
			userPhoneTxt.setColumns(10);
		}
		return userPhoneTxt;
	}
	private JLabel getLblUserName() {
		if (lblUserName == null) {
			lblUserName = new JLabel("User Name");
			lblUserName.setBounds(32, 184, 87, 14);
		}
		return lblUserName;
	}
	private JTextField getUserUserNameTxt() {
		if (userUserNameTxt == null) {
			userUserNameTxt = new JTextField();
			userUserNameTxt.setBounds(129, 181, 272, 20);
			userUserNameTxt.setColumns(10);
		}
		return userUserNameTxt;
	}
	private JLabel getLblPassword() {
		if (lblPassword == null) {
			lblPassword = new JLabel("Password");
			lblPassword.setBounds(32, 220, 81, 14);
		}
		return lblPassword;
	}
	private JPasswordField getUserPasswordTxt() {
		if (userPasswordTxt == null) {
			userPasswordTxt = new JPasswordField();
			userPasswordTxt.setBounds(128, 218, 273, 17);
		}
		return userPasswordTxt;
	}
	private JRadioButton getRdbtnMale() {
		if (rdbtnMale == null) {
			rdbtnMale = new JRadioButton("Male");
			rdbtnMale.setBounds(165, 252, 62, 23);
		}
		return rdbtnMale;
	}
	private JRadioButton getRdbtnFemale() {
		if (rdbtnFemale == null) {
			rdbtnFemale = new JRadioButton("Female");
			rdbtnFemale.setBounds(267, 252, 109, 23);
		}
		return rdbtnFemale;
	}
	private JButton getBtnSignUp() {
		if (btnSignUp == null) {
			btnSignUp = new JButton("Sign Up");
			btnSignUp.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					User u = new User();
					u.setUserFirstName(userFnameTxt.getText());
					u.setUserLastName(userLnameTxt.getText());
					u.setUserEmail(userEmailTxt.getText());
					u.setUserPhone(Long.parseLong(userPhoneTxt.getText()));
					u.setUserUserName(userUserNameTxt.getText());
					u.setUserPassword(userPasswordTxt.getText());
					if(rdbtnMale.isSelected()) {
						u.setUserGender("Male");
					}else {
						u.setUserGender("Female");
					}
					
					UserDao udao = new UserDaoImpl();
					if(udao.addUser(u)) {
						JOptionPane.showMessageDialog(null, "Your account is created succesfully. You can now log in.");	
					    LogInForm lf = new LogInForm();
					    lf.setVisible(true);
					    dispose();
					}else
					{
						JOptionPane.showMessageDialog(null, "Something went wrong while creating your account, pleas try again!!!");
					}
				}
			});
			btnSignUp.setBackground(Color.GREEN);
			btnSignUp.setFont(new Font("Tahoma", Font.BOLD, 15));
			btnSignUp.setBounds(91, 299, 273, 79);
		}
		return btnSignUp;
	}
	private JLabel getLblAlreadyHaveAccount() {
		if (lblAlreadyHaveAccount == null) {
			lblAlreadyHaveAccount = new JLabel("Already have account.");
			lblAlreadyHaveAccount.setBounds(32, 400, 164, 14);
		}
		return lblAlreadyHaveAccount;
	}
	private JButton getBtnLogIn() {
		if (btnLogIn == null) {
			btnLogIn = new JButton("Log In");
			btnLogIn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					LogInForm lf = new LogInForm();
					lf.setVisible(true);
					dispose();
				}
			});
			btnLogIn.setBounds(209, 396, 155, 23);
		}
		return btnLogIn;
	}
}
