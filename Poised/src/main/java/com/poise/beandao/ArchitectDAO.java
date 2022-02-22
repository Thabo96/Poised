/**
 * 
 */
package com.poise.beandao;

import java.util.ArrayList;


import org.springframework.orm.hibernate5.HibernateTemplate;

import com.poise.beans.Architect;

/**
 * @author thabo
 *
 */
public class ArchitectDAO {
	
	
	HibernateTemplate hibernate;
	
	public void setArchitect(HibernateTemplate hibernate) {
		this.hibernate = hibernate;
	}	

	//save data
	public void saveArchitect(Architect architect) {
		hibernate.save(architect);
	}
	
	//update architect data
	public void updateArchitect(Architect architect) {
		hibernate.update(architect);
	}
	
	//delete data
	public void deleteArchitect(String registrationNumber) {
		hibernate.delete(registrationNumber);
	}
	
	//get data of a given registration Number
	public Architect getArchitectById(String rergistratioNumber) {
		Architect architect = (Architect)hibernate.get(Architect.class, rergistratioNumber);
		return architect;
	}
	
	//list all stored data
	public ArrayList<Architect> getArchitect(){
		ArrayList<Architect> list = new ArrayList<>();
		list=(ArrayList<Architect>) hibernate.loadAll(Architect.class);
		return list;
		
	}
	
	
}
