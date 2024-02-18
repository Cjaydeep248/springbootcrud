package com.cjc.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.model.Product;
@Repository
public interface HomeRepository extends CrudRepository<Product, Integer>{

	
	Product findById(int id);
	
}
