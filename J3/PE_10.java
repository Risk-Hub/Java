package com.company.J3;
import java.util.Scanner;
public class PE_10 {
    public static void main(String[] args) {
        int n1,n2,n3,n4,max;
        System.out.println("Enter four numbers:");
        Scanner sc = new Scanner(System.in);
        n1=sc.nextInt();
        n2=sc.nextInt();
        n3=sc.nextInt();
        n4=sc.nextInt();
        max = (n1 > n2 && n1 > n3 && n1 > n4) ?
                n1 : ((n2 > n3 && n2 > n4) ?
                n2 : (n3 > n4 ? n3 : n4));
        System.out.println("The maximum value is: " + max);
    }
}
