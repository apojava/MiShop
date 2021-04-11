package com.shy.junit;

import com.shy.bean.Phone;
import com.shy.dao.OrderDao;
import com.shy.dao.impl.OrderDaoImpl;
import com.shy.bean.Order;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

public class OrderDaoTest {

    OrderDao orderDao = new OrderDaoImpl();

    @Test
    public void saveOrder() {

        orderDao.saveOrder(new Order("1234567891",new Date(),new BigDecimal(100),0, 1));

        System.out.println("订单保存成功");
    }
    @Test
    public void queryOrder() {

        List<Order> orders = orderDao.queryOrder();

        for (Order order: orders) {
            System.out.println(order);
        }


    }

    @Test
    public void queryOrdersByUserId(){
        List<Order> orders = orderDao.queryOrdersByUserId(3);

        for (Order order: orders) {
            System.out.println(order);
        }
    }

    @Test
    public void changeOrderStatus(){
        System.out.println(orderDao.changeOrderStatus("16178702982403", 90));//注意是否提交
        System.out.println("修改成功");
    }

    @Test
    public void queryOrderTypeByOrderId(){
        int i = orderDao.queryOrderTypeByOrderId("16178702982403");

        System.out.println(i);
    }


}