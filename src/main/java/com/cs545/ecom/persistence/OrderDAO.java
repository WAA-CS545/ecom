/**
 * 
 */
package com.cs545.ecom.persistence;

import java.util.List;

import com.cs545.ecom.model.Order;

/**
 * @author Solomon Kassahun
 *
 */
public interface OrderDAO {
	
	Order findById(String id);

    void saveOrder(Order order);

    void deleteOrderById(String ordId);

    List<Order> findAllOrders();

    Order findOrderById(String ordId);

}
