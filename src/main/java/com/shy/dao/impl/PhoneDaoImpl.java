package com.shy.dao.impl;

import com.shy.bean.Phone;
import com.shy.dao.PhoneDao;

import java.util.List;

/**
 * @author shystart
 * @create 2021-03-25 下午 16:41
 */
public class PhoneDaoImpl extends BaseDao implements PhoneDao {
    @Override
    public int addPhone(Phone phone) {

        String sql = "insert into t_phone(`name`,`desiger`,`price`,`sales`,`stock`,`img_path`) values(?,?,?,?,?,?)";

        return update(sql, phone.getName(),phone.getDesiger(),phone.getPrice(),phone.getSales(),phone.getStock(),phone.getImgPath());

    }

    @Override
    public int deletePhoneById(Integer id) {
        String sql = "delete from t_phone where id = ?";
        return update(sql, id);
    }

    @Override
    public int updatePhone(Phone phone) {
        String sql = "update t_phone set `name`=?,`desiger`=?,`price`=?,`sales`=?,`stock`=?,`img_path`=? where id = ?";
        return update(sql,phone.getName(),phone.getDesiger(),phone.getPrice(),phone.getSales(),phone.getStock(),phone.getImgPath(),phone.getId());
    }

    @Override
    public Phone queryPhoneById(Integer id) {
        String sql = "select `id` , `name` , `desiger` , `price` , `sales` , `stock` , `img_path` imgPath from t_phone where id = ?";
        return queryFroOne(Phone.class,sql,id);
    }

    @Override
    public List<Phone> queryPhones() {
        String sql = "select `id` , `name` , `desiger` , `price` , `sales` , `stock` , `img_path` imgPath from t_phone";
        return queryForList(Phone.class, sql);
    }


    @Override
    public Integer queryForPageTotalCount() {
        String sql = "select count(*) from t_phone";
        Number count = (Number) queryForSingleValue(sql);
        return count.intValue();
    }

    @Override
    public List<Phone> queryForPageItems(int begin, int pageSize) {
        String sql = "select `id` , `name` , `desiger` , `price` , `sales` , `stock` , `img_path` imgPath from t_phone limit ?,?";
        return queryForList(Phone.class,sql,begin,pageSize);
    }

    @Override
    public Integer queryForPageTotalCountByPrice(int min, int max) {
        String sql = "select count(*) from t_phone where price between ? and ?";
        Number count = (Number) queryForSingleValue(sql,min,max);
        return count.intValue();
    }

    @Override
    public List<Phone> queryForPageItemsByPrice(int begin, int pageSize, int min, int max) {
        String sql = "select `id`,`name`,`desiger`,`price`,`sales`,`stock`,`img_path` imgPath " +
                "from t_phone where price between ? and ? order by price limit ?,?";
        return queryForList(Phone.class,sql,min,max,begin,pageSize);
    }


}
