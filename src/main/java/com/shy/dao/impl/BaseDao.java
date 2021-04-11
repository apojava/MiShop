package com.shy.dao.impl;

import com.shy.utils.JdbcUtil;
import com.shy.utils.JdbcUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * @author shystart
 * @create 2021-03-16 上午 10:42
 */
public abstract class BaseDao {
    private QueryRunner queryRunner = new QueryRunner();

    /**
     * 用来执行sql语句
     * @param sql
     * @param args
     * @return
     */
    public int update(String sql,Object... args){

        Connection c = JdbcUtils.getConnection();

        try {
            return queryRunner.update(c,sql,args);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            throw new RuntimeException();
        }

    }

    /**
     * 查询返回一个javaBean的sql语句
     * @param type
     * @param sql
     * @param args
     * @param <T>
     * @return
     */
    public <T> T queryFroOne(Class<T> type,String sql,Object... args){

        Connection c = JdbcUtils.getConnection();
        try {
            return queryRunner.query(c,sql,new BeanHandler<T>(type),args);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            throw new RuntimeException();
        }
    }

    /**
     * 查询返回多个javaBean的sql语句
     * @param type
     * @param sql
     * @param args
     * @param <T>
     * @return
     */
    public <T> List<T> queryForList(Class<T> type, String sql, Object... args){
        Connection c = JdbcUtils.getConnection();

        try {
            return queryRunner.query(c, sql, new BeanListHandler<T>(type), args);
        }  catch (SQLException throwables) {
            throwables.printStackTrace();
            throw new RuntimeException();
        }
    }

    /**
     * 执行返回一行一列的sql的语句
     * @param sql
     * @param args
     * @return
     */
    public Object queryForSingleValue(String sql,Object... args){
        Connection c = JdbcUtils.getConnection();

        try {
            return queryRunner.query(c,sql,new ScalarHandler(),args);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            throw new RuntimeException();
        }
    }
}
