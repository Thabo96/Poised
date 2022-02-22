/**
 * 
 */
package com.poise.beans;

import java.time.LocalDate;

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
@Table(name="Project")
public class Project {
	
	
	@Column(name="projectName")
	private String projectName;
	
	@Column(name="buildingType")
	private String buildingType;
	
	@Column(name="ERF")
	private String ERF;
	
	@Column(name="status")
	private String status;
	
	@Column(name="Due-Date")
	private LocalDate dueDate =  LocalDate.of(0, 0, 0);
	
	@Column(name="Start-Date")
	private LocalDate startDate = LocalDate.of(0, 0, 0);
	
	@Column(name="Update-Date")
	private LocalDate updateDate = LocalDate.of(0, 0, 0);
	
	public LocalDate getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(LocalDate updateDate) {
		this.updateDate = updateDate;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startingDate) {
		this.startDate = startingDate;
	}

	@Column(name="clientName")
	private String clientName;
	
	@Column(name="clientId")
	private long clientId;
	
	@Column(name="contractorName")
	private String contractorName;
	
	@Column(name="ContratorRegistrationNumber")
	private String contractorRegistrationNumber;
	
	@Column(name="architectName")
	private String architectName;
	
	@Column(name="architectRegistrationNumber")
	private String architectRegistrationNumber;
	
	@OneToOne(targetEntity=Address.class,cascade=CascadeType.ALL)
	@Column(name="address")
	private Address address;
	
	@OneToOne(targetEntity=Fees.class,cascade=CascadeType.ALL)
	@Column(name="fees")
	private Fees fees;

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getBuildingType() {
		return buildingType;
	}

	public void setBuildingType(String buildingType) {
		this.buildingType = buildingType;
	}

	public String getERF() {
		return ERF;
	}

	public void setERF(String eRF) {
		ERF = eRF;
	}

	
	public String getStatus() {
		
		if(!status.equalsIgnoreCase("complete") && LocalDate.now().compareTo(dueDate) > 0 ) {
			String status = "Over-Due!";
			return status;
		}
		else {
			return status;
		}
		
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public long getClientId() {
		return clientId;
	}

	public void setClientId(long clientId) {
		this.clientId = clientId;
	}

	public String getContractorName() {
		return contractorName;
	}

	public void setContractorName(String contractorName) {
		this.contractorName = contractorName;
	}

	public String getContractorRegistrationNumber() {
		return contractorRegistrationNumber;
	}

	public void setContractorRegistrationNumber(String contractorRegistrationNumber) {
		this.contractorRegistrationNumber = contractorRegistrationNumber;
	}

	public String getArchitectName() {
		return architectName;
	}

	public void setArchitectName(String architectName) {
		this.architectName = architectName;
	}

	public String getArchitectRegistrationNumber() {
		return architectRegistrationNumber;
	}

	public void setArchitectRegistrationNumber(String architectRegistrationNumber) {
		this.architectRegistrationNumber = architectRegistrationNumber;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Fees getFees() {
		return fees;
	}

	public void setFees(Fees fees) {
		this.fees = fees;
	}
	

}
