
package com.java.core51.test;

import java.util.Scanner;


public class NumberPower {
    public static void main(String[] args) {
        Scanner sc =new  Scanner(System.in);
        System.out.print("Enter your first Number : ");
        int x=sc.nextInt();
        System.out.print("Enter your secound Number : ");
        int y=sc.nextInt();
        double z =Math.pow(x, y);
        System.out.println(x+" to the power "+y+" is = "+z);
        
        
        
    }
    
}
