
package com.java.core51.test;

import java.util.Scanner;


public class GCDProgramme {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int x,y,gcd=1;
        System.out.println("Enter a number : ");
        x=input.nextInt();
        System.out.println("Enter a number : ");
        y=input.nextInt();
        
        for (int i = 1; i <=x && i<=y; i++) {
            if(x%i==0 && y%i==0)
                gcd=i;
            
            
        }
        System.out.printf("GCD of %d and %d is: %d", x, y, gcd);
  
    }
    
}
