package com.mylovin.display.service.impl;

import com.mylovin.display.dao.UserDao;
import com.mylovin.display.service.DisplayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DisplayServiceImpl implements DisplayService {
    @Autowired
    UserDao userDao;

    public String getCount() {
        return this.userDao.getCount();
    }

    public String insertSth() {
        int[] ids = new int[]{1, 2, 3};
        for (int id: ids) {
            this.userDao.insertSth(id);
        }
        return "ok";
    }
}
