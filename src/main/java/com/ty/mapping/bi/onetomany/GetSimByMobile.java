package com.ty.mapping.bi.onetomany;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class GetSimByMobile {

	public static void main(String[] args) {
		EntityManager entityManager = Persistence.createEntityManagerFactory("Imtiyaz").createEntityManager();

		Mobile mobile = entityManager.find(Mobile.class, 1);

		if (mobile != null) {
			System.out.println("Name : " + mobile.getName());
			System.out.println("Price : " + mobile.getPrice());

			List<Sim> list = mobile.getSim();
			for (Sim sim : list) {
				System.out.println("Provider : " + sim.getProvider());
				System.out.println("Type : " + sim.getType());
			}
		} else {
			System.out.println("No mobiles exists");
		}
	}
}
