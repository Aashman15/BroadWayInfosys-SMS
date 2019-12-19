package com.test.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.test.db.Db;
import com.test.model.User;
import com.test.view.LogInForm;
import com.test.view.StudentForm;

public class UserDaoImpl implements UserDao{

	Connection con = Db.getDb();
	@Override
	public boolean addUser(User u) {
		String sql = "insert into user (firstName,lastName,email,phone,userName,password,gender)values(?,?,?,?,?,?,?)";
		try {
			PreparedStatement stm = con.prepareStatement(sql);
			stm.setString(1, u.getUserFirstName());
			stm.setString(2, u.getUserLastName());
			stm.setString(3, u.getUserEmail());
			stm.setLong(4, u.getUserPhone());
			stm.setString(5, u.getUserUserName());
			stm.setString(6, u.getUserPassword());
			stm.setString(7, u.getUserGender());

			stm.execute();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return false;
	}
	@Override
	public boolean logIn(String userName, String password) {
		String sql = "select * from user";
		try {
			Statement stm = con.prepareStatement(sql);
			ResultSet rs = stm.executeQuery(sql);
      
			while(rs.next()) {
				if(rs.getString("userName").equalsIgnoreCase(userName) && rs.getString("password").equalsIgnoreCase(password)) {
					StudentForm sf = new StudentForm();
					sf.setVisible(true);
					LogInForm lf = new LogInForm();
					lf.dispose();
					return true;
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	
		
        		return false;
	}

}
