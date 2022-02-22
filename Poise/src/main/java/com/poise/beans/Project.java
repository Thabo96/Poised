/**
 * 
 */
package com.poise.beans;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.PrePersist;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * @author thabo
 *
 */
@Data
@Entity
@RequiredArgsConstructor

public class Project implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@NotNull
	private long id; //autogenerate this id
	
	@NotBlank(message="projectname cannot be empty!")
	private String projectName;
	
	@NotBlank(message="building-type cannot be empty!")
	private String buildingType;
	
	@NotBlank(message="erf cannot be empty!")
	private String ERF;
	
	private String status;
	
	@NotBlank(message="due-date cannot be empty!")
	private LocalDate dueDate =  LocalDate.of(0, 0, 0);
	
	@NotBlank(message="start-date cannot be empty!")
	private LocalDate startDate = LocalDate.of(0, 0, 0);
	
	private LocalDate updateDate = LocalDate.of(0, 0, 0);
	
	@NotBlank(message="streetname cannot be empty!")
	private String streetName;
	
	@NotBlank(message="suburb cannot be empty!")
	private String suburb;
	
	@NotBlank(message="city cann0t be empty!")
	private String city;
	
	@NotBlank(message="total-cost cannot be empty!")
	private float totalCost;
	
	@NotBlank(message="deposit cannot be empty!")
	private float deposit;
	
	private float balance;
	
	@PrePersist
	void balance() {
		this.balance = totalCost - deposit;
	}
	
	
	
	
}
