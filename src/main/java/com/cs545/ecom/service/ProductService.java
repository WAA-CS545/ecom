/**
 * 
 */
package com.cs545.ecom.service;

import java.util.List;

import com.cs545.ecom.model.Product;

/**
 * @author Ivan
 *
 */
public interface ProductService {
	public List<Product> getAllProducts();
    public Product getProductById(String productId);
    public void addProduct(Product product);

}
