/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tpz9tam
 */
public class FactorialRecursion {
    
    public static void main(String args[]){
        
        int number = 15,fact;
        
        fact = factorial(number);
        
        System.out.println("Factorial:" +fact);
    }
   
    static int factorial(int n){
        int f = 1;
        if (n>0){
            f = n*factorial(n-1);
        }
        return f;
            
    }
    
}
