package com.company.J2;
import java.util.Scanner;
public class PE_5 {
    public static void main(String[] args) {
        float a,b,c,d,e;
        System.out.println("Enter five numbers: ");
        Scanner sc=new Scanner(System.in);
        a= sc.nextFloat();
        b= sc.nextFloat();
        c= sc.nextFloat();
        d= sc.nextFloat();
        e= sc.nextFloat();
        System.out.println("Average of the these numbers is: " + (a+b+c+d+e)/5);
    }
}
