
package com.java.core51.test;

import java.util.Scanner;

public class FactorealNumber {
    public static void main(String[] args) {
        Scanner input =new  Scanner(System.in);
        int x,fact=1;
        System.out.println(" Enter a number : ");
        x= input.nextInt();
        for (int i = 1; i < x; i++) {
            fact =fact*i;
            System.out.println("Factoreal number "+x+" is : "+ fact);
            
        }
        
    }
    
}
