package com.ty.mapping.bi.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestUpdateVehicleCharcy {

	public static void main(String[] args) {

		EntityManager entityManager = Persistence.createEntityManagerFactory("Imtiyaz").createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Vehicle vehicle = entityManager.find(Vehicle.class, 1);

		if (vehicle != null) {
			entityTransaction.begin();			
			vehicle.setName("i-20");
			vehicle.setCost(500000.00);
			vehicle.getCharcy().setCharcyNum("6566HSDJFAEWKUD");
			entityManager.merge(vehicle);
			entityTransaction.commit();
		} else {
			System.out.println("Vehicle Doesn't exists");
		}

	}

}
