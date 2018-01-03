package entity;

public class Group {
	private int id;
	private int uid;
	private String groupid;
	private String groupname;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getGroupid() {
		return groupid;
	}

	public void setGroupid(String groupid) {
		this.groupid = groupid;
	}

	public String getGroupname() {
		return groupname;
	}

	public void setGroupname(String groupname) {
		this.groupname = groupname;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("{\"id\":\"");
		builder.append(id);
		builder.append("\",\"uid\":\"");
		builder.append(uid);
		builder.append("\",\"groupid\":\"");
		builder.append(groupid);
		builder.append("\",\"groupname\":\"");
		builder.append(groupname);
		builder.append("\"}  ");
		return builder.toString();
	}
}
