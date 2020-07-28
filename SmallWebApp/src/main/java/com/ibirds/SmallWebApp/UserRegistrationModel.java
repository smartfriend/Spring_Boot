package com.ibirds.SmallWebApp;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_registration")
public class UserRegistrationModel {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long uId;
	private String userName;
	private String userEmail;
	private String userPassword;
	private byte gender;
	private String[] hobby;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public byte getGender() {
		return gender;
	}
	public void setGender(byte gender) {
		this.gender = gender;
	}
	public String[] getHobby() {
		return hobby;
	}
	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}
	@Override
	public String toString() {
		return "UserRegistrationModel [userName=" + userName + ", userEmail=" + userEmail + ", userPassword="
				+ userPassword + ", gender=" + gender + ", hobby=" + Arrays.toString(hobby) + "]";
	}
	
	
	
}
