package com.classes;
import java.util.ArrayList;
public class category {

    private String name;
    private ArrayList<medicine>m1;
    private static ArrayList<category> ct=new ArrayList<category>();

    public category( String name) {
        this.m1=new ArrayList<medicine>();
        this.name = name;
        ct.add(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<medicine> getM1() {
        return m1;
    }
    public static void del(category c1)
    {
        ct.remove(c1);
    }


}
