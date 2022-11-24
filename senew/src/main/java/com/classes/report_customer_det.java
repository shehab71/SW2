package com.classes;
public class report_customer_det implements report {
    @Override
    public void print() {
        for (int i=0;i<customer.customers.size();i++)
        {
            System.out.println(customer.customers.get(i).Fname+" "+customer.customers.get(i).Lname+"\t"+customer.customers.get(i).phone+"\t"+
                    customer.customers.get(i).gender+"\t"+customer.customers.get(i).id);

        }
    }
}
