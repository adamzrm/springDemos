package com.zrm.MainDao;

import com.zrm.MainEntity.Usre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class UserDao {
    //@Autowired    //自动注入，默认是bytype如果要通过byname要使用添加@Qualifier("user")

    public Usre getUser(Usre usre) {
        System.out.println("这里是UserDao获取的user");
        return new Usre();
    }
}
