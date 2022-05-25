package com.ty.mapping.bi.onetomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveMobileSim {

	public static void main(String[] args) {

		EntityManager entityManager = Persistence.createEntityManagerFactory("Imtiyaz").createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		List<Sim> list = new ArrayList<Sim>();

		Sim s1 = new Sim();
		s1.setProvider("BSNL");
		s1.setType("3G");
		
		Sim s2 = new Sim();
		s2.setProvider("Airtel");
		s2.setType("4G");

		Sim s3 = new Sim();
		s3.setProvider("Vodafone");
		s3.setType("3G");

		list.add(s1);
		list.add(s2);
		list.add(s3);

		Mobile mobile = new Mobile();
		mobile.setName("Mi");
		mobile.setPrice(12000);
		mobile.setSim(list);
		
		s1.setMobile(mobile);
		s2.setMobile(mobile);
		s3.setMobile(mobile);
		
		entityTransaction.begin();
		entityManager.persist(mobile);
		//Saving sims explicitly not required since we are cascading
		//entityManager.persist(s1);
		//entityManager.persist(s2);
		//entityManager.persist(s3);
		entityTransaction.commit();
		
		System.out.println("***** Done *****");
	}

}
