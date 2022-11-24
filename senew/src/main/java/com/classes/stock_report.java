package com.classes;
import java.util.Random;

public class stock_report implements report {
    final int id;

    public stock_report() {
        Random r1=new Random();
        int x=r1.nextInt(99999);
        this.id = x;
    }

    public  void print() {
        System.out.println("Name \t\t\t Quantity");
        for (int i=0;i<medicine.med.size();i++)
        {
            System.out.println(medicine.med.get(i).getName()+" : "+medicine.med.get(i).getCount());
        }
    }
}
