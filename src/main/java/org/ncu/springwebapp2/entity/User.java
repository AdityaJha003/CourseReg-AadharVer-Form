package org.ncu.springwebapp2.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class User {
	private String userName;
	private String userPassword;
	private String aadharId;
	private String state;
	private Map<String, String> stateOptions;
	private String gender;
	private List<String> otherOptions;
	private String address;
	
	public User() {
		
		// added values for otherOptions
		otherOptions = new ArrayList<>();
		otherOptions.add("PAN");
		otherOptions.add("Voter ID");
		otherOptions.add("Driving License");
		otherOptions.add("Employee Id");
		
		// added values for stateOptions
		stateOptions = new HashMap<>();
		stateOptions.put("HR", "Haryana");
		stateOptions.put("PB", "Punjab");
		stateOptions.put("DL", "Delhi");
		stateOptions.put("UP", "Uttar Pradesh");
		stateOptions.put("KR", "Karnataka");
		stateOptions.put("TN", "Tamil Nadu");
		stateOptions.put("MP", "Madhya Pradesh");
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getAadharId() {
		return aadharId;
	}
	public void setAadharId(String aadharId) {
		this.aadharId =aadharId;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Map<String, String> getStateOptions() {
		return stateOptions;
	}
	public void setStateOptions(Map<String, String> stateOptions) {
		this.stateOptions = stateOptions;
	}

	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public List<String> getOtherOptions() {
		return otherOptions;
	}
	public void setOtherOptions(List<String> otherOptions) {
		this.otherOptions = otherOptions;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	// override is used to 
	@Override
	public String toString() {
		return "User [userName=" + userName + ", userPassword=" + userPassword + ", aadharId=" + aadharId + ", state="
				+ state + ", gender=" + gender + ", otherOptions=" + otherOptions + ", address=" + address + "]";
	}
	
	
}
