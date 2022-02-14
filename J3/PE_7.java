package com.company.J3;
//import java.lang.Math;
public class PE_7 {
    public static void main(String[] args) {
        System.out.println("6 random numbers between 10 and 20 are:");
        for(int i=0;i<6;i++)
        {
            System.out.println(Math.floor((Math.random())*11+10));
        }
    }
}
