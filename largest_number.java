package com.example.samples.com.example.oddoreven.com.example.sample;

import java.util.Scanner;
//to check largest number between thre numbers
public class largest_number {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter first number");
        int n=s.nextInt();
        System.out.println("enter second number");
        int a=s.nextInt();
        System.out.println("enter third number");
        int b=s.nextInt();
        if(n>a && n>b){
            System.out.println("first no. is the greatest");}
            else if(a>n && a>b){
                System.out.println("second no. is largest");
            }
            else
                System.out.println("third no. is the greatest");
        }

    }

