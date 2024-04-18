package edu.jsp.Controller;

import edu.jsp.Model.Student;
import edu.jsp.utility.HibernateUtility;

public class Update {

	public static void main(String[] args) {
		HibernateUtility.transaction.begin();
		Student findStudent = HibernateUtility.entityManager.find(Student.class, 1);
		findStudent.setName("Pranav");
		HibernateUtility.entityManager.merge(findStudent);
		HibernateUtility.transaction.commit();

	}

}
