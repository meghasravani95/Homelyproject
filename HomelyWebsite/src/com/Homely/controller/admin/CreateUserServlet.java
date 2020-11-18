package com.Homely.controller.admin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Homely.service.UserService;


@WebServlet("/admin/create_user")
public class CreateUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		UserService userservices=new UserService(request,response);
		userservices.createUser();
		userservices.listuser("New User Created Successfully");
	
	}

}
