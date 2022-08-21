
package com.java.core.model;

import java.util.Scanner;




public class NewPrime {
    public static void main(String[] args) {
       
Scanner prime =new     Scanner(System.in);

        System.out.print("Enter any Number : ");
       int x=prime.nextInt();
       
        if(x<2){
            System.out.print("Is not prime Number");
        }
        for (int i = 2; i <= x; i++) {
            if (x==i) {
                System.out.println(x+"Is Prime Number");
            }else if(x%i==0 ){
                System.out.print(X+"Is not Prime" );
                break;
            }
            }
            
        }
    }
