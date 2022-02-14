package com.company.J3;

public class PE_3 {
    public static void main(String[] args) {
        float i=1,sum=0;
        while((1.0/i)>=0.001)
        {
            sum+=(1/i);
            i++;
        }
        System.out.println("The result is: " + sum);
    }
}
