package com.local.site.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "cartridge")
public class Cartridge {
	
	
	
	public Cartridge() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue
	private int id;
	
	@ManyToOne (cascade=CascadeType.ALL , fetch=FetchType.EAGER)
	@JoinColumn(name="owner_id")
	private Owner owner;

	private String type;
	
	private String number;
	
	@OneToMany(mappedBy="cartridge" )
	private List<TempList> templist;
	
	@OneToMany(mappedBy="cartridge")
	private List<FilledCartridge> filledCartridge;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public List<TempList> getTemplist() {
		return templist;
	}

	public void setTemplist(List<TempList> templist) {
		this.templist = templist;
	}

	public List<FilledCartridge> getFilledCartridge() {
		return filledCartridge;
	}

	public void setFilledCartridge(List<FilledCartridge> filledCartridge) {
		this.filledCartridge = filledCartridge;
	}
	

	
	
	
	
}
