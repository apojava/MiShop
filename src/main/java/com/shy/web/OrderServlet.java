package com.shy.web;

import com.shy.bean.Cart;
import com.shy.bean.Order;
import com.shy.bean.OrderItem;
import com.shy.bean.User;
import com.shy.service.OrderService;
import com.shy.service.impl.OrderServiceImpl;
import com.shy.utils.JdbcUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@WebServlet(name = "OrderServlet",value = "/orderServlet")
public class OrderServlet extends BaseServlet {

    private OrderService orderService = new OrderServiceImpl();

    /**
     * 生成订单
     *
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    protected void createOrder(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 先获取Cart购物车对象
        Cart cart = (Cart) req.getSession().getAttribute("cart");
        // 获取Userid
        User loginUser = (User) req.getSession().getAttribute("user");

        if (loginUser == null) {
            req.getRequestDispatcher("/pages/user/login.jsp").forward(req,resp);
            return;
        }

        Integer userId = loginUser.getId();
//        调用orderService.createOrder(Cart,Userid);生成订单
        String orderId = null;
//        try {
            orderId = orderService.createOrder(cart, userId);

//            JdbcUtils.commitAndClose();//提交并且关闭连接
//        } catch (Exception e) {
//
//            JdbcUtils.rollbackAndClose();//回滚并且关闭连接
//            e.printStackTrace();
//        }

//        req.setAttribute("orderId", orderId);
        // 请求转发到/pages/cart/checkout.jsp
//        req.getRequestDispatcher("/pages/cart/checkout.jsp").forward(req, resp);

        req.getSession().setAttribute("orderId",orderId);

        resp.sendRedirect(req.getContextPath()+"/pages/cart/checkout.jsp");
    }


    /**
     * 展示所有订单
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    protected void showAllOrder(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        User loginUser = (User) req.getSession().getAttribute("user");

        int userId = loginUser.getId();
        System.out.println(userId);
        //查询到所有的订单
        List<Order> orders = orderService.showMyOrderDetail(userId);
        System.out.println(orders);
        //2 把全部图书保存到Request域中
        req.setAttribute("orders", orders);
        //3、请求转发到pages/order/order.jsp页面
        req.getRequestDispatcher("pages/order/order.jsp").forward(req,resp);
    }


    /**
     * 展示所有订单的详情 即订单项
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    protected void showAllOrderItems(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String orderId = req.getParameter("orderId");
        System.out.println(orderId);
        //查询到所有的订单详情
        List<OrderItem> orderItems = orderService.showMyOrderItemDetail(orderId);
        //2 把全部图书保存到Request域中 和 订单号
        req.setAttribute("orderItems", orderItems);
        req.setAttribute("orderId", orderId);

        //3、请求转发到pages/order/order.jsp页面
        req.getRequestDispatcher("pages/order/orderItems.jsp").forward(req,resp);

    }



}
