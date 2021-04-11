package com.shy.junit;

import com.shy.bean.Page;
import com.shy.bean.Phone;
import com.shy.service.PhoneService;
import com.shy.service.impl.PhoneServiceImpl;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author shystart
 * @create 2021-03-25 下午 17:24
 */
public class PhoneServiceTest {
    PhoneService phoneService = new PhoneServiceImpl();
    @Test
    public void addPhone() {
        phoneService.addPhone(new Phone(3,"小米7","雷军","1999",100,0,null));
    }

    @Test
    public void deletePhoneById() {
        phoneService.deletePhoneById(2);
    }

    @Test
    public void updatePhone() {
    }

    @Test
    public void queryPhoneById() {
        System.out.println(phoneService.queryPhoneById(1));
    }

    @Test
    public void queryPhones() {
        for (Phone queryBook : phoneService.queryPhones()) {
            System.out.println(queryBook);
        }
    }
    @Test
    public void page(){
        System.out.println(phoneService.page(1, Page.PAGE_SIZE));
    }
}