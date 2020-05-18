package com.capgemini.inventorymanagementsystem.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.inventorymanagementsystem.dao.ProductStockDAO;
import com.capgemini.inventorymanagementsystem.dto.ProductStock;
@Service
public class ProductStockService {
	@Autowired
    ProductStockDAO psdao;
	public void setpsdao(ProductStockDAO psdao) { this.psdao=psdao;}
	
	 @Transactional
	 public ProductStock updateProductStock(ProductStock productstock)
		{
		 ProductStock product1=psdao.getOne(productstock.getOrderId());
		 product1.setExitDate(productstock.getExitDate());
		 product1.setDeliveryDate(productstock.getDeliveryDate());
		 product1.setManufacturingDate(productstock.getManufacturingDate());
		 product1.setExpiryDate(productstock.getExpiryDate());
			return psdao.save(product1);
		}
	 }
	 


