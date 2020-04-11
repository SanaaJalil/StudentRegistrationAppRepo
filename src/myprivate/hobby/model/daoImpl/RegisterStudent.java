package myprivate.hobby.model.daoImpl;

import java.util.Date;

import myprivate.hobby.dao.Person;

public class RegisterStudent implements Person {

	@Override
	public String registerStudent() {
		return "Sanaa"+" "+"Jalil"+" "+"Abd"+"is registered";
	}

	@Override
	public String calculateAge(Date dateOfBirth) {
		return null;
	}

}
