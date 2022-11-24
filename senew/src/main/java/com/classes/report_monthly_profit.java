package com.classes;
import java.time.LocalDate;

public class report_monthly_profit implements report{
    LocalDate d1=LocalDate.now();
    @Override
    public void print() {
        double profit=0;
        for (int i=0;i<order.orders.size();i++)
        {
            while (d1.getMonth()==order.orders.get(i).getD1().getMonth() || Integer.parseInt(String.valueOf(d1.getMonth()))-1==Integer.parseInt(String.valueOf(order.orders.get(i).getD1().getMonth())))
            {
                if (d1.getDayOfMonth()>=order.orders.get(i).getD1().getDayOfMonth())
                {
                    for (int z=0;z<order.orders.get(i).getM1().size();z++)
                    {
                        profit+=order.orders.get(i).getM1().get(z).getCost()*order.orders.get(i).getCount().get(z);

                    }
                    break;
                }
            }
        }
            System.out.println(profit);
    }
}
