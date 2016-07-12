/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cs545.ecom.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cs545.ecom.model.Order;
import com.cs545.ecom.persistence.OrderDAO;
import com.cs545.ecom.service.OrderService;

/**
 *
 * @author Solomon Kassahun
 */
@Service
@Transactional
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDAO dao;

    public Order findById(String id) {
        return dao.findById(id);
    }

    public void saveOrder(Order order) {
        dao.saveOrder(order);
    }
    
    public void updateOrder(Order order) {
    	Order entity = dao.findById(order.getOrderId());
        if (entity != null) {
            entity.setOrderItems(order.getOrderItems());
            entity.setOrderDate(order.getOrderDate());
            entity.setOrderPrice(order.getOrderPrice());
            entity.setOrderId(order.getOrderId());
        }
    }
    
    public void deleteOrderById(String ordId) {
        dao.deleteOrderById(ordId);
    }

    public List<Order> findAllOrders() {
        return dao.findAllOrders();
    }

    public Order findOrderById(String ordId) {
        return dao.findOrderById(ordId);
    }
 
    public boolean isOrderIdUnique(String id, String ordId) {
        Order order = findOrderById(ordId);
        return (order == null || ((id != null) && (order.getOrderId() == id)));
    }

}
