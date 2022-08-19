
package com.java.core51.test;

import java.util.Scanner;


public class GCDConcept {
    
    public static int gcd(int first_num,int sec_num)
    { int i=first_num%sec_num;
    while(i!=0){
    first_num=sec_num;
    sec_num=i;
    i=first_num%sec_num;
    }
    return sec_num;
    }
            
    public static void main(String[] args) {
        Scanner sc =new  Scanner(System.in);
        System.out.println("Enter your first Number :");
        int num1=sc.nextInt();
        System.out.println("Enter your secound Number :");
        int num2=sc.nextInt();
        System.out.println("GCD of two number : "+gcd (num1,num2));
    }
    
}
