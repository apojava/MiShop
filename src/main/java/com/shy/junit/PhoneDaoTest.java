package com.shy.junit;

import com.shy.bean.Page;
import com.shy.bean.Phone;
import com.shy.dao.PhoneDao;
import com.shy.dao.impl.PhoneDaoImpl;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author shystart
 * @create 2021-03-25 下午 16:50
 */
public class PhoneDaoTest {
    PhoneDao phoneDao = new PhoneDaoImpl();
    @Test
    public void addPhone() {
        phoneDao.addPhone(new Phone(3,"小米6","雷军","1999",100,0,"456789"));
    }

    @Test
    public void deletePhoneById() {
        phoneDao.deletePhoneById(1);
    }

    @Test
    public void updatePhone() {
    }

    @Test
    public void queryPhoneById() {
        System.out.println(phoneDao.queryPhoneById(1));
    }

    @Test
    public void queryPhones() {
        for (Phone queryBook : phoneDao.queryPhones()) {
            System.out.println(queryBook);
        }
    }

    @Test
    public void queryForPageTotalCount() {
        System.out.println(phoneDao.queryForPageTotalCount());
    }

    @Test
    public void queryForPageItems() {

        for (Phone queryBook : phoneDao.queryForPageItems(0, Page.PAGE_SIZE)) {
            System.out.println(queryBook);
        }
    }
}