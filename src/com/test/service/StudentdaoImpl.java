package com.test.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.test.db.Db;
import com.test.model.Student;

public class StudentdaoImpl implements Studentdao{
	
	Connection  con = null;
	
	public StudentdaoImpl() {
		 con = Db.getDb();
	}

	@Override
	public boolean addStudent(Student s) {
		 
		String sql = "insert into student(fname,lname,gender,dob,phone,email,college,semester,faculty,country,state,city,rollNumber)values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement  pstm = con.prepareStatement(sql);
			
			pstm.setString(1, s.getFname());
			pstm.setString(2, s.getLname());
			pstm.setString(3, s.getGender());
			pstm.setDate(4, s.getDob());
			pstm.setString(5, s.getPhone());
			pstm.setString(6, s.getEmail());
			pstm.setString(7, s.getCollege());
			pstm.setString(8, s.getSemester());
			pstm.setString(9, s.getFaculty());
			pstm.setString(10, s.getCountry());
			pstm.setString(11, s.getState());
			pstm.setString(12, s.getCity());
			pstm.setInt(13, s.getRollNumber());
			
			pstm.execute();
			return true;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
		return false;
	}	
	
	@Override
	public boolean deleteStudent(int id) {
            String sql = "delete from student where id = " + id;
            try {
				Statement stm = con.createStatement();
				stm.execute(sql);
				return true;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		return false;
	}

	@Override
	public boolean updateStudent(Student s) {
		String sql = "update student set fname=?,lname=?,gender=?,dob=?,phone=?,email=?,college=?,semester=?,faculty=?,country=?,state=?,city=?,rollNumber=? where id = ?";
		
		try {
		
		PreparedStatement  pstm = con.prepareStatement(sql);
			
			pstm.setString(1, s.getFname());
			pstm.setString(2, s.getLname());
			pstm.setString(3, s.getGender());
			pstm.setDate(4, s.getDob());
			pstm.setString(5, s.getPhone());
			pstm.setString(6, s.getEmail());
			pstm.setString(7, s.getCollege());
			pstm.setString(8, s.getSemester());
			pstm.setString(9, s.getFaculty());
			pstm.setString(10, s.getCountry());
			pstm.setString(11, s.getState());
			pstm.setString(12, s.getCity());
			pstm.setInt(13, s.getRollNumber());
			pstm.setInt(14, s.getId());
			pstm.execute();
			return true;
	
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
		return false;
	}

	//New
	@Override
	public Student getById(int id) {
		Student s = new Student();
         String sql = "select * from student where id = " + id;
         try {
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			if(rs.next()) {
				
				s.setId(rs.getInt("Id"));
				s.setFname(rs.getString("fname"));
				s.setLname(rs.getString("lname"));
				s.setGender(rs.getString("gender"));
				s.setDob(rs.getDate("dob"));
                s.setCountry(rs.getString("country"));
                s.setState(rs.getString("state"));
                s.setCollege(rs.getString("college"));
                s.setFaculty(rs.getString("faculty"));
                s.setSemester(rs.getString("semester"));
                s.setPhone(rs.getString("phone"));
                s.setEmail(rs.getString("email"));
                s.setRollNumber(rs.getInt("rollNumber"));
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return s;
	}

	@Override
	public List<Student> getAllStudent() {
		List<Student> slist = new ArrayList<Student>();
          String sql = "select * from student";
          try {
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			while(rs.next()) {
				Student s = new Student();
				s.setId(rs.getInt("Id"));
				s.setFname(rs.getString("fname"));
				s.setLname(rs.getString("lname"));
				s.setPhone(rs.getString("phone"));
				slist.add(s);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return slist;
	}

	@Override
	public List<Student> searchStudent(String input) {
        //like sql
		List<Student> slist = new ArrayList<Student>();
        String sql = "select * from student where fname like '%"+input+"%' OR phone like '%"+input+"%'";
        try {
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			while(rs.next()) {
				Student s = new Student();
				s.setId(rs.getInt("Id"));
				s.setFname(rs.getString("fname"));
				s.setLname(rs.getString("lname"));
				s.setPhone(rs.getString("phone"));
				slist.add(s);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return slist;
	}

}
