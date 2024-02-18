package com.cjc.servicein;

import com.cjc.model.Product;

public interface HomeServicein {

	public void saveData(Product p);

	public Iterable<Product> getAllProductData();

	public Product getSingleRecord(int id);

	public void deleteData(int id);

}
