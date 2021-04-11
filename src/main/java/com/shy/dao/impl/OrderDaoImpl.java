package com.shy.dao.impl;

import com.shy.dao.OrderDao;
import com.shy.bean.Order;

import java.util.List;

public class OrderDaoImpl extends BaseDao implements OrderDao {
    @Override
    public int saveOrder(Order order) {
        String sql = "insert into t_order(`order_id`,`create_time`,`price`,`status`,`user_id`) values(?,?,?,?,?)";

        return update(sql,order.getOrderId(),order.getCreateTime(),order.getPrice(),order.getStatus(),order.getUserId());
    }

    @Override
    public List<Order> queryOrder() {
        String sql = "SELECT `order_id` orderid,`create_time`createtime,`price`,`status`,`user_id`userid FROM t_order";

        return queryForList(Order.class,sql);
    }

    @Override
    public int changeOrderStatus(String OrderId, int status) {
        String sql = "UPDATE t_order SET STATUS = ? WHERE order_id = ?";

        return update(sql,status,OrderId);
    }

    @Override
    public List<Order> queryOrdersByUserId(int id) {
        String sql = "SELECT `order_id` orderid ,`create_time` createtime ,`price`,`status`,`user_id`userid FROM t_order where user_id=?";

        return queryForList(Order.class,sql,id);
    }

    @Override
    public int queryOrderTypeByOrderId(String orderId) {
        String sql = "SELECT `status` FROM t_order WHERE order_id = ?";

        return (int) queryForSingleValue(sql,orderId);
    }
}
