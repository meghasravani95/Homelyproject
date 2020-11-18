package com.Homely.dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.Homely.entity.users;

public class userDAO extends JpaDAO<users> implements GenericDAO<users> {

	
	public userDAO(EntityManager entityManager) {
		super(entityManager);
	}

	
	public users create(users t)
	{
		return super.create(t);
	}
	
	@Override
	public users update(users user) {
		
		return super.update(user);
	}

	@Override
	public users get(Object userid) {
		
		return super.find(users.class, userid);
	}

	public users findByEmail(String email) {
		List<users> listUsers=super.findwithNamedQuery("users.findByEmail","email", email);
		
		System.out.println( listUsers.size());
	
	if(listUsers != null && listUsers.size() > 0)
	{
		return listUsers.get(0);
	}
	return null;
	
	
	}
	
	@Override
	public void delete(Object userid) {
		super.delete(users.class, userid);
		
	}

	@Override
	public List<users> listAll() {
		return super.findwithNamedQuery("users.findall");
	}

	@Override
	public long count() {
		return super.countWithNamedQuery("users.countAll");
		
	}

}
