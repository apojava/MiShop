package com.shy.dao.impl;

import com.shy.bean.Order;
import com.shy.bean.Phone;
import com.shy.dao.OrderItemDao;
import com.shy.bean.OrderItem;

import java.util.List;

public class OrderItemDaoImpl extends BaseDao implements OrderItemDao {
    @Override
    public int saveOrderItem(OrderItem orderItem) {
        String sql = "insert into t_order_item(`name`,`count`,`price`,`total_price`,`order_id`) values(?,?,?,?,?)";
        return update(sql,orderItem.getName(),orderItem.getCount(),orderItem.getPrice(),orderItem.getTotalPrice(),orderItem.getOrderId());
    }

    @Override
    public List<OrderItem> queryOrderItemByOrderId(String orderId) {
        String sql = "SELECT `id`,`name`,`count`,`price`,`total_price`totalprice,`order_id`orderid FROM t_order_item WHERE `order_id` = ?";
        return queryForList(OrderItem.class,sql,orderId);
    }
}
