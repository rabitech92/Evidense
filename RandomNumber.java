
package com.java.core51.test;

import java.util.Random;
import java.util.Scanner;


public class RandomNumber {
    public static void main(String[] args) {
        Random x = new Random();
            for (int iCount = 0; iCount< 10; iCount++){
              int y = x.nextInt(10);
              System.out.println("Random No : " + y); 
             }
        
    }
    
    
}
