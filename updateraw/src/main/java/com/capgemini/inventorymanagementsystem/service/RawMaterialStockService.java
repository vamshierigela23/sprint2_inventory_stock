package com.capgemini.inventorymanagementsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.inventorymanagementsystem.dao.RawMaterialStockDAO;
import com.capgemini.inventorymanagementsystem.dto.RawMaterialStock;
@Service
public class RawMaterialStockService {
	@Autowired
	RawMaterialStockDAO rmsdao;
	public void setpsdao(RawMaterialStockDAO rmsdao) { this.rmsdao=rmsdao;}
	
	 @Transactional
	   

	public RawMaterialStock updateRawMaterialStock(RawMaterialStock rawmaterialstock) {
		RawMaterialStock raw=rmsdao.getOne(rawmaterialstock.getOrderId());
		raw.setProcessDate(rawmaterialstock.getProcessDate());
		raw.setDeliveryDate(rawmaterialstock.getDeliveryDate());
		raw.setManufacturingDate(rawmaterialstock.getManufacturingDate());
		raw.setExpiryDate(rawmaterialstock.getExpiryDate());
		return rmsdao.save(raw);
		
		
	}
	 

}
