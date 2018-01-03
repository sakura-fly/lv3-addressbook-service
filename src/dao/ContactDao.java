package dao;

import java.util.List;

import entity.Contact;
import entity.UserAb;

public interface ContactDao {
	public List<UserAb> listContact(int uid);
	public Contact findById(int id);
	public int update(Contact c);
	public int add(Contact c);
	public int del(int id);
}
