package com.mylovin.display.dao;

import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    String getCount();
    String insertSth(int id);
}
