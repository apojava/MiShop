package com.shy.dao;

import com.shy.bean.Phone;

import java.util.List;

/**
 * @author shystart
 * @create 2021-03-25 下午 16:38
 */
public interface PhoneDao {
    public int addPhone(Phone phone);

    public int deletePhoneById(Integer id);

    public int updatePhone(Phone phone);

    public Phone queryPhoneById(Integer id);

    public List<Phone> queryPhones();

    Integer queryForPageTotalCount();

    List<Phone> queryForPageItems(int begin, int pageSize);

    Integer queryForPageTotalCountByPrice(int min, int max);

    List<Phone> queryForPageItemsByPrice(int begin, int pageSize, int min, int max);
}
