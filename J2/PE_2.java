package com.company.J2;
import java.util.Scanner;
import java.math.*;
public class PE_2 {
    public static void main(String[] args) {
        float a,b,c;
        System.out.println("Enter the three sides of the triangle: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
        float s = (a+b+c)/2;
        System.out.println("The area of triangle is: " + Math.sqrt(s*(s-a)*(s-b)*(s-c)) + " sq. units");
    }
}
