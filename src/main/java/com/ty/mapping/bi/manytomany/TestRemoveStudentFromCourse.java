package com.ty.mapping.bi.manytomany;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestRemoveStudentFromCourse {

	public static void main(String[] args) {

		EntityManager entityManager = Persistence.createEntityManagerFactory("Imtiyaz").createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Student s = entityManager.find(Student.class, 2);

		entityTransaction.begin();
		if (s != null) {

			entityManager.remove(s);

		} else {
			System.out.println("Specified Student doesn't exists");
		}
		entityTransaction.commit();

		System.out.println("***** Done *****");
	}

}
