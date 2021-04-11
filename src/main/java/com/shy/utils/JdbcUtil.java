package com.shy.utils;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author shystart
 * @create 2021-04-07 上午 8:32
 */
public class JdbcUtil {

//    未使用事务
    private static DruidDataSource dataSource;

    static {
        try {
            Properties p = new Properties();
            InputStream is = JdbcUtils.class.getClassLoader().getResourceAsStream("jdbc.properties");
            p.load(is);
            dataSource = (DruidDataSource) DruidDataSourceFactory.createDataSource(p);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }




    /**
     * 获取数据库连接
     * @return 如果不为空说明成功获取连接
     */
    public static Connection getConnection(){
        Connection c = null;
        try {
            c = dataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return c;
    }

    /**
     * 关闭连接，放回数据库连接池
     * @param c
     */
    public static void close(Connection c){
        if(c != null){
            try {
                c.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
