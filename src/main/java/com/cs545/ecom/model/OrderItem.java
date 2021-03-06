/**
 * 
 */
package com.cs545.ecom.model;

import java.math.BigDecimal;

/**
 * @author Ivan
 *
 */
public class OrderItem {
	private Product product;
	private long quantity;
	private BigDecimal totalPrice;
	
	
	public OrderItem() {
		super();
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public long getQuantity() {
		return quantity;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	

}
