package com.springboot.backend.backendonlinestore.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.springboot.backend.backendonlinestore.entities.Product;

@RepositoryRestResource(path = "productos")
public interface ProductRepository extends CrudRepository<Product, Integer> { 
}