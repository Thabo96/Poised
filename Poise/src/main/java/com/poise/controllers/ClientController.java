/**
 * 
 */
package com.poise.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.poise.beans.Client;
import com.poise.interfaces.ClientInterface;

/**
 * @author thabo
 *
 */
@Controller
@RequestMapping("/client")
public class ClientController {

	private ClientInterface clientInterface;
	
	@Autowired
	public ClientController(ClientInterface clientInterface) {
		this.clientInterface = clientInterface;
	}
	
	//show the form to the user
	@GetMapping
	public String showClientForm(Model m) {
		m.addAttribute("client", new Client());
		return "client";
	}
	
	//save the captured data into the database
	@PostMapping
	private String saveClient(@Valid @ModelAttribute("client") Client client, Errors errors) {
		if(errors.hasErrors()) {
			return "client";
		}
		else {
			clientInterface.save(client);
			return "redirect:/home";
		}
		
	}
}
