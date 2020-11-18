package com.Homely.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

//import com.Homely.entity.Chef;

public class cheftest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		Chef ch =new Chef(1,"Homely","Homely.chef20@gmail.com",12345);
		//ch.setChefid(1);
		//ch.setName("Homely");
		//ch.setEmail("Homely.chef20@gmail.com");
		//ch.setZipcode(12345);
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("HomelyWebsite");
		
		EntityManager entityManager =entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(ch);
		
		entityManager.getTransaction().commit();
		
		entityManager.close();
		entityManagerFactory.close();
		
		System.out.println("A chef object was persisted");
	
		
	}

}
