package com.poise.interfaces;

import org.springframework.data.repository.CrudRepository;

import com.poise.beans.Project;

public interface ProjectInterface extends CrudRepository<Project, Long> {

}
