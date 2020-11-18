package com.Homely.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({
	@NamedQuery(name="users.findall", query="SELECT u FROM users u ORDER BY u.fullname"),
	@NamedQuery(name="users.findByEmail", query="SELECT u FROM users u ORDER BY u.email = :email"),
	@NamedQuery(name="users.countAll", query="SELECT Count(*) FROM users u")
	
})
public class users {
	private Integer userid;
	private String email;
	private String fullname;
	private String password;

	
	
	public users() {
		
	}

	public users(String email, String fullname, String password) {
		super();
		this.email = email;
		this.fullname = fullname;
		this.password = password;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
