package entity;

public class Contact extends UserAb {


	private int uid;
	private String sex;
	private String birthday;
	private String phone;

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getGroupid() {
		return groupid;
	}

	public void setGroupid(String groupid) {
		this.groupid = groupid;
	}

	private String Email;
	private String Address;
	private String groupid;
	private String remark;

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getGroup() {
		return groupid;
	}

	public void setGroup(String group) {
		this.groupid = group;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("{\"uid\":\"");
		builder.append(uid);
		builder.append("\",\"sex\":\"");
		builder.append(sex);
		builder.append("\",\"birthday\":\"");
		builder.append(birthday);
		builder.append("\",\"phone\":\"");
		builder.append(phone);
		builder.append("\",\"Email\":\"");
		builder.append(Email);
		builder.append("\",\"Address\":\"");
		builder.append(Address);
		builder.append("\",\"groupid\":\"");
		builder.append(groupid);
		builder.append("\",\"remark\":\"");
		builder.append(remark);
		builder.append("\"}  ");
		return builder.toString();
	}
}
