package com.ty.mapping.bi.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveVehicleCharcy {

	public static void main(String[] args) {

		EntityManager entityManager = Persistence.createEntityManagerFactory("Imtiyaz").createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Vehicle vehicle = new Vehicle();
		vehicle.setName("Ford");
		vehicle.setCost(900000.00);

		Charcy charcy = new Charcy();
		charcy.setCharcyNum("EWDJHFPWH2347654");
		charcy.setType("On Rally");

		// charcy.setVehicle(vehicle);
		vehicle.setCharcy(charcy);

		entityTransaction.begin();
		entityManager.persist(vehicle);
		entityTransaction.commit();

	}

}
