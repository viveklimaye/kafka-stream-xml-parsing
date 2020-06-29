package com.example.parsing;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.example.models.BaseModel;
import com.example.models.ResultInfoModel;
import com.example.models.StudentInfoModel;
import com.example.myschema.ExamResult;
import com.example.myschema.ExamResult.Subjects.Subject;

public class ModelParser {

	public ExamResult parseData(String xmlDataString) throws JAXBException {
		JAXBContext jaxbContext = JAXBContext.newInstance(ExamResult.class);
		Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
		return (ExamResult) unmarshaller.unmarshal(new StringReader(xmlDataString));
	}

	public List<BaseModel> getStudentInfoData(ExamResult examResults) {
		List<BaseModel> studentInfoModelList = new ArrayList<>();

		StudentInfoModel currentModel = new StudentInfoModel();

		currentModel.setCurrentClassName(StudentInfoModel.class.getName());
		currentModel.setId(examResults.getStudentInfo().getId());
		currentModel.setGivenName(examResults.getStudentInfo().getGivenName());
		currentModel.setMiddleName(examResults.getStudentInfo().getMiddleName());
		currentModel.setLastName(examResults.getStudentInfo().getLastName());

		studentInfoModelList.add(currentModel);

		return studentInfoModelList;
	}

	public List<BaseModel> getResultInfoData(ExamResult examResults) {
		List<BaseModel> resultInfoModelList = new ArrayList<>();

		for (Subject subjectData : examResults.getSubjects().getSubject()) {
			ResultInfoModel currentModel = new ResultInfoModel();

			currentModel.setCurrentClassName(ResultInfoModel.class.getName());
			currentModel.setStudentId(examResults.getStudentInfo().getId());
			currentModel.setSubjectCode(subjectData.getCode());
			currentModel.setSubject(subjectData.getName());
			currentModel.setMarksObtained(subjectData.getMarksObtained());

			resultInfoModelList.add(currentModel);

		}

		return resultInfoModelList;
	}

}
