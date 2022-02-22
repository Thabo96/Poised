/**
 * 
 */
package com.poise.beans;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * @author thabo
 *
 */
@Data
@Entity
@RequiredArgsConstructor

public class Architect implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	/*
	@NotNull
	@Size(min=1,message="id cannot be empty!")
	private long id;
	*/
	
	@NotBlank(message="registration number cannot be empty!")
	private String registrationNumber;
	
	
	@NotBlank(message="Name cannot be empty!")
	private String name;
	
	@NotBlank(message="Telephone cannot be empty!")
	private long telephone;
	
	@NotBlank(message="email cannot be email!")
	private String email;
	
	@NotBlank(message="streetname cannot be empty!")
	private String streetName;
	
	@NotBlank(message="suburb cannot be empty!")
	private String suburb;
	
	@NotBlank(message="city cannot be empty!")
	private String city;
	
	

}
