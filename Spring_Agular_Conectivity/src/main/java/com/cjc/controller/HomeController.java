package com.cjc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.model.Product;
import com.cjc.servicein.HomeServicein;

import lombok.extern.slf4j.Slf4j;


@CrossOrigin("http://localhost:4200")
@RestController
public class HomeController {
	@Autowired
	HomeServicein hs;
	
	@PostMapping("/insertData")
	public String saveData(@RequestBody Product p)
	{
		hs.saveData(p);
		return "success";
	}
	@GetMapping("/getAllData")
	public Iterable<Product> getAllData()
	{
		Iterable<Product> p=hs.getAllProductData();
		return p;
	}
	@GetMapping("/getSingleData/{id}")
	public Product getSingleData(@PathVariable ("id") int id)
	{
		Product p=hs.getSingleRecord(id);
		return p;
	}
	@PutMapping("/`editData/{id}")
	public String updateData(@PathVariable ("id") int id, @RequestBody Product p)
	{
		hs.saveData(p);
		return "success";
		
	}
	@DeleteMapping("/delete/{id}")
	public String deleteData(@PathVariable ("id") int id)
	{
		hs.deleteData(id);
		return "deleted successfully";
	}

}
