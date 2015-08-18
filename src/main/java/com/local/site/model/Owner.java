package com.local.site.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="owner")
public class Owner {

	@Id
	@GeneratedValue
	private int id;
	
	private String name;

	@OneToMany(mappedBy="owner")	
	private List<Cartridge> cartridges;
	
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
