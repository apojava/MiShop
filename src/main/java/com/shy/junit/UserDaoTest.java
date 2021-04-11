package com.shy.junit;

import com.shy.bean.User;
import com.shy.dao.UserDao;
import com.shy.dao.impl.UserDaoImpl;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author shystart
 * @create 2021-03-16 下午 15:44
 */
public class UserDaoTest {

    UserDao u = new UserDaoImpl();

    @Test
    public void test(){
        if(u.qureyUserByUsername("shys") == null){
            System.out.println("用户名可用");
        }else{
            System.out.println("用户名已经存在！");
        }
    }
    @Test
    public void test1(){
        if(u.queryUserByUsernameAndPassword("shy","123456") == null){
            System.out.println("用户名或密码错误");
        }else{
            System.out.println("查询成功");
        }
    }
    @Test
    public void test2(){
        System.out.println(u.saveUser(new User(2,"lql", "123456", "lql@126.com",1)));
    }

    @Test
    public void queryTypeByUsername(){
        int type = u.queryTypeByUsername("admin");
        System.out.println(type);
    }

}