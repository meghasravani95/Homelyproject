package com.Homely.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

//import com.Homely.entity.users;

public class userstest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		users user1=new users();
		user1.setEmail("lavu3095@gmail.com");
		user1.setFullname("Megha S Lavu");
		user1.setPassword("Megha");
		
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("HomelyWebsite");
		
		EntityManager entityManager =entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(user1);
		
		entityManager.getTransaction().commit();
		
		entityManager.close();
		entityManagerFactory.close();
		
		System.out.println("A Users object was persisted");
		
		
	}

}
