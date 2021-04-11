package com.shy.junit;

import com.shy.dao.OrderItemDao;
import com.shy.dao.impl.OrderItemDaoImpl;
import com.shy.bean.OrderItem;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

public class OrderItemDaoTest {

    OrderItemDao orderItemDao = new OrderItemDaoImpl();
    @Test
    public void saveOrderItem() {


        orderItemDao.saveOrderItem(new OrderItem(null,"小米11", 1,new BigDecimal(3999),new BigDecimal(3999),"16177546291753"));
        orderItemDao.saveOrderItem(new OrderItem(null,"小米11pro", 2,new BigDecimal(4999),new BigDecimal(9998),"16177546291753"));
        orderItemDao.saveOrderItem(new OrderItem(null,"小米11u", 1,new BigDecimal(5999),new BigDecimal(5999),"16177546291753"));

    }

    @Test
    public void queryOrderItemByOrderId() {
        List<OrderItem> orderItems = orderItemDao.queryOrderItemByOrderId("16177546291753");

        for (OrderItem orderitem:
                orderItems) {
            System.out.println(orderitem);
        }
    }
}

