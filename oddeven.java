package com.example.samples.com.example.oddoreven;

import java.util.Scanner;
//program to check odd or even number
public class oddeven {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the no.");
        int n=s.nextInt();
        if(n%2==0)
        {
            System.out.println("even"+n/2);
        }
        else
            System.out.println("odd" + n);


    }
}
