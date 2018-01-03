package dao;

import java.util.List;

import entity.Group;

public interface GroupDao {
	public int add(String name);
	public List<Group> list(int uid);
	public int del(int id);
	public int changeGro(int cid, int gid);
}
