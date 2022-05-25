package com.ty.mapping.bi.onetomany;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestDeleteMobile {

	public static void main(String[] args) {
		EntityManager entityManager = Persistence.createEntityManagerFactory("Imtiyaz").createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Mobile mobile = entityManager.find(Mobile.class, 1);

		entityTransaction.begin();
		if (mobile != null) {
			entityManager.remove(mobile);
		}

		entityTransaction.commit();
		
		System.out.println("***** Done *****");
	}
}
