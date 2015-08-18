package com.local.site.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity	
@Table(name = "role")
public class Role {

	
	
	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue
	private int id;
	
	public List<User> getUsers() {
		return users;
	}



	public void setUsers(List<User> users) {
		this.users = users;
	}

	private String name;

	@ManyToMany(mappedBy="roles")
	
	private List<User> users;
	
	
	public int getId() {
		return id;
	}
	
	

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
