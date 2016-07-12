/**
 * 
 */
package com.cs545.ecom.persistence.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import com.cs545.ecom.model.Product;
import com.cs545.ecom.persistence.AbstractDAO;
import com.cs545.ecom.persistence.ProductDAO;

/**
 * @author Ivan
 *
 */
public class ProductDAOImp extends AbstractDAO<String, Product> implements ProductDAO{
	
	public Product findById(String id) {
		return getByKey(id);		
	}

	public List<Product> getAllProducts() {
		Criteria criteria = createEntityCriteria();
        return (List<Product>) criteria.list();
	}

	public Product getProductById(String productId) {
		Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("productId", productId));
        return (Product) criteria.uniqueResult();
	}

	public void addProduct(Product product) {
		persist(product);		
	}

}
