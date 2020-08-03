package com.example.rpsa.utlities;

public class LoginInfo {

	private UserName userName;
	private Password password;
	private String message;

	public LoginInfo() {

	}

	public UserName getUserName() {
		return userName;
	}

	public void setUserName(UserName userName) {
		this.userName = userName;
	}

	public Password getPassword() {
		return password;
	}

	public void setPassword(Password password) {
		this.password = password;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	
}
