package com.shy.web;

import com.shy.bean.Page;
import com.shy.bean.Phone;
import com.shy.service.PhoneService;
import com.shy.service.impl.PhoneServiceImpl;
import com.shy.utils.WebUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author shystart
 * @create 2021-03-25 下午 19:56
 */
@WebServlet(name = "PhoneServlet",value = "/manager/phoneServlet")
public class PhoneServlet extends BaseServlet{

    PhoneService phoneService = new PhoneServiceImpl();

    protected void add(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        int pageNo = WebUtils.parseInt(req.getParameter("pageNo"),0);
        pageNo++;
        //        1、获取请求的参数==封装成为Book对象
        Phone phone = WebUtils.copyParamToBean(req.getParameterMap(),new Phone());
//        2、调用BookService.addBook()保存图书
        phoneService.addPhone(phone);
//        3、跳到图书列表页面
//                /manager/bookServlet?action=list
//        req.getRequestDispatcher("/manager/bookServlet?action=list").forward(req, resp);

        resp.sendRedirect(req.getContextPath() + "/manager/phoneServlet?action=page&pageNo="+pageNo);

    }

    protected void list(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        //1 通过BookService查询全部图书
        List<Phone> Phones = phoneService.queryPhones();
        //2 把全部图书保存到Request域中
        req.setAttribute("Phones", Phones);
        //3、请求转发到/pages/manager/book_manager.jsp页面
        req.getRequestDispatcher("/pages/manager/book_manager.jsp").forward(req,resp);
    }

    protected void delete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        1、获取请求的参数id，图书编程
        int id = WebUtils.parseInt(req.getParameter("id"), 0);
//        2、调用bookService.deleteBookById();删除图书
        phoneService.deletePhoneById(id);
//        3、重定向回图书列表管理页面
//                /book/manager/bookServlet?action=list
        resp.sendRedirect(req.getContextPath() + "/manager/phoneServlet?action=page&pageNo="+req.getParameter("pageNo"));
    }

    protected void getPhone(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1 获取请求的参数图书编号
        int id = WebUtils.parseInt(req.getParameter("id"), 0);
        //2 调用bookService.queryBookById查询图书
        Phone phone = phoneService.queryPhoneById(id);
        //3 保存到图书到Request域中
        req.setAttribute("phone", phone) ;
        //4 请求转发到。pages/manager/book_edit.jsp页面
        req.getRequestDispatcher("/pages/manager/book_edit.jsp").forward(req,resp);
    }

    protected void update(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        1、获取请求的参数==封装成为Book对象
        Phone phone = WebUtils.copyParamToBean(req.getParameterMap(),new Phone());
//        2、调用BookService.updateBook( book );修改图书
        phoneService.updatePhone(phone);
//        3、重定向回图书列表管理页面
//        地址：/工程名/manager/bookServlet?action=list
        resp.sendRedirect(req.getContextPath() + "/manager/phoneServlet?action=page&pageNo="+req.getParameter("pageNo"));
    }

    /**
     * 处理分页功能
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    protected void page(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1 获取请求的参数 pageNo 和 pageSize
        int pageNo = WebUtils.parseInt(req.getParameter("pageNo"), 1);
        int pageSize = WebUtils.parseInt(req.getParameter("pageSize"), Page.PAGE_SIZE);
        //2 调用BookService.page(pageNo，pageSize)：Page对象
        Page<Phone> page = phoneService.page(pageNo,pageSize);

        page.setUrl("manager/phoneServlet?action=page");

        //3 保存Page对象到Request域中
        req.setAttribute("page",page);
        //4 请求转发到pages/manager/book_manager.jsp页面
        req.getRequestDispatcher("/pages/manager/book_manager.jsp").forward(req,resp);
    }
}
