package myprivate.hobby.service;

import myprivate.hobby.model.daoImpl.RegisterStudent;

public class StudentService {

	public String displayName()
	{
		RegisterStudent registerStudent= new RegisterStudent();
		String registeredStudentName=registerStudent.registerStudent();
		return registeredStudentName;
		
		
	}
}
