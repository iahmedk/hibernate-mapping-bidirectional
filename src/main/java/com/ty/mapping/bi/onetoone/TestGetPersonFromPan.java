package com.ty.mapping.bi.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class TestGetPersonFromPan {

	public static void main(String[] args) {
		EntityManager entityManager = Persistence.createEntityManagerFactory("Imtiyaz").createEntityManager();

		Person person = entityManager.find(Person.class, 1);

		if (person != null) {
			System.out.println("Name = " + person.getName());
			System.out.println("Phone = " + person.getPhone());
			System.out.println("Email = " + person.getEmail());

			Pan pan = person.getPan();
			System.out.println("Pan num = " + pan.getPanNo());
			System.out.println("Address = " + pan.getAddress());
		}
		else {
			System.out.println("Person doesn't exists");
		}
	}

}
