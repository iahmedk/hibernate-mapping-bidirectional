package com.ty.mapping.bi.onetomany;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class GetMobileBySim {

	public static void main(String[] args) {
		EntityManager entityManager = Persistence.createEntityManagerFactory("Imtiyaz").createEntityManager();

		Sim sim = entityManager.find(Sim.class, 2);
		
		if(sim != null) {
			System.out.println("Type = "+sim.getType());
			System.out.println("Provider = "+sim.getProvider());
			
			Mobile m = sim.getMobile();
			System.out.println("Name = "+m.getName());
			System.out.println("Price = "+m.getPrice());
		}
	}
}
