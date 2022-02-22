/**
 * 
 */
package com.poise.beans;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author thabo
 *
 */
@Entity
@Table(name="Client")
public class Client {
	
	
	@Column(name="ID")
	private long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="telephone")
	private long telephone;
	
	@Column(name="email")
	private String email;
	
	@OneToOne(targetEntity=Address.class,cascade=CascadeType.ALL)
	@Column(name="address")
	private Address address;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getTelephone() {
		return telephone;
	}

	public void setTelephone(long telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	

}
