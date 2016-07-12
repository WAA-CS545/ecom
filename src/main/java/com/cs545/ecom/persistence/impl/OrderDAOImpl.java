package com.cs545.ecom.persistence.impl;

import java.util.List;

import com.cs545.ecom.model.Order;
import com.cs545.ecom.persistence.AbstractDAO;
import com.cs545.ecom.persistence.OrderDAO;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

@Repository
public class OrderDAOImpl extends AbstractDAO<String, Order> implements OrderDAO {
	
	public Order findById(String id) {
		return getByKey(id);		
	}

	public void saveOrder(Order order) {
		persist(order);
	}

	public void deleteOrderById(String ordId) {
		Query query = getSession().createSQLQuery("delete from Order where order_id=:ordId");
        query.setString("ordId", ordId);
        query.executeUpdate();

	}

	public List<Order> findAllOrders() {
		Criteria criteria = createEntityCriteria();
        return (List<Order>) criteria.list();
	}

	public Order findOrderById(String ordId) {
		Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("ordId", ordId));
        return (Order) criteria.uniqueResult();
	}

}
