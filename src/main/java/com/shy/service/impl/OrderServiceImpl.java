package com.shy.service.impl;

import com.shy.dao.PhoneDao;
import com.shy.dao.OrderDao;
import com.shy.dao.OrderItemDao;
import com.shy.dao.impl.PhoneDaoImpl;
import com.shy.dao.impl.OrderDaoImpl;
import com.shy.dao.impl.OrderItemDaoImpl;
import com.shy.bean.*;
import com.shy.service.OrderService;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class OrderServiceImpl implements OrderService {

    private OrderDao orderDao = new OrderDaoImpl();
    private OrderItemDao orderItemDao = new OrderItemDaoImpl();
    private PhoneDao phoneDao = new PhoneDaoImpl();

    @Override
    public String createOrder(Cart cart, Integer userId) {
        // 订单号===唯一性
        String orderId = System.currentTimeMillis()+""+userId;
        // 创建一个订单对象
        Order order = new Order(orderId,new Date(),cart.getTotalPrice(), 0,userId);
        // 保存订单
        orderDao.saveOrder(order);
//        int i = 12/0;
        // 遍历购物车中每一个商品项转换成为订单项保存到数据库
        for (Map.Entry<Integer, CartItem>entry : cart.getItems().entrySet()){
            // 获取每一个购物车中的商品项
            CartItem cartItem = entry.getValue();
            // 转换为每一个订单项
            OrderItem orderItem = new OrderItem(null,cartItem.getName(),cartItem.getCount(),cartItem.getPrice(),cartItem.getTotalPrice(), orderId);
            // 保存订单项到数据库
            orderItemDao.saveOrderItem(orderItem);

            // 更新库存和销量
            Phone phone = phoneDao.queryPhoneById(cartItem.getId());
            phone.setSales( phone.getSales() + cartItem.getCount() );
            phone.setStock( phone.getStock() - cartItem.getCount() );
            phoneDao.updatePhone(phone);

        }
        // 清空购物车
        cart.clear();

        return orderId;
    }

    @Override
    public List<Order> showAllOrder() {
        return orderDao.queryOrder();
    }

    @Override
    public void sendOrder(String orderId) {
        orderDao.changeOrderStatus(orderId, 1);
    }

    @Override
    public List<Order> showMyOrderDetail(int userId) {
        return orderDao.queryOrdersByUserId(userId);
    }

    @Override
    public List<OrderItem> showOrderDetail(String orderId) {
        return null;
    }

    @Override
    public List<OrderItem> showMyOrderItemDetail(String orderId) {
        return orderItemDao.queryOrderItemByOrderId(orderId);
    }

    @Override
    public void receiverOrder(String orderId) {

    }

    @Override
    public int queryOrderTypeByOrderId(String orderId) {
        return orderDao.queryOrderTypeByOrderId(orderId);
    }
}
