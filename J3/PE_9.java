package com.company.J3;
import java.util.Scanner;
public class PE_9 {
    public static void main(String[] args) {
        int a,b,sum=0;
        System.out.println("Enter the range a and b: ");
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        for(int i=a;i<=b;i++)
        {
            sum+=i;
        }
        System.out.println("The required sum is: " + sum);
    }
}
