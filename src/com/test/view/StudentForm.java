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
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class StudentForm extends JFrame {

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
	private JTextField textField_13;
	private JButton btnSearch;
	private JScrollPane scrollPane;
	private JTable table;
	private JButton btnNewButton;
	private JLabel lblSomeOtherFeatures;
	private JButton btnDelete;
	private JButton btnView;
	private JButton btnEdit;
	private JButton btnExit;
	private JComboBox cityCmb;
	private JComboBox stateCmb;
	private JDateChooser dateChooser;
	private JRadioButton rdbtnMale;
	private JRadioButton rdbtnFemale;

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
	public StudentForm() {
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
		contentPane.add(getTextField_13());
		contentPane.add(getBtnSearch());
		contentPane.add(getScrollPane());
		contentPane.add(getBtnNewButton());
		contentPane.add(getLblSomeOtherFeatures());
		contentPane.add(getBtnDelete());
		contentPane.add(getBtnView());
		contentPane.add(getBtnEdit());
		contentPane.add(getBtnExit());
		contentPane.add(getCityCmb());
		contentPane.add(getStateCmb());
		contentPane.add(getDateChooser());
		contentPane.add(getRdbtnMale());
		contentPane.add(getRdbtnFemale());
		
		displayData();
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("LastName");
			lblNewLabel.setBounds(167, 48, 48, 14);
		}
		return lblNewLabel;
	}
	private JTextField getRollNumberTxt() {
		if (rollNumberTxt == null) {
			rollNumberTxt = new JTextField();
			rollNumberTxt.setBounds(68, 8, 253, 20);
			rollNumberTxt.setColumns(10);
		}
		return rollNumberTxt;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Rollno");
			lblNewLabel_1.setBounds(10, 11, 75, 14);
		}
		return lblNewLabel_1;
	}
	private JTextField getFnameTxt() {
		if (fnameTxt == null) {
			fnameTxt = new JTextField();
			fnameTxt.setBounds(70, 45, 87, 20);
			fnameTxt.setColumns(10);
		}
		return fnameTxt;
	}
	private JLabel getLblLastName() {
		if (lblLastName == null) {
			lblLastName = new JLabel("Firstname");
			lblLastName.setBounds(10, 48, 48, 14);
		}
		return lblLastName;
	}
	private JTextField getLnameTxt() {
		if (lnameTxt == null) {
			lnameTxt = new JTextField();
			lnameTxt.setBounds(225, 45, 96, 20);
			lnameTxt.setColumns(10);
		}
		return lnameTxt;
	}
	private JLabel getLblGender() {
		if (lblGender == null) {
			lblGender = new JLabel("gender");
			lblGender.setBounds(10, 289, 48, 14);
		}
		return lblGender;
	}
	private JLabel getLblDob() {
		if (lblDob == null) {
			lblDob = new JLabel("DOB");
			lblDob.setBounds(167, 211, 48, 14);
		}
		return lblDob;
	}
	private JLabel getLblCountry() {
		if (lblCountry == null) {
			lblCountry = new JLabel("Country");
			lblCountry.setBounds(10, 91, 48, 14);
		}
		return lblCountry;
	}
	private JLabel getLblCity() {
		if (lblCity == null) {
			lblCity = new JLabel("City");
			lblCity.setBounds(167, 91, 48, 14);
		}
		return lblCity;
	}
	private JLabel getLblState() {
		if (lblState == null) {
			lblState = new JLabel("State");
			lblState.setBounds(10, 132, 48, 14);
		}
		return lblState;
	}
	private JLabel getLblCollege() {
		if (lblCollege == null) {
			lblCollege = new JLabel("College");
			lblCollege.setBounds(167, 132, 48, 14);
		}
		return lblCollege;
	}
	private JLabel getLblFaculty() {
		if (lblFaculty == null) {
			lblFaculty = new JLabel("Faculty");
			lblFaculty.setBounds(10, 175, 48, 14);
		}
		return lblFaculty;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Semester");
			lblNewLabel_2.setBounds(167, 175, 48, 14);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblPhone() {
		if (lblPhone == null) {
			lblPhone = new JLabel("Phone");
			lblPhone.setBounds(10, 211, 48, 14);
		}
		return lblPhone;
	}
	private JLabel getLblEmail() {
		if (lblEmail == null) {
			lblEmail = new JLabel("Email");
			lblEmail.setBounds(10, 255, 48, 14);
		}
		return lblEmail;
	}
	private JTextField getCountryTxt() {
		if (countryTxt == null) {
			countryTxt = new JTextField();
			countryTxt.setBounds(70, 88, 87, 20);
			countryTxt.setColumns(10);
		}
		return countryTxt;
	}
	private JTextField getFacultyTxt() {
		if (facultyTxt == null) {
			facultyTxt = new JTextField();
			facultyTxt.setBounds(70, 172, 87, 20);
			facultyTxt.setColumns(10);
		}
		return facultyTxt;
	}
	private JTextField getPhoneTxt() {
		if (phoneTxt == null) {
			phoneTxt = new JTextField();
			phoneTxt.setBounds(70, 210, 87, 20);
			phoneTxt.setColumns(10);
		}
		return phoneTxt;
	}
	private JTextField getEmailtxt() {
		if (emailtxt == null) {
			emailtxt = new JTextField();
			emailtxt.setBounds(70, 252, 251, 20);
			emailtxt.setColumns(10);
		}
		return emailtxt;
	}
	private JTextField getCollegeTxt() {
		if (collegeTxt == null) {
			collegeTxt = new JTextField();
			collegeTxt.setBounds(225, 129, 96, 20);
			collegeTxt.setColumns(10);
		}
		return collegeTxt;
	}
	private JTextField getSemesterTxt() {
		if (semesterTxt == null) {
			semesterTxt = new JTextField();
			semesterTxt.setBounds(225, 172, 96, 20);
			semesterTxt.setColumns(10);
		}
		return semesterTxt;
	}
	private JTextField getTextField_13() {
		if (textField_13 == null) {
			textField_13 = new JTextField();
			textField_13.addKeyListener(new KeyAdapter() {
				@Override
				public void keyReleased(KeyEvent e) {
					String input = textField_13.getText().trim();
					Studentdao sdao = new StudentdaoImpl();
					List<Student> slist = sdao.searchStudent(input);
					DefaultTableModel model = (DefaultTableModel) table.getModel();
					model.setRowCount(0);
					for(Student s : slist) {
						model.addRow(new Object[] {
								s.getId(),s.getFname(),s.getLname(),s.getPhone()
						});
					}
				
				
				}
			});
			textField_13.setBounds(404, 8, 348, 20);
			textField_13.setColumns(10);
		}
		return textField_13;
	}
	private JButton getBtnSearch() {
		if (btnSearch == null) {
			btnSearch = new JButton("Search");
			btnSearch.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnSearch.setBackground(Color.CYAN);
			btnSearch.setBounds(763, 7, 89, 23);
		}
		return btnSearch;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(404, 47, 448, 425);
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
	}
	private JTable getTable() {
		if (table == null) {
			table = new JTable();
			table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Id", "First Name", "Last Name", "Phone Number"
				}
			));
		}
		return table;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Add Student");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				    Student s = new Student();
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
				   if(sdao.addStudent(s)) {
					   JOptionPane.showMessageDialog(null, "Successfully added. ");
					   displayData();
				   }else {
					   JOptionPane.showMessageDialog(null, "Not added.");
				   }
				   
				   //clear input form
				    rollNumberTxt.setText("");
				    fnameTxt.setText("");
				    lnameTxt.setText("");
				    phoneTxt.setText("");
				    emailtxt.setText("");
				    collegeTxt.setText("");
				    cityCmb.setSelectedIndex(0);
				    stateCmb.setSelectedIndex(0);
				    countryTxt.setText("");
				    semesterTxt.setText("");
				    facultyTxt.setText("");
				    dateChooser.setDate(null);
				}
			});
			btnNewButton.setBounds(10, 314, 311, 23);
		}
		return btnNewButton;
	}
	private JLabel getLblSomeOtherFeatures() {
		if (lblSomeOtherFeatures == null) {
			lblSomeOtherFeatures = new JLabel("Some other features...");
			lblSomeOtherFeatures.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblSomeOtherFeatures.setBounds(10, 358, 311, 23);
		}
		return lblSomeOtherFeatures;
	}
	private JButton getBtnDelete() {
		if (btnDelete == null) {
			btnDelete = new JButton("Delete");
			btnDelete.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(table.getSelectedRow()<0) {
						JOptionPane.showMessageDialog(null, "Select any row");
					return;
					}
					int row = table.getSelectedRow();
					int id = (int) table.getModel().getValueAt(row, 0);
					Studentdao sdao = new StudentdaoImpl();
					if(sdao.deleteStudent(id)) {
						JOptionPane.showMessageDialog(null, "Succesfully deleted");
						displayData();
					}
				}
			});
			btnDelete.setBounds(10, 392, 75, 23);
		}
		return btnDelete;
	}
	private JButton getBtnView() {
		if (btnView == null) {
			btnView = new JButton("View");
			btnView.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(table.getSelectedRow()<0) {
						JOptionPane.showMessageDialog(null, "Select any row");
					return;
					}
					int row = table.getSelectedRow();
					int id = (int) table.getModel().getValueAt(row, 0);
					ViewForm ef = new ViewForm();
					ef.setData(id);
					ef.setVisible(true);
					dispose();
					
				}
			});
			btnView.setBounds(92, 392, 129, 23);
		}
		return btnView;
	}
	private JButton getBtnEdit() {
		if (btnEdit == null) {
			btnEdit = new JButton("Edit");
			btnEdit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				
					if(table.getSelectedRow()<0) {
						JOptionPane.showMessageDialog(null, "Select any row");
					return;
					}
					int row = table.getSelectedRow();
					int id = (int) table.getModel().getValueAt(row, 0);
					EditForm ef = new EditForm();
					ef.setData(id);
					ef.setVisible(true);
					dispose();
				}
			});
			btnEdit.setBounds(225, 392, 96, 23);
		}
		return btnEdit;
	}
	private JButton getBtnExit() {
		if (btnExit == null) {
			btnExit = new JButton("Exit");
			btnExit.setBounds(10, 426, 311, 23);
		}
		return btnExit;
	}
	private JComboBox getCityCmb() {
		if (cityCmb == null) {
			cityCmb = new JComboBox();
			cityCmb.setModel(new DefaultComboBoxModel(new String[] {"Select", "Kathmandu", "Pokhara", "Hetauda", "Birgunj", "Biratnagar"}));
			cityCmb.setBounds(225, 87, 96, 22);
		}
		return cityCmb;
	}
	private JComboBox getStateCmb() {
		if (stateCmb == null) {
			stateCmb = new JComboBox();
			stateCmb.setModel(new DefaultComboBoxModel(new String[] {"Select", "state 1", "state 2", "state 3", "state 4", "state 5", "state 6 ", "state 7"}));
			stateCmb.setBounds(68, 128, 87, 22);
		}
		return stateCmb;
	}
	private JDateChooser getDateChooser() {
		if (dateChooser == null) {
			dateChooser = new JDateChooser();
			dateChooser.setBounds(225, 211, 96, 20);
		}
		return dateChooser;
	}
	private JRadioButton getRdbtnMale() {
		if (rdbtnMale == null) {
			rdbtnMale = new JRadioButton("male");
			rdbtnMale.setBounds(68, 285, 109, 23);
		}
		return rdbtnMale;
	}
	private JRadioButton getRdbtnFemale() {
		if (rdbtnFemale == null) {
			rdbtnFemale = new JRadioButton("female");
			rdbtnFemale.setBounds(192, 285, 109, 23);
		}
		return rdbtnFemale;
	}
	
	//New
	private void displayData() {
		Studentdao sdao = new StudentdaoImpl();
		List<Student> slist = sdao.getAllStudent();
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.setRowCount(0);
		for(Student s : slist) {
			model.addRow(new Object[] {
					s.getId(),s.getFname(),s.getLname(),s.getPhone()
			});
		}
	}
}
