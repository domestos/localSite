package com.local.site.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;

import org.hibernate.annotations.Sort;
import org.hibernate.annotations.SortType;

@Entity
@Table(name = "owner")
public class Owner {

	@Id
	@GeneratedValue
	private int id;

	private String name;

	private String email;

	private String phone;

	@OneToMany(mappedBy = "owner", cascade=CascadeType.ALL , fetch=FetchType.LAZY)
	
	private List<Cartridge> cartridges;
		
	public Owner() {
		super();
		
	}

	public Owner(String name, String phone, String email) {
		super();
		this.name = name;		
		this.email = email;
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

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

	public List<Cartridge> getCartridges() {
		return cartridges;
	}

	public void setCartridges(List<Cartridge> cartridges) {
		this.cartridges = cartridges;
	}

}
