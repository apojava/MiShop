package com.shy.service;

import com.shy.bean.Cart;
import com.shy.bean.Order;
import com.shy.bean.OrderItem;

import java.util.List;

public interface OrderService {

    /**
     * 生成订单
     * @param cart
     * @param userId
     * @return
     */
    public String createOrder(Cart cart,Integer userId);

    /**
     * 查询所有订单
     * @return
     */
    public List<Order> showAllOrder();

    /**
     * 发货
     * @param orderId
     */
    public void sendOrder(String orderId);

    /**
     * 查看我的订单
     * @param userId
     * @return
     */
    public List<Order> showMyOrderDetail(int userId);

    /**
     * 查看订单详情
     * @param orderId
     * @return
     */
    public List<OrderItem> showOrderDetail(String orderId);

    /**
     * 查看我的订单项
     * @param orderId
     * @return
     */
    public List<OrderItem> showMyOrderItemDetail(String orderId);

    /**
     * 签收订单 确认收货
     * @param orderId
     */
    public void receiverOrder(String orderId);

    /**
     * 获取订单状态
     * @param orderId
     * @return
     */
    public int queryOrderTypeByOrderId(String orderId);


}
