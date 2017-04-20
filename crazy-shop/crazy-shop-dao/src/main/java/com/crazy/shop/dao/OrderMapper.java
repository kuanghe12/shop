package com.crazy.shop.dao;

import java.util.List;

import com.crazy.shop.model.Order;
import com.crazy.shop.model.OrderInfoVo;

public interface OrderMapper {
	public int saveOrder(Order order);
	
	public List<OrderInfoVo> getOrder(Order order);
	
	public int updateOrder(Order order);
	public OrderInfoVo getOrderByDistriNo(Order order);
	public int getOrderTotal(Order order);
}
