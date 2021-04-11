package com.shy.service;

import com.shy.bean.User;

/**
 * @author shystart
 * @create 2021-03-16 下午 15:52
 */
public interface UserService {
    /**
     * 注册用户
     * @param user
     */
    public void registUser(User user);

    /**
     * 登录
     * @param user
     * @return 返回空说明登陆失败
     */
    public User login(User user);

    /**
     * 检查用户名是否可用
     * @param username
     * @return
     */
    public boolean existUsername(String username);

    /**
     * 根据用户名查询用户的状态
     * @param username
     * @return
     */
    public int QueryTypeByUsername(String username);

}
