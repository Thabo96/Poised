/**
 * 
 */
package com.poise.beandao;

import java.util.ArrayList;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.poise.beans.Client;

/**
 * @author thabo
 *
 */
public class ClientDAO {
	
	
	HibernateTemplate hibernate;
	
	public void setClient(HibernateTemplate hibernate) {
		this.hibernate = hibernate;
	}
	
	//save client's data
	public void saveClient(Client client) {
		hibernate.save(client);
	}
	
	//update client's data
	public void updateClient(Client client) {
		hibernate.update(client);
	}
	
	//delete unwanted client data
	public void deleteClient(long id) {
		hibernate.delete(id);
	}
	
	//get client's data by an id
	public Client getClientById(long id) {
		Client client=(Client)hibernate.get(Client.class, id);
		return client;
				
	}
	
	//get all client data
	public ArrayList<Client> getClient(){
		ArrayList<Client> list = new ArrayList<>();
		list=(ArrayList<Client>)hibernate.loadAll(Client.class);
		return list;
	}
	

}
