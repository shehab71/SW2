package com.classes;
import java.util.Random;

public class request_purchase_order implements request{
    final String msg;
    final int id;
    final order order1;
    public request_purchase_order(String msg,order r2)
    {
        Random r1=new Random();
        int x=r1.nextInt(99999);
        this.id = x;
        this.msg=msg;
        order1=r2;
    }
    @Override
    public void msg() {
        System.out.println(msg);
    }

}
