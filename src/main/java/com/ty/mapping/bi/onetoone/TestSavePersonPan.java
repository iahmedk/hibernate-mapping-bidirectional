package com.ty.mapping.bi.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSavePersonPan {

	public static void main(String[] args) {

		EntityManager entityManager = Persistence.createEntityManagerFactory("Imtiyaz").createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Person person = new Person();
		person.setName("Farheen");
		person.setEmail("farheentaj1994@gmail.com");
		person.setPhone(9986985746l);

		Pan pan = new Pan();
		pan.setAddress("Bangalore");
		pan.setPanNo("BJWPK3777F");

		person.setPan(pan);
		pan.setPerson(person);

		entityTransaction.begin();
		entityManager.persist(pan);
		entityManager.persist(person);
		entityTransaction.commit();
	}
}
