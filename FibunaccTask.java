
package com.java.core51.test;

import java.util.Scanner;


public class FibunaccTask {
    public static void main(String[] args) {
        
    
    Scanner input = new Scanner(System.in);
    int num1=0,num2=1,num3,fibu;
    
        System.out.print("Wnter a Number : ");
        fibu =input.nextInt();
        System.out.print(num1+""+num2);
        
        for (int i = 2; i < fibu; i++) {
            num3=num1+num2;
            num1=num2;
            num2=num3;
            System.out.print(""+num3);
            
        }
   
}
    
}
