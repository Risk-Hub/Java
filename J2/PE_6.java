package com.company.J2;
import java.util.Scanner;
public class PE_6 {
    public static void main(String[] args) {
        int a,b,c,d;
        System.out.println("Enter four numbers: ");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        System.out.println("Sum is: " + (a+b+c+d) + "\nAverage is: " + (a+b+c+d)/4.0);
    }
}
