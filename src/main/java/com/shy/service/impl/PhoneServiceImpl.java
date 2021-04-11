package com.shy.service.impl;

import com.shy.bean.Page;
import com.shy.bean.Phone;
import com.shy.dao.PhoneDao;
import com.shy.dao.impl.PhoneDaoImpl;
import com.shy.service.PhoneService;

import java.util.List;

/**
 * @author shystart
 * @create 2021-03-25 下午 17:18
 */
public class PhoneServiceImpl implements PhoneService {
    PhoneDao phoneDao = new PhoneDaoImpl();
    @Override
    public void addPhone(Phone phone) {
        phoneDao.addPhone(phone);
    }

    @Override
    public void deletePhoneById(Integer id) {
        phoneDao.deletePhoneById(id);
    }

    @Override
    public void updatePhone(Phone phone) {
        phoneDao.updatePhone(phone);
    }

    @Override
    public Phone queryPhoneById(Integer id) {
        return phoneDao.queryPhoneById(id);
    }

    @Override
    public List<Phone> queryPhones() {
        return phoneDao.queryPhones();
    }

    @Override
    public Page<Phone> page(int pageNo, int pageSize) {
        Page<Phone> page = new Page<Phone>();

        // 设置每页显示的数量
        page.setPageSize(pageSize);
        // 求总记录数
        Integer pageTotalCount = phoneDao.queryForPageTotalCount();
        // 设置总记录数
        page.setPageTotalCount(pageTotalCount);
        // 求总页码
        Integer pageTotal = pageTotalCount / pageSize;
        if (pageTotalCount % pageSize > 0) {
            pageTotal+=1;
        }
        // 设置总页码
        page.setPageTotal(pageTotal);


        // 设置当前页码
        page.setPageNo(pageNo);

        // 求当前页数据的开始索引
        int begin = (page.getPageNo() - 1) * pageSize;
        // 求当前页数据
        List<Phone> items = phoneDao.queryForPageItems(begin,pageSize);
        // 设置当前页数据
        page.setItems(items);

        return page;
    }

    @Override
    public Page<Phone> pageByPrice(int pageNo, int pageSize, int min, int max) {
        Page<Phone> page = new Page<Phone>();

        // 设置每页显示的数量
        page.setPageSize(pageSize);
        // 求总记录数
        Integer pageTotalCount = phoneDao.queryForPageTotalCountByPrice(min,max);
        // 设置总记录数
        page.setPageTotalCount(pageTotalCount);
        // 求总页码
        Integer pageTotal = pageTotalCount / pageSize;
        if (pageTotalCount % pageSize > 0) {
            pageTotal+=1;
        }
        // 设置总页码
        page.setPageTotal(pageTotal);

        // 设置当前页码
        page.setPageNo(pageNo);

        // 求当前页数据的开始索引
        int begin = (page.getPageNo() - 1) * pageSize;
        // 求当前页数据
        List<Phone> items = phoneDao.queryForPageItemsByPrice(begin,pageSize,min,max);
        // 设置当前页数据
        page.setItems(items);

        return page;
    }
}
