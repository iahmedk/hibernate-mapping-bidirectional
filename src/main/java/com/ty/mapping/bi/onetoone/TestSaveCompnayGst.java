package com.ty.mapping.bi.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveCompnayGst {

	public static void main(String[] args) {

		EntityManager entityManager = Persistence.createEntityManagerFactory("Imtiyaz").createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Company company = new Company();
		company.setName("Test Yantra");
		company.setPhone(804353453l);
		company.setWeb("www.testyantra.com");

		Gst gst = new Gst();
		gst.setGstNum("LIPNP5356345645");
		gst.setState("Karnataka");
		gst.setCountry("India");
		
		gst.setCompany(company);
		company.setGst(gst);

		entityTransaction.begin();
		entityManager.persist(company);
		entityManager.persist(gst);
		entityTransaction.commit();
	}

}
