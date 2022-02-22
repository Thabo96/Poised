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
import com.poise.beans.Project;
import com.poise.interfaces.ProjectInterface;

/**
 * @author thabo
 *
 */
@Controller
@RequestMapping(value="/project")
public class ProjectController {
	
	private ProjectInterface pro;
	
	@Autowired
	public ProjectController(ProjectInterface pro) {
		this.pro = pro;
	}
	
	//show the form to the user
	@GetMapping
	public String showProjectForm(Model m) {
		m.addAttribute("project", new Project());
		return "project";
	}
	
	//save data from the form
	@PostMapping
	public String saveProject(@Valid @ModelAttribute("project") Project project, Errors errors) {
		if(errors.hasErrors()) {
			return "project";
		}
		else {
			pro.save(project);
			return "redirect:/home";
		}
	}
}
