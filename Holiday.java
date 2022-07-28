package com.company;
import java.util.Scanner;
class Holiday
{
      private String name;
      private int days;
      private String month;
      public Holiday(String n , int d , String m) {
          name = n;
          days =d;
          month = m;
      }
      public boolean inSameMonth(Holiday h){
          return this.month.equals(h.month);
      }
      public static double avgDate(Holiday [] h)
      {
          int sum=0,i;
          for(i=0;i<h.length;i++)
              sum = sum + h[i].days;
          return ((double)sum)/ h.length;
      }

}
public class Main {
    public static void main(String[] args) {
        Holiday h = new Holiday("Independence Day ", 4, "July");
    }
}