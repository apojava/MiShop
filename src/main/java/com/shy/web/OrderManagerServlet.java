package com.shy.web; /**
 * @author shystart
 * @create 2021-04-08 上午 8:58
 */

import com.shy.bean.Order;
import com.shy.bean.OrderItem;
import com.shy.service.OrderService;
import com.shy.service.impl.OrderServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "OrderManagerServlet", value = "/manager/OrderManagerServlet")
public class OrderManagerServlet extends BaseServlet {

    OrderService orderService = new OrderServiceImpl();
    protected void orderControl(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //查询到所有的订单
        List<Order> orders = orderService.showAllOrder();
        System.out.println(orders);
        //2 把全部图书保存到Request域中
        req.setAttribute("orders", orders);


        //3、请求转发到pages/order/order.jsp页面
        req.getRequestDispatcher("/pages/manager/order_manager.jsp").forward(req,resp);
    }

    protected void showAllOrderItems(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String orderId = req.getParameter("orderId");
        String userId = req.getParameter("userId");
        System.out.println(orderId);
        //查询到所有的订单详情
        List<OrderItem> orderItems = orderService.showMyOrderItemDetail(orderId);
        //2 把全部图书保存到Request域中 和 订单号
        req.setAttribute("orderItems", orderItems);
        req.setAttribute("orderId", orderId);
        req.setAttribute("userId", userId);

        //3、请求转发到pages/order/order.jsp页面
        req.getRequestDispatcher("/pages/manager/orderItems_manager.jsp").forward(req,resp);

    }

    protected void senderOrder(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String orderIdIsSender = req.getParameter("orderId");

        orderService.sendOrder(orderIdIsSender);

//        int type = orderService.queryOrderTypeByOrderId(orderIdIsSender);
//
//        System.out.println(type);
//
//        req.getSession().setAttribute("type", type);

        req.getSession().setAttribute("orderIdIsSender", orderIdIsSender);

        req.getRequestDispatcher("/pages/manager/order_sender.jsp").forward(req,resp);
    }
}
