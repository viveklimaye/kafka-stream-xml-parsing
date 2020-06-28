package com.example.models;

public class StudentInfoModel extends BaseModel {

	private int id;
	private String givenName;
	private String middleName;
	private String lastName;

	public StudentInfoModel() {
		this.setCurrentClassName(StudentInfoModel.class.getName());
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGivenName() {
		return givenName;
	}

	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
