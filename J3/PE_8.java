package com.company.J3;

public class PE_8 {
    public static void main(String[] args) {
        int a,b,sum1=0,sum2=0;
        for(int i=0;i<5;i++)
        {
            System.out.println("Try-" + (i+1));
            a=(int)(Math.random()*1001+1000);
            System.out.println("Person-A: " + a);
            sum1+=a;
            b=(int)(Math.random()*1001+1000);
            System.out.println("Person-B: " + b);
            sum2+=b;
        }
        System.out.println("Person-A's total is: Rs." + sum1);
        System.out.println("Person-B's total is: Rs." + sum2);
        if(sum1>sum2)
        {
            System.out.println("Person-A is the winner");
        }
        else if(sum1<sum2)
        {
            System.out.println("Person-B is the winner");
        }
        else if(sum1==sum2)
        {
            System.out.println("Game Draw");
        }
    }
}
