package com.zrm.MainEntity;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/*
 * 通过注解方式注入值的时候不需要get，set方法
 * */
@Component("user")//向spring容器中注册bean
@Scope("prototype")//修改bean的类型默认为singleton
public class Usre {
    @Value("18")
    private Integer age;
    @Value("zrm")
    private String name;
}
