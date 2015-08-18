package com.local.site.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.metamodel.relational.Datatype;

@Entity
@Table(name="filled_cartridge")
public class FilledCartridge {
	
		

	public FilledCartridge() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "cartridge_id")
	private Cartridge cartridge;
	
	private String status;
	
	private String commit;
	
	@Temporal(TemporalType.DATE)
	@Column(name="date_in")
	private Date dataIn;
	
	@Column(name="date_do")
	@Temporal(TemporalType.DATE)
	private Date dateDo;
	
	@Column(name="date_out")
	@Temporal(TemporalType.DATE)
	private Date dataOut;

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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCommit() {
		return commit;
	}

	public void setCommit(String commit) {
		this.commit = commit;
	}

	public Date getDataIn() {
		return dataIn;
	}

	public void setDataIn(Date dataIn) {
		this.dataIn = dataIn;
	}

	public Date getDateDo() {
		return dateDo;
	}

	public void setDateDo(Date dateDo) {
		this.dateDo = dateDo;
	}

	public Date getDataOut() {
		return dataOut;
	}

	public void setDataOut(Date dataOut) {
		this.dataOut = dataOut;
	}

	
	
	
	
	
	
}
