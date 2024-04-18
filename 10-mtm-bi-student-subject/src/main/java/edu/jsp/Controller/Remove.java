package edu.jsp.Controller;

import java.util.List;

import edu.jsp.Model.Student;
import edu.jsp.Model.Subject;
import edu.jsp.utility.HibernateUtility;

public class Remove {

	public static void main(String[] args) {
		
		Student findStudent1 = HibernateUtility.entityManager.find(Student.class, 1);
		
		findStudent1.setSubject(null);
		Student findStudent2 = HibernateUtility.entityManager.find(Student.class, 2);
		
		findStudent2.setSubject(null);
		Student findStudent3 = HibernateUtility.entityManager.find(Student.class, 3);
		
		findStudent3.setSubject(null);
		HibernateUtility.transaction.begin();
		HibernateUtility.entityManager.merge(findStudent1);
		HibernateUtility.entityManager.merge(findStudent2);
		HibernateUtility.entityManager.merge(findStudent3);
		
		Subject findSubject1 = HibernateUtility.entityManager.find(Subject.class, 11);
		Subject findSubject2 = HibernateUtility.entityManager.find(Subject.class, 22);
		Subject findSubject3 = HibernateUtility.entityManager.find(Subject.class, 33);
		
		HibernateUtility.entityManager.remove(findSubject1);
		HibernateUtility.entityManager.remove(findSubject2);
		HibernateUtility.entityManager.remove(findSubject3);
		HibernateUtility.transaction.commit();
		

	}

}
