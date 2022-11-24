package com.classes;
import java.util.ArrayList;
import java.util.Random;

public class employee extends staff{
    public static ArrayList<employee> em=new ArrayList<employee>();
    private request[] req=new request[5];
    public employee( int personal_id, int phone, String fname, String lname, String gender,int salary,String email,String password) {
        super(personal_id, phone, fname, lname, gender,salary,email,password);
        em.add(this);
    }
        public int getSalary()
        {
            return this.salary;
        }
    public int getId() {
        return id;
    }

    public int getPersonal_id() {
        return personal_id;
    }

    public int getPhone() {
        return phone;
    }

    public String getFname() {
        return Fname;
    }

    public String getLname() {
        return Lname;
    }

    public String getGender() {
        return gender;
    }
    
        public void setphone(int phone)
        {
            this.phone=phone;
        }
        public void setEmail(String email)
        {
            this.email=email;
        }
        public void setPass(String pass)
        {
            this.password=pass;
        }
        public void setfname(String fname)
        {
            this.Fname=fname;
        }

        public void setlname(String lname)
        {
            this.Lname=lname;
        }

        public void setgender(String gender)
        {
            this.gender=gender;
        }

        public void setsalary(int salary)
        {
            this.salary=salary;
        }









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
    public void stock_rep()
    {
        stock_report r1=new stock_report();
        r1.print();

    }

}
