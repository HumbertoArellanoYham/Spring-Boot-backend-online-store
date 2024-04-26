package com.springboot.backend.backendonlinestore.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.springboot.backend.backendonlinestore.entities.Client;

@CrossOrigin(origins = "http://localhost:4200")
@RepositoryRestResource(path = "clientes")
public interface ClientRepository extends CrudRepository<Client, Integer>{

}
