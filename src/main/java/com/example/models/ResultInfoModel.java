package com.example.models;

public class ResultInfoModel extends BaseModel {

	private int studentId;
	private String subjectCode;
	private String subject;
	private int marksObtained;

	public ResultInfoModel() {
		this.setCurrentClassName(ResultInfoModel.class.getName());
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getSubjectCode() {
		return subjectCode;
	}

	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getMarksObtained() {
		return marksObtained;
	}

	public void setMarksObtained(int marksObtained) {
		this.marksObtained = marksObtained;
	}

}
