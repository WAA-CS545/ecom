/**
 * 
 */
package com.cs545.ecom.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cs545.ecom.model.Product;
import com.cs545.ecom.persistence.ProductDAO;
import com.cs545.ecom.service.ProductService;

/**
 * @author Ivan
 *
 */

@Service
@Transactional
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	ProductDAO dao;

	public List<Product> getAllProducts() {
		
		return dao.getAllProducts();
	}

	public Product getProductById(String productId) {
		// TODO Auto-generated method stub
		return dao.getProductById(productId);
	}

	public void addProduct(Product product) {
		dao.addProduct(product);
		
	}

}
