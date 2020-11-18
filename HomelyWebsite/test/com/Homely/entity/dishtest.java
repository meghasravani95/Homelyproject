package com.Homely.entity;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import javax.imageio.ImageIO;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class dishtest {
	
	public static void main(String[] args) throws Exception {
		
		BufferedImage bImage = ImageIO.read(new File("C:\\Users\\srava\\OneDrive\\Desktop\\work space\\HomelyWebsite\\target\\test-classes\\com\\Homely\\entity\\signup.jpg"));
	      ByteArrayOutputStream bos = new ByteArrayOutputStream();
	      ImageIO.write(bImage, "jpg", bos );
	      byte [] data = bos.toByteArray();
	      
	     Chef c =new Chef(2,"chef2","chef_30@gmail.com",12345);
         
	Dish d =new Dish(1,c,"paneer",data,35,"Paneer made of milk with bread", 12345);


	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("HomelyWebsite");
	
	EntityManager entityManager =entityManagerFactory.createEntityManager();
	entityManager.getTransaction().begin();
	entityManager.persist(d);
	
	entityManager.getTransaction().commit();
	
	entityManager.close();
	entityManagerFactory.close();
	
	System.out.println("A dish object was persisted");
	}

}
