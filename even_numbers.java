package com.example.samples.com.example.oddoreven.com.example.sample;
//program to print even numbers from 10-100
public class even_numbers {
    public static void main(String[] args){
        for(int i=10;i<=100;i++){
            if(i%2==0){
                System.out.println(i);
            }
            else
                continue;

        }
    }
}
