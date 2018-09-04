/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tpz9tam
 */
public class PrimeNumbers {
    public static void main(String args[]){
        int n=48;
        if(isPrime(n)){
            System.out.println(n + " is a prime number");
        }else{
            System.out.println(n + " is not a prime number");
        }
    }
    static boolean isPrime(int m){
        if(m%2 == 0) return false;
        for (int i=3;i*i <= m;i+=2){
            if (m%i == 0) return false;      
        }
                  return true;
    }
}
