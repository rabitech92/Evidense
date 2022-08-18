
package com.java.core51.test;

import java.util.Scanner;


public class PrimeNumber {public static void main(String[] args) {
       
Scanner prime =new  Scanner(System.in);
int x;

        System.out.println("Enter any Number : ");
        x=prime.nextInt();
        if(x<=2){
            System.out.print("Is not prime Number");
        }
        for (int i = 2; i < x/2; i++) {
            for (int j = 2; j < i; j++) {
                
            }
            if(x%i==0 ){
                System.out.print(" Is not Prime");
                break;
            }else{
                System.out.print(" is Prime Number");
                break;
            }
            
        }
    }
    
}
