package edu.jsp.utility;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class HibernateUtility {
	public static EntityManagerFactory createEntityManagerFactory1 = Persistence.createEntityManagerFactory("pgadmin");
	public static EntityManager entityManager = createEntityManagerFactory1.createEntityManager();
	public static EntityTransaction transaction = entityManager.getTransaction();
}
