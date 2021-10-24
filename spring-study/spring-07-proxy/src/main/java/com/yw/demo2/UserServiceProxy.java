package com.yw.demo2;

public class UserServiceProxy implements UserService{
    USerServiceImpl uSerService;

    public void setuSerService(USerServiceImpl uSerService) {
        this.uSerService = uSerService;
    }

    @Override
    public void add() {
        uSerService.add();
        log("add");
    }

    @Override
    public void delete() {
        uSerService.delete();
        log("delete");
    }

    @Override
    public void update() {
        uSerService.update();
        log("update");
    }

    @Override
    public void query() {
        uSerService.query();
        log("query");
    }

    //日志方法
    public void log(String msg){
        System.out.println("[loging]使用了"+msg+"方法");
    }
}
