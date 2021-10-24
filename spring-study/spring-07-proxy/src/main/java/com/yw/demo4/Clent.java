package com.yw.demo4;

public class Clent {
    public static void main(String[] args) {
        UserService userService=new USerServiceImpl();

        //代理角色
        ProxyInvocationHandler pih=new ProxyInvocationHandler();

        pih.setTarget(userService);
        UserService proxy=(UserService) pih.getProxy();
        proxy.add();
    }
}
