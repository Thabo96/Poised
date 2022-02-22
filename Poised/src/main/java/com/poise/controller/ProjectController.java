/**
 * 
 */
package com.poise.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.poise.beandao.ArchitectDAO;
import com.poise.beandao.ClientDAO;
import com.poise.beandao.ContractorDAO;
import com.poise.beandao.ProjectDAO;
import com.poise.beans.Architect;
import com.poise.beans.Client;
import com.poise.beans.Contractor;
import com.poise.beans.Project;

/**
 * @author thabo
 *
 */

@Controller
public class ProjectController {
	
	
	@Autowired
	ProjectDAO projectdao;
	
	@Autowired
	ContractorDAO contractordao;
	
	@Autowired
	ArchitectDAO architectdao;
	
	@Autowired
	ClientDAO clientdao;
	
	/*
	 * this displays a form to input data, here "command" is 
	 * reserved request attribute which is used to display 
	 * object data into form*/
	
	
	
	//form for the project
	@RequestMapping("/projectform")
	public String showProjectForm(Model m) {
		m.addAttribute("project", new Project());
		return "projectform";
	}
	
	//form for the client
	@RequestMapping("/clientform")
	public String showClientForm(Model m) {
		m.addAttribute("client", new Client());
		return "clientform";
	}
	
	//form for the Architect
	@RequestMapping("/architectform")
	public String showArchitectForm(Model m) {
		m.addAttribute("architect", new Architect());
		return "architectform";
	}
	
	//form for the Contractor
	@RequestMapping("/contractorform")
	public String showContractorForm(Model m) {
		m.addAttribute("contractor", new Contractor());
		return "contractorform";
	}
	
	/*It saves into the database. @ModelAttribute puts model data
	 * into model object...Use post to put into data*/
	
	
	
	//save project into database
	@RequestMapping(value="/saveproject", method=RequestMethod.POST)
	public String saveProject(@ModelAttribute("project") Project project) {
		projectdao.saveProject(project);
		return "redirect:/viewproject";
	}
	
	//save client into database
	@RequestMapping(value="/saveclient", method=RequestMethod.POST)
	public String saveClient(@ModelAttribute("client") Client client) {
		clientdao.saveClient(client);
		return "redirect:/viewclient";
	}
	
	//save contractor into the database
	@RequestMapping(value="/savecontractor", method=RequestMethod.POST)
	public String saveContractor(@ModelAttribute("contractor")Contractor contractor) {
		contractordao.saveContrator(contractor);
		return "redirect:/viewcontractor";
	}
	
	//save Architect into database
	@RequestMapping(value="/savearchitect", method=RequestMethod.POST)
	public String saveArchitect(@ModelAttribute("architect") Architect architect) {
		architectdao.saveArchitect(architect);
		return "redirect:/viewarchitect";
	}
	
	/*Here we provide list of saved data in model view*/
	
	
	//list projects
	@RequestMapping("/viewproject")
	public String viewProject(Model m) {
		ArrayList<Project> list = (ArrayList<Project>)projectdao.getProject();
		m.addAttribute("list", list);
		return "viewproject";
	}
	
	//list clients
	@RequestMapping("viewclient")
	public String viewClient(Model m) {
		ArrayList<Client> list = (ArrayList<Client>)clientdao.getClient();
		m.addAttribute("list",list);
		return "viewclient";
	}
	
	//list contractor
	@RequestMapping("viewcontractor")
	public String viewContractor(Model m) {
		ArrayList<Contractor> list = (ArrayList<Contractor>)contractordao.getContractor();
		m.addAttribute("list",list);
		return "viewcontractor";
	}
	
	//list Architect
	@RequestMapping("viewarchitect")
	public String viewArchitect(Model m) {
		ArrayList<Architect> list = (ArrayList<Architect>)architectdao.getArchitect();
		m.addAttribute("list",list);
		return "viewarchitect";
	}
	
	
	/*Now display object data into form for the given id
	 * @PathVariable put url data into variable */
	
	
	
	//display project by a given id
	@RequestMapping(value="editproject{projectName}", method=RequestMethod.GET)
	public String editProject(@PathVariable String projectName ,Model m) {
		Project project = projectdao.getProjectById(projectName);
		m.addAttribute(project);
		return "editproject";
	}
	
	//display client by a given id
	@RequestMapping(value="editclient{id}", method=RequestMethod.GET)
	public String editClient(@PathVariable long id, Model m) {
		Client client = clientdao.getClientById(id);
		m.addAttribute(client);
		return "editclient";
	}
	
	//display contractor by a given id
	@RequestMapping(value="editcontractor{registrationnumber}", method=RequestMethod.GET)
	public String editContractor(@PathVariable String registrationNumber, Model m) {
		Contractor contractor = contractordao.getContractorId(registrationNumber);
		m.addAttribute(contractor);
		return "editcontractor";
	}
	
	//display Architect by a given id
	@RequestMapping(value="editarchitect{registrationNumber}", method=RequestMethod.GET)
	public String editArchitect(@PathVariable String registrationNumber, Model m) {
		Architect architect = architectdao.getArchitectById(registrationNumber);
		m.addAttribute(architect);
		return "editarchitect";
	}
	
	
	/*
	//Updata saved data
	
	
	//update project data
	@RequestMapping(value="/updateproject", method=RequestMethod.POST)
	public String updateProject(@ModelAttribute("project") Project project) {
		projectdao.updateProject(project);
		return "redirect:/viewproject";
	}
	
	//update client data
	@RequestMapping(value="/updateclient", method=RequestMethod.POST)
	public String updateClient(@ModelAttribute("client") Client client) {
		clientdao.updateClient(client);
		return "redirect:/viewclient";
	}
	
	//update contractor's data
	@RequestMapping(value="/updatecontractor", method=RequestMethod.POST)
	public String updateContractor(@ModelAttribute("contrator") Contractor contractor) {
		contractordao.updateContrator(contractor);
		return "redirect:/viewcontractor";
	}
	
	//update Architect's data
	@RequestMapping(value="/updatearchitect", method=RequestMethod.POST)
	public String updateArchitect(@ModelAttribute("architect") Architect architect) {
		architectdao.updateArchitect(architect);
		return "redirect:/viewarchitect";
	}
	*/
	
	
	/*this deletes record for the given url and redirects to viewmap*/
	
	
	
	//delete project
	@RequestMapping(value="/deleteproject/{projectName}", method=RequestMethod.GET)
	public String deleteProject(@PathVariable String projectName) {
		projectdao.deleteProject(projectName);
		return "redirect:/viewproject";
	}
	
	//delete client
	@RequestMapping(value="/deleteclient/{id}", method=RequestMethod.GET)
	public String deleteClient(@PathVariable long id) {
		clientdao.deleteClient(id);
		return "redirect:/viewclient";
	}
	
	//delete contractor 
	@RequestMapping(value="/deletecontractor/{registrationNumber}", method=RequestMethod.GET)
	public String deleteContrator(@PathVariable String registrationNumber) {
		contractordao.deleteContractor(registrationNumber);
		return "redirect:/viewcontractor";		
	}
	
	//delete architect
	@RequestMapping(value="/deletearchitect/{registrationNumber}", method=RequestMethod.GET)
	public String deleteArchitect(@PathVariable String registrationNumber) {
		architectdao.deleteArchitect(registrationNumber);
		return "redirect:/viewarchitect";
	}
	
	//return to home page
	@RequestMapping("/index")
	public String returnHome(Model m) {
		return "index";
	}
	

}
