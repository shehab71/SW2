package com.classes;
import java.util.Random;

public class person {
    protected int id;
    protected int personal_id;
    protected int phone;
    protected String Fname;
    protected String Lname;
    protected String gender;
    protected String email;
    protected String password;
    public person(int personal_id, int phone, String fname, String lname, String gender,String email,String password) {
        Random r1=new Random();
        int x=r1.nextInt(99999);
        this.id = x;
        this.personal_id = personal_id;
        this.phone = phone;
        Fname = fname;
        Lname = lname;
        this.gender = gender;
        this.email=email;
        this.password=password;
    }


}
