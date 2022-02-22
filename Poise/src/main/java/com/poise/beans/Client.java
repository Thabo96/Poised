/**
 * 
 */
package com.poise.beans;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * @author thabo
 *
 */
@Data
@Entity
@RequiredArgsConstructor
public class Client implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@NotNull
	@Size(min=1, message="id cannot be empty!")
	private long id;
	
	@NotBlank(message="name cannot be empty!")
	private String name;
	
	@NotBlank(message="telephone cannot be empty!")
	private long telephone;
	
	@NotBlank(message="email cannot be empty!")
	private String email;

	@NotBlank(message="streetname cannot be empty!")
	private String streetName;
	
	@NotBlank(message="suburb cannot be empty!")
	private String suburb;
	
	@NotBlank(message="city cannot be empty!")
	private String city;

}
