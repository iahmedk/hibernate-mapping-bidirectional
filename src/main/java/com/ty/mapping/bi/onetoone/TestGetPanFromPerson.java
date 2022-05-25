package com.ty.mapping.bi.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class TestGetPanFromPerson {

	public static void main(String[] args) {
		EntityManager entityManager = Persistence.createEntityManagerFactory("Imtiyaz").createEntityManager();

		Pan pan = entityManager.find(Pan.class, 2);

		if (pan != null) {
			System.out.println("Pan num = " + pan.getPanNo());
			System.out.println("Address = " + pan.getAddress());
			Person person = pan.getPerson();

			System.out.println("Name = " + person.getName());
			System.out.println("Phone = " + person.getPhone());
			System.out.println("Email = " + person.getEmail());

		} else {
			System.out.println("Person doesn't exists");
		}
	}

}
