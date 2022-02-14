package com.company.J3;
import java.util.Scanner;
public class PE_11 {
    public static void main(String[] args) {
        int a,b,n;
        System.out.println("Enter the range a and b:");
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("How many numbers do you want to print?");
        n=sc.nextInt();
        System.out.println("The required numbers are:");
        for(int i=0;i<n;i++)
        {
            System.out.println(Math.ceil(Math.random()*(b-a+1)+a));
        }
    }
}
