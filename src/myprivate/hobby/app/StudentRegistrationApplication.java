package myprivate.hobby.app;

import myprivate.hobby.service.StudentService;

public class StudentRegistrationApplication {
 public static void main(String[] arg)
 {
	 StudentService studentService=new StudentService(); 
	 String registeredStudentName= studentService.displayName();
	 System.out.println(registeredStudentName);
	 System.out.println(studentService.displayName());
 }
}
