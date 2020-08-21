package com.ct.springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Customer {
	
	private String firstName;
	
	@NotNull(message="is Required")
	@Size(min=1, message="is Required")
	private String lastName;
	
	@NotNull(message = "is required")
	@Min(value=18, message="age must be atleast 18 to register")
	@Max(value=24, message="age must be less than 24 to register")
	private Integer age;
	
	@Pattern(regexp = "^[0-9]{6}", message = "exactly 6 digits required")
	private String pinCode;
	
	@StartsWith(value="CT", message="must start with CT")
	private String courseCode;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
}
