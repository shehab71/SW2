package com.classes;
public class staff extends person{
    protected int salary;



    public staff( int personal_id, int phone, String fname, String lname, String gender, int salary,String email,String password) {

        super( personal_id, phone, fname, lname, gender,email,password);
        this.salary=salary;
    }
}
