package com.cjc.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.model.Product;
import com.cjc.repository.HomeRepository;
import com.cjc.servicein.HomeServicein;

@Service
public class HomeServiceImpl implements HomeServicein{

	@Autowired
	HomeRepository hr;
	
	@Override
	
	public void saveData(Product p) {
		
		hr.save(p);
	}

	@Override
	public Iterable<Product> getAllProductData() {
		
		return hr.findAll();
	}

	@Override
	public Product getSingleRecord(int id) {
		
		return hr.findById(id);
	}


	@Override
	public void deleteData(int id) {
		
		hr.deleteById(id);
		
	}
	

}
