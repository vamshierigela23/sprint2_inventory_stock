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
	public void setpsdao(RawMaterialStockDAO psdao, RawMaterialStockDAO rmsdao) { this.rmsdao=rmsdao;}
	@Transactional(readOnly=true)
	public RawMaterialStock getOrder(int orderId) {
		
		return rmsdao.getRawDetails(orderId);
	}
	
}
