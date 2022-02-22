package com.poise.interfaces;

import org.springframework.data.repository.CrudRepository;

import com.poise.beans.Client;

public interface ClientInterface extends CrudRepository<Client, Long> {

}
