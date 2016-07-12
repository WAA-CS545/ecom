/**
 * 
 */
package com.cs545.ecom.persistence;

import java.util.List;

import com.cs545.ecom.model.Product;

/**
 * @author Ivan
 *
 */
public interface ProductDAO {
    List<Product> getAllProducts();
    Product getProductById(String productId);
    void addProduct(Product product);
}
