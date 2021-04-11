package com.shy.junit;

import com.shy.bean.Cart;
import com.shy.bean.CartItem;
import com.shy.bean.Order;
import com.shy.bean.OrderItem;
import com.shy.service.OrderService;
import com.shy.service.impl.OrderServiceImpl;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.List;

public class OrderServiceTest {
    OrderService orderService = new OrderServiceImpl();
    @Test
    public void createOrder() {
        Cart cart = new Cart();

        cart.addItem(new CartItem(1, "java从入门到精通", 1, new BigDecimal(1000),new BigDecimal(1000)));
        cart.addItem(new CartItem(1, "java从入门到精通", 1, new BigDecimal(1000),new BigDecimal(1000)));
        cart.addItem(new CartItem(2, "数据结构与算法", 1, new BigDecimal(100),new BigDecimal(100)));



        System.out.println( "订单号是：" + orderService.createOrder(cart, 1) );

    }
    @Test
    public void showMyOrderDetail() {

        List<Order> orders = orderService.showMyOrderDetail(3);

        for (Order order:orders) {
            System.out.println(order);
        }

    }
    @Test
    public void showMyOrderItemDetail() {

        List<OrderItem> orderItems = orderService.showMyOrderItemDetail("16177546291753");

        for (OrderItem orderItem:orderItems) {
            System.out.println(orderItem);
        }

    }
    @Test
    public void showAllOrder() {

        List<Order> orders = orderService.showAllOrder();

        for (Order order:orders) {
            System.out.println(order);
        }

    }
    @Test
    public void sendOrder() {

        orderService.sendOrder("16178702982403");

    }
    @Test
    public void queryOrderTypeByOrderId() {

        System.out.println(orderService.queryOrderTypeByOrderId("16178702982403"));

    }
}