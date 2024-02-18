package com.cjc.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;


@Entity
@Data
public class Product {
	
	@Id
	private int id;
	private String pName;
	private double pPrice;
	private String availableQuantity;
	private String pColor;
	@OneToOne(cascade = CascadeType.ALL)
	private Supplier supplier;
	
}
