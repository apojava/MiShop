package com.shy.dao.impl;

import com.shy.bean.User;
import com.shy.dao.UserDao;

/**
 * @author shystart
 * @create 2021-03-16 上午 11:57
 */
public class UserDaoImpl extends BaseDao implements UserDao{



    @Override
    public User qureyUserByUsername(String username) {
        String sql = "select `id`,`username`,`password`,`email`,`type` from t_user where username = ?";
        return queryFroOne(User.class,sql,username);
    }

    @Override
    public User queryUserByUsernameAndPassword(String username, String password) {
        String sql = "select `id`,`username`,`password`,`email`,`type`  from t_user where username = ? and password = ?";
        return queryFroOne(User.class,sql,username,password);
    }

    @Override
    public int saveUser(User user) {
        String sql = "insert into t_user(`username`,`password`,`email`,`type` ) values(?,?,?,?)";
        return update(sql, user.getUsername(),user.getPassword(),user.getEmail(),user.getType());
    }

    @Override
    public int queryTypeByUsername(String username) {
        String sql = "select `type`  from t_user where username = ?";
        return (int) queryForSingleValue(sql,username);
    }
}
