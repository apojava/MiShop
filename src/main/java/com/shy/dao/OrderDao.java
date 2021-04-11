package com.shy.dao;

import com.shy.bean.Order;

import java.util.List;

public interface OrderDao {

    /**
     * 保存订单
     * @param order
     * @return
     */
    public int saveOrder(Order order);

    /**
     * 查询所有订单
     * @return
     */
    public List<Order> queryOrder();

    /**
     * 修改订单状态
     * @param OrderId
     * @param status
     * @return
     */
    public int changeOrderStatus(String OrderId, int status);

    /**
     * 根据用户编号查询订单信息
     * @param id
     * @return
     */
    public List<Order> queryOrdersByUserId(int id);

    /**
     * 根据订单号查询订单的状态
     * @param orderId
     * @return
     */
    public int queryOrderTypeByOrderId(String orderId);


}
