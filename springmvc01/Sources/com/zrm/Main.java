package com.zrm;

import com.zrm.MainController.Controller;
import com.zrm.MainEntity.Usre;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("contextApplication.xml");
        Controller controller = ctx.getBean("conl", Controller.class);
        controller.control();
        Usre user = ctx.getBean("user", Usre.class);
        System.out.println(ToStringBuilder.reflectionToString(user, ToStringBuilder.getDefaultStyle()));
    }
}
