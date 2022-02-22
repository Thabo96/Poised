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
import com.poise.beans.Contractor;
import com.poise.interfaces.ContractorInterface;

/**
 * @author thabo
 *
 */
@Controller
@RequestMapping("/contractor")
public class ContractorController {
	
	private ContractorInterface cont;
	
	@Autowired
	public ContractorController(ContractorInterface cont) {
		this.cont = cont;
	}

	//show form to input data the user
	@GetMapping
	public String showContractorForm(Model m) {
		m.addAttribute("contractor", new Contractor());
		return "contractor";
	}
	
	//save data from the user
	@PostMapping
	public String saveContractor(@Valid @ModelAttribute("contractor") Contractor contractor, Errors errors) {
		if(errors.hasErrors()) {
			return "contractor";
		}
		else {
			cont.save(contractor);
			return "redirect:/home";			
		
		}
	}
	

}
