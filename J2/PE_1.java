package com.company.J2;
import java.util.Scanner;

public class PE_1 {
    public static void main(String[] args) {
        int l,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of rectangle: ");
        l = sc.nextInt();
        System.out.print("Enter the breadth of rectangle: ");
        b = sc.nextInt();
        System.out.println("The area of rectangle is: " + l*b);
    }
}
