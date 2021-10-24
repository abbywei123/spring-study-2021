package com.yw.demo1;

public class Proxy implements Rent{
    private Host host;

    public Proxy(){

    }
    public Proxy(Host host){
        this.host=host;
    }

    @Override
    public void rent() {
        seeHouse();
        host.rent();
        hetong();
        fare();
    }

    //看房
    public void seeHouse() {
        System.out.println("中介带你看房");
    }

    //瘦中介费
    public void fare() {
        System.out.println("中介收费");
    }
    //签租赁合同
    public void hetong() {
        System.out.println("签租赁合同");
    }
}