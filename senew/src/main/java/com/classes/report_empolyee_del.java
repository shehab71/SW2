package com.classes;
public class report_empolyee_del implements report{
    @Override
    public void print() {
        System.out.println("Name\t\t\tID\t\tGender\t\tPhone\t\tSalary\t\tPersonal_ID");
        for (int i=0;i<employee.em.size();i++)
        {
            System.out.println(employee.em.get(i).Fname+" "+employee.em.get(i).Lname+"\t\t"+employee.em.get(i).id+
                    "\t\t"+employee.em.get(i).gender+"\t\t"+employee.em.get(i).phone+"\t\t"+employee.em.get(i).getSalary()+
                    "\t\t"+employee.em.get(i).personal_id);

        }
    }
}
