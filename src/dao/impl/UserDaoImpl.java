package dao.impl;





import java.sql.Connection;
import java.sql.PreparedStatement;
import com.mysql.jdbc.ResultSet;

import dao.UserDao;
import entity.User;
import utils.MyDBUtils;

public class UserDaoImpl implements UserDao{

	@Override
	public int regist(User u) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement pstm=null;
		ResultSet rs=null;
		try {
			conn=MyDBUtils.getConnection();
			String sql = "insert into user(userName,passowrd,hobby,remark) values(?,?,?,?);";
		    pstm =  conn.prepareStatement(sql);		
			pstm.setObject(1, u.getUserName());
			pstm.setObject(2,u.getPassword());
			pstm.setObject(3,u.getHobby());
			pstm.setObject(4,u.getRemark());
			pstm.executeUpdate();
			conn.commit();
		} catch (Exception e) {
			e.printStackTrace();
			return 1;
		}finally {
			MyDBUtils.myClose(rs, pstm, conn);
			System.out.println("修改成功！");
		}	
		return 0;
	}

	@Override
	public int login(String userName, String pwd) {
		Connection conn = null;
		ResultSet rs=null;
		PreparedStatement pstm =null;
		try {
			conn=MyDBUtils.getConnection();
			String sql="select * from user where userName=? and password=?";
		    pstm = conn.prepareStatement(sql);
			pstm.setObject(1, userName);
			pstm.setObject(2, pwd);
			rs=(ResultSet) pstm.executeQuery();
            boolean boo = rs.next();
			if(boo == false){
		     return 1;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			MyDBUtils.myClose(rs, pstm, conn);
		}	
		return 0;
	}

	@Override
	public User find(int id) {
		Connection conn = null;
		ResultSet rs=null;
		PreparedStatement pstm =null;
		User user=new User();
		try {
			conn=MyDBUtils.getConnection();
			String sql="select * from user where id=?";
		    pstm = conn.prepareStatement(sql);
			pstm.setObject(1, id);
			rs=(ResultSet) pstm.executeQuery();
			while(rs.next()){
				user.setId(rs.getInt("id"));
				user.setUserName(rs.getString("userName"));
				user.setPassword(rs.getString("password"));
				user.setHobby(rs.getString("hobby"));
				user.setRemark(rs.getString("remark"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			MyDBUtils.myClose(rs, pstm, conn);
		}	
		return user;
	}

	@Override
	public int update(User u) {
		// TODO Auto-generated method stub
		return 0;
	}

}
