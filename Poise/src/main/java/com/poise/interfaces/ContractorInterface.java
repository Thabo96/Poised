package com.poise.interfaces;

import org.springframework.data.repository.CrudRepository;

import com.poise.beans.Contractor;

public interface ContractorInterface extends CrudRepository<Contractor, Long> {

}
