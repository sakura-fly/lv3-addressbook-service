package entity;

public class User{
    private int id;
	private String userName;
	private String password;
	private String hobby;
	private String remark;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserName() {
		return userName;
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
		builder.append("{\"id\":\"");
		builder.append(id);
		builder.append("{\"userName\":\"");
		builder.append(userName);
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
