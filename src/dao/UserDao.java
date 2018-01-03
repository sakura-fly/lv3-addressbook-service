package dao;

import entity.User;

public interface UserDao {
	public int regist(User u);
	public int login(String userid, String pwd);
	public User find(int id);
	public int update(User u);
}
