package com.ty.mapping.bi.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestRetriveVehicle {

	public static void main(String[] args) {

		EntityManager entityManager = Persistence.createEntityManagerFactory("Imtiyaz").createEntityManager();

		Vehicle vehicle = entityManager.find(Vehicle.class, 1);

		if (vehicle != null) {
			System.out.println("Vehicle Name = " + vehicle.getName());
			System.out.println("Vehicle Cost = " + vehicle.getCost());

			Charcy charcy = vehicle.getCharcy();
			System.out.println("Charcy Num = " + charcy.getCharcyNum());
			System.out.println("Charcy Type = " + charcy.getType());

		}
	}

}
