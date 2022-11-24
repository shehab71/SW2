package com.classes;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public class order {
    private int id;
    private ArrayList<medicine> m1;
    private ArrayList<Integer>count;
    private LocalDate d1;
    private boolean approve=false;
     static ArrayList<order> orders=new ArrayList<order>();

    public order() {
        Random r1=new Random();
        int x=r1.nextInt(99999);
        this.id = x;
        this.m1 =new ArrayList<medicine>();
        count=new ArrayList<Integer>();
    }

    public int getId() {
        return id;
    }

    public boolean isApprove() {
        return approve;
    }

    public LocalDate getD1() {
        return d1;
    }

    public ArrayList<medicine> getM1() {
        return m1;
    }

    public void add_med_to_order(medicine m1, int count)
    {
        this.m1.add(m1);
        this.count.add(count);

    }
    public void edit__order(ArrayList<medicine> m1,ArrayList<Integer> count)
    {
        this.count=count;
        this.m1=m1;
        for (int i=0;i<m1.size();i++)
        {
            m1.get(i).setCount(m1.get(i).getCount()-count.get(i));
        }

    }
    public void purchase()
    {
        for (int i=0;i<m1.size();i++)
        {
            this.m1.get(i).setCount(this.m1.get(i).getCount()-this.count.get(i));
        }
        d1 = LocalDate.now();

        orders.add(this);
    }

    public ArrayList<Integer> getCount() {
        return count;
    }
}
