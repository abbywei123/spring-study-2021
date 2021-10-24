package com.yw.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//等价于 <bean id="user" class="com.yw.pojo.User"></bean>
@Component  //组件
public class User {

    public String name;

    //相当于 <property name="name" value="tutu"/>
    @Value("tutu")
    public void setName(String name) {
        this.name = name;
    }
}
