package com.local.site.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="temp_list")
public class TempList {
	
	@Id
	@GeneratedValue
	private int id;

	@ManyToOne
	@JoinColumn(name = "cartridge_id")
	private Cartridge cartridge;
		
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Cartridge getCartridge() {
		return cartridge;
	}

	public void setCartridge(Cartridge cartridge) {
		this.cartridge = cartridge;
	}

	
	
}
