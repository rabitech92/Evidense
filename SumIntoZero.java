
package com.java.core51.test;

import java.util.Scanner;


public class SumIntoZero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.println("Enter give those Number : ");
        for (int i = 0; i>=0; i++) {
            
            int val=sc.nextInt();
            if(val==0){
            break;
            }
            else{
            
            sum=sum+val;
            }
            System.out.println("Total of sum : "+sum);
            
        }
        
    }
    
}
