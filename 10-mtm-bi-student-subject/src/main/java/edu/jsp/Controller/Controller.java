package edu.jsp.Controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory createEntityManagerFactory1 = Persistence.createEntityManagerFactory("pgadmin");
		EntityManager entityManager = createEntityManagerFactory1.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
	}

}
