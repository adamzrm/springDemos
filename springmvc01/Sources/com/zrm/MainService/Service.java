package com.zrm.MainService;

import com.zrm.MainDao.UserDao;
import com.zrm.MainEntity.Usre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Service {
    @Autowired
    private UserDao userDao;

    public Usre getUser(Usre usre) {
        System.out.println("通过controller的获取到的user去Dao查询的得到的User");
        return userDao.getUser(usre);
    }
}
