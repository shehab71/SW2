package com.classes;
import java.util.ArrayList;

public class customer extends person {
    private ArrayList<order> orders;
    private order r1;

    public ArrayList<order> getOrders() {
        return orders;
    }

    public static ArrayList<customer> customers=new ArrayList<customer>();;
    private ArrayList<medicine> med;
    public customer( int personal_id, int phone, String fname, String lname, String gender,String email,String password) {
        super( personal_id, phone, fname, lname, gender,email,password);
        orders=new ArrayList<order>();
        med=new ArrayList<medicine>();
        customers.add(this);

    }

    public void create_order()
    {
        r1=new order();
    }
    public void add_to_order(medicine m1,int count)
    {
        if (r1==null){
            create_order();
        }
        r1.add_med_to_order(m1,count);
    }
    public void edit_order(ArrayList<medicine> m1,ArrayList<Integer> count)
    {
        r1.edit__order(m1,count);
    }
    public void sendrequest()
    {
        r1.purchase();
        orders.add(r1);
        r1=null;

    }
    public void printmyorders()
    {
        report_customer_oerder rco1=new report_customer_oerder(this);
        rco1.print();
    }


}
