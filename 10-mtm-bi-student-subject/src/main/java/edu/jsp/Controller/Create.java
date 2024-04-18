package edu.jsp.Controller;

import java.util.ArrayList;

import edu.jsp.Model.Student;
import edu.jsp.Model.Subject;
import edu.jsp.utility.HibernateUtility;

public class Create {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.setId(1);
		student1.setName("Hardik");
		Student student2 = new Student();
		student2.setId(2);
		student2.setName("Ganesh");
		Student student3 = new Student();
		student3.setId(3);
		student3.setName("Siddesh");
		ArrayList studentlist = new ArrayList();
		studentlist.add(student1);
		studentlist.add(student2);
		studentlist.add(student3);
		
		Subject sub1 = new Subject();
		sub1.setId(11);
		sub1.setSubject("jdbc");
		Subject sub2 = new Subject();
		sub2.setId(22);
		sub2.setSubject("hibernate");
		Subject sub3 = new Subject();
		sub3.setId(33);
		sub3.setSubject("servlet");
		ArrayList subjectlist = new ArrayList();
		subjectlist.add(sub1);
		subjectlist.add(sub2);
		subjectlist.add(sub3);
		
		student1.setSubject(subjectlist);
		student2.setSubject(subjectlist);
		student3.setSubject(subjectlist);
		
		sub1.setStudent(studentlist);
		sub2.setStudent(studentlist);
		sub3.setStudent(studentlist);
		HibernateUtility.transaction.begin();
//		HibernateUtility.entityManager.persist(sub1);
//		HibernateUtility.entityManager.persist(sub2);
//		HibernateUtility.entityManager.persist(sub3);
		HibernateUtility.entityManager.persist(student1);
		HibernateUtility.entityManager.persist(student2);
		HibernateUtility.entityManager.persist(student3);
		HibernateUtility.transaction.commit();
		
	}

}
