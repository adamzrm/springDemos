package com.zrm;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Beans {
    public static void main(String[] args) {
        //测试
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("a.xml");
        Person person = ctx.getBean("person", Person.class);
        System.out.println(ToStringBuilder.reflectionToString(person, ToStringStyle.MULTI_LINE_STYLE));
    }
}
