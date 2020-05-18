package com.capgemini.inventorymanagementsystem.controller;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.inventorymanagementsystem.dto.ProductStock;
import com.capgemini.inventorymanagementsystem.service.ProductStockService;


@CrossOrigin(origins = "http://localhost:4200")
@RestController 
public class ProductStockController
{
	@Autowired
	ProductStockService productStockService;
	public void setProductStockService(ProductStockService productStockService)
	{
		this.productStockService=productStockService;
	}
	
  
   @PostMapping("/productstock/exitdate")
	public ResponseEntity<String> UpdateProductStock(@RequestBody ProductStock productstock) {
		ProductStock t = productStockService.updateProductStock(productstock);
		if (t == null) {
			
			return new ResponseEntity<String>("Update Operation Unsuccessful,Provided testId does not exist", new HttpHeaders(), HttpStatus.OK);
		
		} else {
			return new ResponseEntity<String>("Updated successfully", new HttpHeaders(), HttpStatus.OK);
		}
	
	
   }
  
}

  






