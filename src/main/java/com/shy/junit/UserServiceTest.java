package com.shy.junit;

import com.shy.bean.User;
import com.shy.service.UserService;
import com.shy.service.impl.UserServiceImpl;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author shystart
 * @create 2021-03-16 下午 16:01
 */
public class UserServiceTest {
    UserService userService = new UserServiceImpl();


    @Test
    public void registUser() {
        userService.registUser(new User(null, "bbj168", "666666", "bbj168@qq.com",1));
        userService.registUser(new User(null, "abc168", "666666", "abc168@qq.com",1));
    }

    @Test
    public void login() {
        System.out.println( userService.login(new User(null, "shy", "123456", null,1)) );
    }

    @Test
    public void existsUsername() {
        if (userService.existUsername("wzg16888")) {
            System.out.println("用户名已存在！");
        } else {
            System.out.println("用户名可用！");
        }
    }
    @Test
    public void QueryTypeByUsername() {
        System.out.println(userService.QueryTypeByUsername("admin"));
    }
}