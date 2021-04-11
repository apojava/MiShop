package com.shy.dao;

import com.shy.bean.OrderItem;

import java.util.List;

public interface OrderItemDao {
    /**
     * 保存订单项
     * @param orderItem
     * @return
     */
    public int saveOrderItem(OrderItem orderItem);

    /**
     * 根据订单号查询订单明细
     * @param orderId
     * @return
     */
    public List<OrderItem> queryOrderItemByOrderId(String orderId);
}
