package com.shy.dao;

import com.shy.bean.User;

/**
 * @author shystart
 * @create 2021-03-16 上午 11:01
 */
public interface UserDao {
    /**
     * 根据用户名查询用户信息
     * @param username
     * @return 返回空说明没有这个用户
     */
    public User qureyUserByUsername(String username);

    /**
     * 根据用户名和密码查询用户信息
     * @param name
     * @param password
     * @return
     */
    public User queryUserByUsernameAndPassword(String name,String password);

    /**
     * 保存用户信息
     * @param user
     * @return
     */
    public int saveUser(User user);

    /**
     * 根据用户名查询状态
     * @param username
     * @return
     */
    public int queryTypeByUsername(String username);

}
