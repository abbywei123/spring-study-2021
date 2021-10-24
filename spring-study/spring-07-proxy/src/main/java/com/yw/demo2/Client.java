package com.yw.demo2;

public class Client {
    public static void main(String[] args) {
        USerServiceImpl userService=new USerServiceImpl();
        UserServiceProxy proxy=new UserServiceProxy();
        proxy.setuSerService(userService);
        proxy.add();
    }
}
