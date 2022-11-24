package com.classes;
public class report_customer_oerder implements report {
    private customer c1;

    public report_customer_oerder(customer c1) {
        this.c1 = c1;
    }

    @Override
    public void print() {
        System.out.println("Customer ID : "+c1.id);
        System.out.println("Customer Name : "+c1.Fname+" "+c1.Lname);
        System.out.println("Customer Gender : "+c1.gender);
        System.out.println("Customer Phone : "+c1.phone);
        System.out.println("\n===========================================");
        System.out.println("Name \t\t  Count");
        for (int i=0;i<c1.getOrders().size();i++)
        {
            for (int z=0;z<c1.getOrders().get(i).getM1().size();z++)
            {
                System.out.println(c1.getOrders().get(i).getM1().get(z).getName()+" "+c1.getOrders().get(i).getCount().get(z));
                System.out.println("=================================");
            }

        }
    }
}
