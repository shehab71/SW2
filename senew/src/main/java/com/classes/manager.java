package com.classes;
import java.util.ArrayList;
import java.util.Random;

public class manager  {
    public static ArrayList<manager> man=new ArrayList<manager>();
    
    public static String email="ahmed@";
    public static String password="asd@";

   
    public void addmedicine(String name,String type,category c,int count,float cost)
    {
        Random r1=new Random();
        int x=r1.nextInt(99999);
        medicine m1=new medicine(count,type,name,c,cost);
    }
    public void addcat(String name)
    {
        category c1=new category(name);
    }
    public void editcat(category c1,String name)
    {
        c1.setName(name);

    }
    public void delcat(category c1)
    {
        category.del(c1);

    }
    public void editmedicine(medicine m1, String name, String type, ArrayList<category> c, int count)
    {
        m1.setCount(count);
        m1.setType(type);
        m1.setName(name);
        m1.setC1(c);

    }
    public void delmedicine(medicine m1)
    {
        m1.getC1().clear();
        medicine.del(m1);

    }



    public void del_employee(employee e1)
    {
        employee.em.remove(e1);
    }
    public void edit_employee(employee e1, int phone, String fname, String lname, String gender,int salary)
    {
        e1.setfname(fname);
        e1.setgender(gender);
        e1.setlname(lname);
        e1.setphone(phone);
        e1.setsalary(salary);
    }

    public void add_employee(int id, int personal_id, int phone, String fname, String lname, String gender,int salary,String email,String password)
    {
        employee e1=new employee(personal_id,phone,fname,lname,gender,salary,email,password);
    }
    public void customer_del()
    {
        report_customer_det rcd=new report_customer_det();
        rcd.print();
    }
    public void employee_del()
    {
        report_empolyee_del red=new report_empolyee_del();
        red.print();
    }
    public void monthly_profit()
    {
        report_monthly_profit rmp=new report_monthly_profit();
        rmp.print();
    }

}
