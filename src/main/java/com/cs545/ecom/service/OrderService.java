/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cs545.ecom.service;

import java.util.List;
import com.cs545.ecom.model.Order;

/**
 *
 * @author Solomon Kassahun
 */
public interface OrderService {

    Order findById(String id);

    void saveOrder(Order order);

    void updateOrder(Order order);

    void deleteOrderById(String ordId);

    List<Order> findAllOrders();

    Order findOrderById(String ordId);

    boolean isOrderIdUnique(String id, String ordId);
}
