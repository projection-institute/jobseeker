package com.dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.beans.User;

@Repository
public class UserDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public boolean registerUser(User user) {
		String query = "insert into user(name,email,phone,password) value(?,?,?,?)";
		int result = jdbcTemplate.update(query,user.getName(),user.getEmail(),user.getPhone(),user.getPassword());
		if (result > 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public User loginUser(String email,String password) {
		String query = "select * from user where email = ? and password = ?";
		RowMapper<User> map = new UserMapping();
		ArrayList<User> user = (ArrayList<User>) jdbcTemplate.query(query, map,email,password);
		System.out.println(user);
		return user.isEmpty() ? null : user.get(0);
	}
}

class UserMapping implements RowMapper<User>{
	
	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		User user = new User();
		user.setId(rs.getInt(1));
		user.setName(rs.getString(2));
		user.setEmail(rs.getString(3));
		user.setGender(rs.getString(4));
		user.setDob(rs.getString(5));
		user.setAddress(rs.getString(6));
		user.setPassword(rs.getString(7));
		user.setPhone(rs.getString(8));
		return user;
	}
}
