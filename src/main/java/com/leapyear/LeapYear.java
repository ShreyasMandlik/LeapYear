package com.leapyear;
import  java.util.Scanner;
public class LeapYear {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Years you want to check : ");
        int No_Year = sc.nextInt();
        while (No_Year!=0) {
            System.out.println("Enter the Year you want to check : ");
            int Year=sc.nextInt();
            if(checkYear(Year)==Boolean.TRUE){
                System.out.println("The is a leap Year ");
            }
            else{
                System.out.println("The is a not leap Year ");
            }
            No_Year--;
        }
    }

    public static boolean checkYear(int Year){
        if (Year % 4 == 0) {
            if (Year % 100 == 0) {
                if (Year % 400 == 0)
                    return Boolean.TRUE;
                else
                    return Boolean.FALSE;
            } else
                return Boolean.TRUE;
        } else
            return Boolean.FALSE;
    }

}
