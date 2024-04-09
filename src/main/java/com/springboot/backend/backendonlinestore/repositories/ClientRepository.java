package com.springboot.backend.backendonlinestore.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.springboot.backend.backendonlinestore.entities.Client;

@RepositoryRestResource(path = "clientes")
public interface ClientRepository extends CrudRepository<Client, Integer>{

}
