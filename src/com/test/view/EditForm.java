package com.test.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JCheckBox;
import javax.swing.JTree;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import com.test.model.Student;
import com.test.service.Studentdao;
import com.test.service.StudentdaoImpl;
import com.toedter.calendar.JDateChooser;

public class EditForm extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField rollNumberTxt;
	private JLabel lblNewLabel_1;
	private JTextField fnameTxt;
	private JLabel lblLastName;
	private JTextField lnameTxt;
	private JLabel lblGender;
	private JLabel lblDob;
	private JLabel lblCountry;
	private JLabel lblCity;
	private JLabel lblState;
	private JLabel lblCollege;
	private JLabel lblFaculty;
	private JLabel lblNewLabel_2;
	private JLabel lblPhone;
	private JLabel lblEmail;
	private JTextField countryTxt;
	private JTextField facultyTxt;
	private JTextField phoneTxt;
	private JTextField emailtxt;
	private JTextField collegeTxt;
	private JTextField semesterTxt;
	private JButton btnEdit;
	private JButton btnExit;
	private JComboBox cityCmb;
	private JComboBox stateCmb;
	private JDateChooser dateChooser;
	private JRadioButton rdbtnMale;
	private JRadioButton rdbtnFemale;
	int uid = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentForm frame = new StudentForm();
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
	public EditForm() {
		setTitle("StudentForm");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 932, 556);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getRollNumberTxt());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getFnameTxt());
		contentPane.add(getLblLastName());
		contentPane.add(getLnameTxt());
		contentPane.add(getLblGender());
		contentPane.add(getLblDob());
		contentPane.add(getLblCountry());
		contentPane.add(getLblCity());
		contentPane.add(getLblState());
		contentPane.add(getLblCollege());
		contentPane.add(getLblFaculty());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getLblPhone());
		contentPane.add(getLblEmail());
		contentPane.add(getCountryTxt());
		contentPane.add(getFacultyTxt());
		contentPane.add(getPhoneTxt());
		contentPane.add(getEmailtxt());
		contentPane.add(getCollegeTxt());
		contentPane.add(getSemesterTxt());
		contentPane.add(getBtnEdit());
		contentPane.add(getBtnExit());
		contentPane.add(getCityCmb());
		contentPane.add(getStateCmb());
		contentPane.add(getDateChooser());
		contentPane.add(getRdbtnMale());
		contentPane.add(getRdbtnFemale());
		
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("LastName");
			lblNewLabel.setBounds(463, 48, 48, 14);
		}
		return lblNewLabel;
	}
	private JTextField getRollNumberTxt() {
		if (rollNumberTxt == null) {
			rollNumberTxt = new JTextField();
			rollNumberTxt.setBounds(369, 8, 253, 20);
			rollNumberTxt.setColumns(10);
		}
		return rollNumberTxt;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Rollno");
			lblNewLabel_1.setBounds(313, 11, 75, 14);
		}
		return lblNewLabel_1;
	}
	private JTextField getFnameTxt() {
		if (fnameTxt == null) {
			fnameTxt = new JTextField();
			fnameTxt.setBounds(369, 45, 87, 20);
			fnameTxt.setColumns(10);
		}
		return fnameTxt;
	}
	private JLabel getLblLastName() {
		if (lblLastName == null) {
			lblLastName = new JLabel("Firstname");
			lblLastName.setBounds(313, 48, 80, 14);
		}
		return lblLastName;
	}
	private JTextField getLnameTxt() {
		if (lnameTxt == null) {
			lnameTxt = new JTextField();
			lnameTxt.setBounds(526, 45, 96, 20);
			lnameTxt.setColumns(10);
		}
		return lnameTxt;
	}
	private JLabel getLblGender() {
		if (lblGender == null) {
			lblGender = new JLabel("gender");
			lblGender.setBounds(311, 290, 48, 14);
		}
		return lblGender;
	}
	private JLabel getLblDob() {
		if (lblDob == null) {
			lblDob = new JLabel("DOB");
			lblDob.setBounds(463, 216, 48, 14);
		}
		return lblDob;
	}
	private JLabel getLblCountry() {
		if (lblCountry == null) {
			lblCountry = new JLabel("Country");
			lblCountry.setBounds(311, 91, 48, 14);
		}
		return lblCountry;
	}
	private JLabel getLblCity() {
		if (lblCity == null) {
			lblCity = new JLabel("City");
			lblCity.setBounds(463, 91, 48, 14);
		}
		return lblCity;
	}
	private JLabel getLblState() {
		if (lblState == null) {
			lblState = new JLabel("State");
			lblState.setBounds(311, 132, 48, 14);
		}
		return lblState;
	}
	private JLabel getLblCollege() {
		if (lblCollege == null) {
			lblCollege = new JLabel("College");
			lblCollege.setBounds(463, 132, 48, 14);
		}
		return lblCollege;
	}
	private JLabel getLblFaculty() {
		if (lblFaculty == null) {
			lblFaculty = new JLabel("Faculty");
			lblFaculty.setBounds(311, 175, 48, 14);
		}
		return lblFaculty;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Semester");
			lblNewLabel_2.setBounds(463, 175, 48, 14);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblPhone() {
		if (lblPhone == null) {
			lblPhone = new JLabel("Phone");
			lblPhone.setBounds(311, 216, 48, 14);
		}
		return lblPhone;
	}
	private JLabel getLblEmail() {
		if (lblEmail == null) {
			lblEmail = new JLabel("Email");
			lblEmail.setBounds(311, 258, 48, 14);
		}
		return lblEmail;
	}
	private JTextField getCountryTxt() {
		if (countryTxt == null) {
			countryTxt = new JTextField();
			countryTxt.setBounds(369, 88, 87, 20);
			countryTxt.setColumns(10);
		}
		return countryTxt;
	}
	private JTextField getFacultyTxt() {
		if (facultyTxt == null) {
			facultyTxt = new JTextField();
			facultyTxt.setBounds(369, 172, 87, 20);
			facultyTxt.setColumns(10);
		}
		return facultyTxt;
	}
	private JTextField getPhoneTxt() {
		if (phoneTxt == null) {
			phoneTxt = new JTextField();
			phoneTxt.setBounds(369, 213, 87, 20);
			phoneTxt.setColumns(10);
		}
		return phoneTxt;
	}
	private JTextField getEmailtxt() {
		if (emailtxt == null) {
			emailtxt = new JTextField();
			emailtxt.setBounds(369, 252, 253, 20);
			emailtxt.setColumns(10);
		}
		return emailtxt;
	}
	private JTextField getCollegeTxt() {
		if (collegeTxt == null) {
			collegeTxt = new JTextField();
			collegeTxt.setBounds(526, 129, 96, 20);
			collegeTxt.setColumns(10);
		}
		return collegeTxt;
	}
	private JTextField getSemesterTxt() {
		if (semesterTxt == null) {
			semesterTxt = new JTextField();
			semesterTxt.setBounds(526, 172, 96, 20);
			semesterTxt.setColumns(10);
		}
		return semesterTxt;
	}
	private JButton getBtnEdit() {
		if (btnEdit == null) {
			btnEdit = new JButton("Update");
			btnEdit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					   Student s = new Student();
					   s.setId(uid);
					    s.setFname(fnameTxt.getText());
					    s.setLname(lnameTxt.getText());
					    s.setPhone(phoneTxt.getText());
					    s.setEmail(emailtxt.getText());
					    s.setCollege(collegeTxt.getText());
					    s.setCity(cityCmb.getSelectedItem().toString());
					    s.setState(stateCmb.getSelectedItem().toString());
					    s.setCountry(countryTxt.getText());
					    s.setRollNumber(Integer.parseInt(rollNumberTxt.getText()));
					    s.setSemester(semesterTxt.getText());
					    s.setFaculty(facultyTxt.getText());
					    
					    
					   if(rdbtnMale.isSelected()) {
						   s.setGender("Male");
					   }else {
						   s.setGender("Female");
					   }
					   s.setDob(new Date(dateChooser.getDate().getTime()));
					   
					   Studentdao sdao = new StudentdaoImpl();
					   if(sdao.updateStudent(s)) {
						   JOptionPane.showMessageDialog(null, "Successfully updated ");
					       new StudentForm().setVisible(true);
						   dispose();
					   }else {
						   JOptionPane.showMessageDialog(null, "Not updated.");
					   }
					
				}
			});
			btnEdit.setBounds(311, 315, 311, 23);
		}
		return btnEdit;
	}
	private JButton getBtnExit() {
		if (btnExit == null) {
			btnExit = new JButton("Exit");
			btnExit.setBounds(563, 361, 59, 23);
		}
		return btnExit;
	}
	private JComboBox getCityCmb() {
		if (cityCmb == null) {
			cityCmb = new JComboBox();
			cityCmb.setModel(new DefaultComboBoxModel(new String[] {"Select", "Kathmandu", "Pokhara", "Hetauda", "Birgunj", "Biratnagar"}));
			cityCmb.setBounds(526, 87, 96, 22);
		}
		return cityCmb;
	}
	private JComboBox getStateCmb() {
		if (stateCmb == null) {
			stateCmb = new JComboBox();
			stateCmb.setModel(new DefaultComboBoxModel(new String[] {"Select", "state 1", "state 2", "state 3", "state 4", "state 5", "state 6 ", "state 7"}));
			stateCmb.setBounds(369, 128, 87, 22);
		}
		return stateCmb;
	}
	private JDateChooser getDateChooser() {
		if (dateChooser == null) {
			dateChooser = new JDateChooser();
			dateChooser.setBounds(526, 211, 96, 20);
		}
		return dateChooser;
	}
	private JRadioButton getRdbtnMale() {
		if (rdbtnMale == null) {
			rdbtnMale = new JRadioButton("male");
			rdbtnMale.setBounds(402, 285, 109, 23);
		}
		return rdbtnMale;
	}
	private JRadioButton getRdbtnFemale() {
		if (rdbtnFemale == null) {
			rdbtnFemale = new JRadioButton("female");
			rdbtnFemale.setBounds(513, 285, 109, 23);
		}
		return rdbtnFemale;
	}
	
  public void setData(int id) {
	  uid = id;
	  Studentdao sdao = new StudentdaoImpl();
	  Student s = sdao.getById(id);
	  rollNumberTxt.setText(String.valueOf(s.getRollNumber()));
	  fnameTxt.setText(s.getFname());
	  lnameTxt.setText(s.getLname());
	  countryTxt.setText(s.getCountry());
	  cityCmb.setSelectedItem(s.getCity());
	  stateCmb.setSelectedItem(s.getState());	  
	  collegeTxt.setText(s.getCollege());
	  facultyTxt.setText(s.getFaculty());
	  semesterTxt.setText(s.getSemester());
	  phoneTxt.setText(s.getPhone());
	  dateChooser.setDate(s.getDob());
	  emailtxt.setText(s.getEmail());
	  if(s.getGender().equalsIgnoreCase("male")) {
		  rdbtnMale.setSelected(true);
	  }else {
		  rdbtnFemale.setSelected(true);
	  }
	  
	  
	  
	  
	  
  }
}
