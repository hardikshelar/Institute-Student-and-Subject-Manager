package edu.jsp.Controller;

import edu.jsp.Model.Student;
import edu.jsp.utility.HibernateUtility;

public class Find {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student findStudent = HibernateUtility.entityManager.find(Student.class, 1);
		System.out.println(findStudent);
	}

}
