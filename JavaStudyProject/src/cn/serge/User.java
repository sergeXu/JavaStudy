package cn.serge;

import java.util.Date;

public class User {
	private long userInnerId=10000;
	private String userId;
	private String userName;
	private String password;
	private String phoneNumber;
	private Date registerDate;
	public User(String userId, String userName,String password,String phoneNumber)
	{
		this.userId= userId;
		this.userName = userName;
		this.password = password;
		this.phoneNumber= phoneNumber;
		this.registerDate = new Date();
		
	}
	
	public long getUserInnerId() {
		return userInnerId;
	}
	public void setUserInnerId(long userInnerId) {
		this.userInnerId = userInnerId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Date getRegisterDate() {
		return registerDate;
	}
	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}
	@Override
	public String toString() {
		return "User [userInnerId=" + userInnerId + ", userId=" + userId + ", userName=" + userName + ", password="
				+ password + ", phoneNumber=" + phoneNumber + ", registerDate=" + registerDate + "]";
	}
	
	
	

}
