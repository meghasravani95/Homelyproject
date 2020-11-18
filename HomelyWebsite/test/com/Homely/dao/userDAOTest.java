package com.Homely.dao;

import static org.junit.Assert.*;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.Homely.entity.users;

public class userDAOTest {

	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static userDAO userDAO;

	@BeforeClass
	public static void setUpClass() {
		entityManagerFactory = Persistence.createEntityManagerFactory("HomelyWebsite");
		entityManager = entityManagerFactory.createEntityManager();
		userDAO = new userDAO(entityManager);
	}

	@Test
	public void testCreateUsers() {
		users user1 = new users();
		user1.setEmail("gayathri@gmail.com");
		user1.setFullname("gayathri");
		user1.setPassword("Gayathri@3");
		user1 = userDAO.create(user1);
		assertTrue(user1.getUserid() > 0);
	}

	@Test(expected = PersistenceException.class)
	public void testCreateUsersFieldNotSet() {
		users user1 = new users();
		user1 = userDAO.create(user1);
	}

	@Test
	public void testUpdateUsers() {
		users user = new users();
		user.setUserid(1);
		user.setEmail("Homely.update20@gmail.com");
		user.setFullname("uHomely");
		user.setPassword("mysql");

		user = userDAO.update(user);

		String expected = "mysql";
		String actual = user.getPassword();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetUsersFound() {
		Integer userid = 1;
		users user = userDAO.get(userid);
		if (user != null) {
			System.out.println(user.getEmail());
		}
		assertNotNull(user);
	}

	@Test
	public void testGetUsersNotFOund() {
		Integer userid = 99;
		users user = userDAO.get(userid);

		assertNull(user);
	}

	@Test
	public void testDeleteUsers() {
		Integer userid = 6;
		userDAO.delete(userid);

		users user = userDAO.get(userid);
		assertNull(user);

	}
	
	@Test(expected= EntityNotFoundException.class)
	public void testDeleteNonExistUsers() {
		
		Integer userid = 55;
		userDAO.delete(userid);

		
	}

	
	@Test
	public void testListAll() {
		List<users> listusers=userDAO.listAll();
		
		for(users user:listusers)
		{
			System.out.println(user.getFullname());		
		}
		assertTrue(listusers.size()>0);
	}
	
	
	@Test
	public void testCount() {
		long totalusers=userDAO.count();
		System.out.println(totalusers);
		assertEquals(5, totalusers);
	}
	
	@Test
	public void testFindByEmail()
	{
		String email="lavu3095@gmail.com";
		users user=userDAO.findByEmail(email);
		
		assertNotNull(user);
	}
	
	@AfterClass
	public static void tearDownClass() {
		entityManager.close();
		entityManagerFactory.close();
	}

}
