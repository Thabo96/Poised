/**
 * 
 */
package com.poise.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.poise.beans.Architect;
import com.poise.interfaces.ArchitectInterface;

/**
 * @author thabo
 *
 */

@Controller
@RequestMapping("/architect")
public class ArchitectController {
	
	private ArchitectInterface arch;
	
	@Autowired
	public ArchitectController(ArchitectInterface arch) {
		this.arch = arch;
	}
	
	//show a form to input data to the user
	public String showDataInputForm(Model m) {
		m.addAttribute("arch", new Architect());
		return "architect";
	}
	
	//save data from the form
	@PostMapping
	public String saveArchitect(@Valid @ModelAttribute("architect") Architect architect, Errors errors) {
		if(errors.hasErrors()) {
			//return to the same page
			return "architect";
		}
		else {
			arch.save(architect);
			return "redirect:/home";//home is the home page
		}
	}	
}

