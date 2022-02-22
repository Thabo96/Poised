/**
 * 
 */
package com.poise.beandao;

import java.util.ArrayList;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.poise.beans.Contractor;

/**
 * @author thabo
 *
 */
public class ContractorDAO {
	

	HibernateTemplate hibernate;
	
	public void setContractor(HibernateTemplate hibernate) {
		this.hibernate = hibernate;
	}
	
	//save Contractor's data
	public void saveContrator(Contractor contractor) {
		hibernate.save(contractor);
	}
	
	//update contractor's data
	public void updateContrator(Contractor contractor) {
		hibernate.update(contractor);
	}
	
	//delete contractor data
	public void deleteContractor(String registrationNumber) {
		hibernate.delete(registrationNumber);
	}
	
	//get contractor by id
	public Contractor getContractorId(String registrationNumber) {
		Contractor contractor = (Contractor)hibernate.get(Contractor.class, registrationNumber);
		return contractor;
	}
	
	//get all the data of the contractors
	public ArrayList<Contractor> getContractor(){
		ArrayList<Contractor> list = new ArrayList<>();
		list=(ArrayList<Contractor>)hibernate.loadAll(Contractor.class);
		return list;
	}
	
	
}
