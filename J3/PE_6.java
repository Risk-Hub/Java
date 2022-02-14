package com.company.J3;

public class PE_6 {
    public static void main(String[] args) {
        double sum=0,a;
        System.out.println("8 random numbers are:");
        for(int i=0;i<8;i++)
        {
            a=Math.random();
            System.out.println(a);
            sum+=a;
        }
        System.out.println("Their average is: " + sum/8);
    }
}
