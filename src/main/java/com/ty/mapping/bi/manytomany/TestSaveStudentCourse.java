package com.ty.mapping.bi.manytomany;

import java.util.ArrayList;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveStudentCourse {

	public static void main(String[] args) {

		EntityManager entityManager = Persistence.createEntityManagerFactory("Imtiyaz").createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		// Course course1 = entityManager.find(Course.class, 1);
		// Course course2 = entityManager.find(Course.class, 2);

		Course course1 = new Course();
		course1.setName("Core Java");
		course1.setDuration("3 months");

		Course course2 = new Course();
		course2.setName("J2EE");
		course2.setDuration("2 months");

		Course course3 = new Course();
		course3.setName("Python");
		course3.setDuration("2 months");

		Course course4 = new Course();
		course4.setName("Devops");
		course4.setDuration("3 months");

		List<Course> courses1 = new ArrayList<Course>();
		courses1.add(course1);
		courses1.add(course2);

		List<Course> courses2 = new ArrayList<Course>();
		courses2.add(course3);
		courses2.add(course4);

		Student student1 = new Student();
		student1.setAge(30);
		student1.setName("Imtiyaz");
		student1.setCourses(courses1);
		List<Student> students1 = new ArrayList<Student>();
		students1.add(student1);
		course1.setStudents(students1);
		course2.setStudents(students1);

		Student student2 = new Student();
		student2.setAge(25);
		student2.setName("Farheen");
		student2.setCourses(courses2);
		List<Student> students2 = new ArrayList<Student>();
		students2.add(student2);
		course3.setStudents(students2);
		course4.setStudents(students2);

		entityTransaction.begin();
		entityManager.persist(student1);
		//entityManager.persist(course1);
		//entityManager.persist(course2);

		entityManager.persist(student2);
		//entityManager.persist(course3);
//		/entityManager.persist(course4);

		entityTransaction.commit();

		System.out.println("***** Done *****");

	}

}