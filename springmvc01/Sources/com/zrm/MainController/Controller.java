package com.zrm.MainController;

import com.zrm.MainEntity.Usre;
import com.zrm.MainService.Service;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("conl")
public class Controller {
    @Autowired
    private Usre usre;
    @Autowired
    private Service service;

    @Test
    public void out(){
        System.out.println(this.usre);
    }

    public void control() {
        if (service.getUser(usre) == null) {
            System.out.println("找不到对应的信息");
        } else {
            System.out.println("login successfully");
        }
    }
}
