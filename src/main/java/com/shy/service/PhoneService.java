package com.shy.service;

import com.shy.bean.Page;
import com.shy.bean.Phone;

import java.util.List;

/**
 * @author shystart
 * @create 2021-03-25 下午 17:16
 */
public interface PhoneService {

    public void addPhone(Phone phone);

    public void deletePhoneById(Integer id);

    public void updatePhone(Phone phone);

    public Phone queryPhoneById(Integer id);

    public List<Phone> queryPhones();

    Page<Phone> page(int pageNo, int pageSize);

    Page<Phone> pageByPrice(int pageNo, int pageSize, int min, int max);
}
