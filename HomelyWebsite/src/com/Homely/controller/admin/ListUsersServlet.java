package com.Homely.controller.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Homely.entity.users;
import com.Homely.service.UserService;

@WebServlet("/admin/list_users")
public class ListUsersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ListUsersServlet() {
        super();

    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		UserService userServices = new UserService(request,response);
		userServices.listuser();
		
	}

	
}
