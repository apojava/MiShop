package com.shy.service.impl;

import com.shy.bean.User;
import com.shy.dao.UserDao;
import com.shy.dao.impl.UserDaoImpl;
import com.shy.service.UserService;

/**
 * @author shystart
 * @create 2021-03-16 下午 15:56
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao = new UserDaoImpl();

    @Override
    public void registUser(User user) {
        userDao.saveUser(user);
    }

    @Override
    public User login(User user) {
        return userDao.queryUserByUsernameAndPassword(user.getUsername(), user.getPassword());
    }

    @Override
    public boolean existUsername(String username) {
        if(userDao.qureyUserByUsername(username) == null){
            return false;
        }

        return true;
    }

    @Override
    public int QueryTypeByUsername(String username) {
        return userDao.queryTypeByUsername(username);
    }
}
