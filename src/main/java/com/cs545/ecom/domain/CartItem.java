/**
 * 
 */
package com.cs545.ecom.domain;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * @author Ivan
 *
 */
public class CartItem {
	private Product product;
	private int quantity;
	private BigDecimal totalPrice;
	
	public CartItem() {
		super();
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	private void updateTotalPrice(){
        totalPrice = this.product.getUnitPrice().multiply(
        new BigDecimal(this.quantity));
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.product);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CartItem other = (CartItem) obj;
        return Objects.equals(this.product, other.product);
    }
	
}
