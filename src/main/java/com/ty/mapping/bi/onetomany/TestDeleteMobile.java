package com.ty.mapping.bi.onetomany;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestDeleteMobile {

	public static void main(String[] args) {
		EntityManager entityManager = Persistence.createEntityManagerFactory("Imtiyaz").createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Mobile mobile = entityManager.find(Mobile.class, 1);
		List<Sim> sims = mobile.getSim();

		entityTransaction.begin();
		if (mobile != null) {

			for (Sim sim : sims) {
				entityManager.remove(sim);
			}

			entityManager.remove(mobile);
		}

		entityTransaction.commit();
	}
}
