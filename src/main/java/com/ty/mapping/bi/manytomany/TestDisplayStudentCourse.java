package com.ty.mapping.bi.manytomany;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class TestDisplayStudentCourse {

	public static void main(String[] args) {

		EntityManager entityManager = Persistence.createEntityManagerFactory("Imtiyaz").createEntityManager();

		Student s = entityManager.find(Student.class, 2);

		if (s != null) {

			System.out.println("Name = " + s.getName());
			System.out.println("Age = " + s.getAge());
			List<Course> courses = s.getCourses();
			for (Course course : courses) {
				System.out.println("Courses : " + course.getName() + "\t" + course.getDuration());
			}
		} else {
			System.out.println("Student doesn't exists");
		}
	}

}
