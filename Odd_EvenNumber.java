
package com.java.core51.test;




public class Odd_EvenNumber {
    public static void main(String[] args) {
        int arr[]={12,13,15,16,14,17,18,19,21};
       
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
                System.out.println("Even Number of arr : "+arr[i]);
                
                    
                }
            
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==1) {
               System.out.println("Odd Number of arr : "+arr[i]);
            }
            
        }
    }
    
}
