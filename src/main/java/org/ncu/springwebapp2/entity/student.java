package org.ncu.springwebapp2.entity;

import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.ncu.springwebapp2.validator.CourseCode;
import org.springframework.format.annotation.DateTimeFormat;

public class student {
	
	@CourseCode
	private String course;

	@NotEmpty(message = "is required")
	@Size(min = 2, max = 30, message = "Max length is 30 and min length is 2")
	@Pattern(regexp="^[a-zA-Z]*$", message = "No special characters allowed")
	private String name;

	@NotNull(message = "is required")
	@Size(min = 8, max = 8, message = "8 spaces needed to fill")
	@Pattern(regexp = "^(?=.{8,})(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$", message = "only char/digit allowed")
	private String pass;


	@Pattern(regexp = "^[0-9]{10}$", message = "only digits allowed")
	private String phNo;

	@NotNull(message = "is required")
	@Size(min = 12, max = 12, message = "invalid aadharId")
	private String aadharId;

	@Email(message = "invalid email")
	@NotEmpty(message = " is required")
	private String mail;

	@NotNull(message = "is required")
	private String gender;

//	@NotNull(message = "is required")
//	private String otherOptions;

	@NotNull
//	private String state;
//	private String stateOptions;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@NotNull(message = "is required")
	@Past
	private Date date;

	@NotNull(message = "is required")
	@Size(max = 50, message = "max 50 characters allowed")
	private String address;

	public student() {

		// added values for otherOptions
//		otherOptions = new ArrayList<>();
//		otherOptions.add("PAN");
//		otherOptions.add("Voter ID");
//		otherOptions.add("Driving License");
//		otherOptions.add("Employee Id");

		// added values for stateOptions
//		stateOptions = new HashMap<>();
//		stateOptions.put("HR", "Haryana");
//		stateOptions.put("PB", "Punjab");
//		stateOptions.put("DL", "Delhi");
//		stateOptions.put("UP", "Uttar Pradesh");
//		stateOptions.put("KR", "Karnataka");
//		stateOptions.put("TN", "Tamil Nadu");
//		stateOptions.put("MP", "Madhya Pradesh");

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getAadharId() {
		return aadharId;
	}

	public void setAadharId(String aadharId) {
		this.aadharId = aadharId;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getPhNo() {
		return phNo;
	}

	public void setPhNo(String phNo) {
		this.phNo = phNo;
	}

//	public List<String> getOtherOptions() {
//		return otherOptions;
//	}
//
//	public void setOtherOptions(List<String> otherOptions) {
//		this.otherOptions = otherOptions;
//	}

//	public String getState() {
//		return state;
//	}
//
//	public void setState(String state) {
//		this.state = state;
//	}

//	public Map<String, String> getStateOptions() {
//		return stateOptions;
//	}
//
//	public void setStateOptions(Map<String, String> stateOptions) {
//		this.stateOptions = stateOptions;
//	}

	public String getAddress() {
		return address;
	}

//	public String getOtherOptions() {
//		return otherOptions;
//	}
//
//	public void setOtherOptions(String otherOptions) {
//		this.otherOptions = otherOptions;
//	}
//
//	public String getStateOptions() {
//		return stateOptions;
//	}
//
//	public void setStateOptions(String stateOptions) {
//		this.stateOptions = stateOptions;
//	}

	public void setAddress(String address) {
		this.address = address;
	}
	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "student [course=" + course + ", name=" + name + ", pass=" + pass + ", phNo=" + phNo + ", aadharId="
				+ aadharId + ", mail=" + mail + ", gender=" + gender + ", date=" + date + ", address=" + address + "]";
	}

}
