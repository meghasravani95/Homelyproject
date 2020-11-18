package com.Homely.service;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Homely.dao.userDAO;
import com.Homely.entity.users;


public class UserService {
	
	private EntityManagerFactory entityManagerFactory;
	private EntityManager entityManager;
	private userDAO usersDAO;
	private HttpServletRequest request;
	private HttpServletResponse response;
	
	
	public UserService(HttpServletRequest request, HttpServletResponse response) {
		
		this.request=request;
		this.response=response;
		entityManagerFactory = Persistence.createEntityManagerFactory("HomelyWebsite");
		entityManager =entityManagerFactory.createEntityManager();
		usersDAO = new userDAO(entityManager);
	}
	
	
	
	public void listuser()
			throws ServletException, IOException
	{
		listuser(null);
	}
	
	public List<users> listuser(String message)
			throws ServletException, IOException {
		List<users> listusers = usersDAO.listAll();
		
	//	List<users> listusers= userServices.listuser();
		request.setAttribute("listusers", listusers);
		if(message != null) {
		request.setAttribute("message", message);		
		}
		String listPage = "user_list.jsp";
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(listPage);

		requestDispatcher.forward(request, response);
		
		return listusers;
		
	}
	


public void createUser() throws ServletException, IOException
{

	String email=request.getParameter("email");
	String fullname=request.getParameter("fullname");
	String password=request.getParameter("password");
	
	users existuser=usersDAO.findByEmail(email);
	
	if(existuser != null)
	{
		String message ="Could not create user, A user with email"+ email+ "already exists";
		request.setAttribute("message",message);
		RequestDispatcher dispatcher=request.getRequestDispatcher("message.jsp");
		dispatcher.forward(request, response);
		
	}else {

		users newuser= new users(email,fullname,password);
		usersDAO.create(newuser);
			
	}
	
	
	
	
}
	
	
	

}
