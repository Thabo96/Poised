package com.poise.interfaces;

import org.springframework.data.repository.CrudRepository;

import com.poise.beans.Architect;

public interface ArchitectInterface extends CrudRepository<Architect, Long> {

}
