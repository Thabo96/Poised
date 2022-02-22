/**
 * 
 */
package com.poise.beandao;

import java.util.ArrayList;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.poise.beans.Project;

/**
 * @author thabo
 *
 */
public class ProjectDAO {
	
	
	HibernateTemplate hibernate;
	
	public void setProject(HibernateTemplate hibernate) {
		this.hibernate = hibernate;
	}
	
	//save project data
	public void saveProject(Project project) {
		hibernate.save(project);
	}
	
	//update project data
	public void updateProject(Project project) {
		hibernate.update(project);
	}
	
	//delete project data
	public void deleteProject(String projectName) {
		hibernate.delete(projectName);
	}
	
	//get a project by project name
	public Project getProjectById(String projectName) {
		Project project = (Project)hibernate.get(Project.class, projectName);
		return project;
	}
	
	//get all project's data
	public ArrayList<Project> getProject(){
		ArrayList<Project> list = new ArrayList<>();
		list=(ArrayList<Project>)hibernate.loadAll(Project.class);
		return list;
	}


}
