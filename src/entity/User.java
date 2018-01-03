package entity;

public class User extends UserAb{

	private String userid;
	private String password;
	private String hobby;
	private String remark;


	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
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
		builder.append("{\"userid\":\"");
		builder.append(userid);
		builder.append("\",\"password\":\"");
		builder.append(password);
		builder.append("\",\"hobby\":\"");
		builder.append(hobby);
		builder.append("\",\"remark\":\"");
		builder.append(remark);
		builder.append("\"}  ");
		return builder.toString();
	}

}
