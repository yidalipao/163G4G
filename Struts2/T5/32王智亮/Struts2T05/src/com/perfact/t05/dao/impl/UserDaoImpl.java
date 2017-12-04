package com.perfact.t05.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.perfact.t05.bean.User;
import com.perfact.t05.dao.UserDao;
import com.perfact.t05.util.DBManager;

public class UserDaoImpl implements UserDao {
	private Connection con;
	private PreparedStatement ps; 
	private ResultSet rs;
	public void addUser(User user) {
		con = DBManager.getConnection();
		String sql = "insert into tb_user values(?,?,?,?,?,?,?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, user.getUname());
			ps.setString(2, user.getUpwd());
			ps.setString(3, user.getBirthday());
			ps.setString(4, user.getSex());
			ps.setString(5, user.getAddress());
			System.out.println(ps.executeUpdate()+"已保存");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBManager.close(ps, con);
		}

	}

	@Override
	public List<User> allUser() {
		// 遍历查询
		List<User> list = new ArrayList<User>();
		con = DBManager.getConnection();
		String sql = "select * from tb_user";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				User user = new User(
						rs.getInt("id"),
						rs.getString("uname"), 
						rs.getString("upwd"),
						rs.getString("birthday"),
						rs.getString("sex"),
						rs.getString("address"));
				list.add(user);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBManager.close(ps, con);
		}
		return list;
	}

	@Override
	public void delete(int id) {
		// 删除
		con = DBManager.getConnection();
		String sql = "delete from tb_user where userId = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			System.out.println(ps.executeUpdate()+"条数据删除");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBManager.close(ps, con);
		}
	}

	@Override
	public User getUpdate(int id) {
		// 预查询
		User user = null;
		con = DBManager.getConnection();
		String sql = "select * from tb_user where userId = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			while (rs.next()) {
				user = new User(
						rs.getInt("id"),
						rs.getString("uname"), 
						rs.getString("upwd"),
						rs.getString("birthday"),
						rs.getString("sex"),
						rs.getString("address"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBManager.close(ps, con);
		}
		return user;
	}
	@Override
	public void update(User user) {
		// 修改
		con = DBManager.getConnection();
		String sql = "update tb_user set userName = ?,userPassword = ?,userSex = ?,userAge = ?,phone = ?,QQ = ?,address = ? where userId = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, user.getUname());
			ps.setString(2, user.getBirthday());
			ps.setString(3, user.getSex());
			ps.setString(4, user.getAddress());
			System.out.println(ps.executeUpdate()+"条数据修改");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBManager.close(ps, con);
		}
	}
}
