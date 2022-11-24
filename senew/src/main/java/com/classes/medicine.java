package com.classes;
import java.util.ArrayList;
import java.util.Random;

public class medicine {
    private int id;
    private int count;
    private String type;
    private String name;
    private float cost;
    public static ArrayList<medicine> med=new ArrayList<medicine>();
    private ArrayList<category> c1;

    public medicine( int count, String type, String name, category c1,float cost) {
        this.c1=new ArrayList<category>();
        Random r1=new Random();
        int x=r1.nextInt(99999);
        this.id = x;
        this.count = count;
        this.type = type;
        this.name = name;
        this.c1.add(c1);
        this.cost=cost;
        med.add(this);

    }


    public float getCost() {
        return cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public ArrayList<category> getC1() {
        return c1;
    }

    public void setC1(ArrayList<category> c1) {
        this.c1 = c1;
    }
    public static void del(medicine m1)
    {
        med.remove(m1);
    }
}
