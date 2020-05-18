package com.capgemini.inventorymanagementsystem.controller;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.inventorymanagementsystem.dto.ProductStock;
import com.capgemini.inventorymanagementsystem.service.ProductStockService;

//import brave.sampler.Sampler;

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


   @GetMapping("productstock/getOrder/{orderId}")
   public ProductStock getOrder(@PathVariable int orderId)
   {
	   return productStockService.getOrder(orderId);
   }
   
}
  






