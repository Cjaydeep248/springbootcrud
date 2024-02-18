package com.cjc.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Supplier {
	@Id
	private int supplierId;
	private String supplierName;
	private String supplierAddress;
	private long supplierContact;
	
	
	}
