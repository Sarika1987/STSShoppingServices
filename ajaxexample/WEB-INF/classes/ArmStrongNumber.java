/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tpz9tam
 */
public class ArmStrongNumber {
    public static void main(String args[]){
        int c=0,a,temp;
        int n=154;
        temp=n;
        while(n>0){
           a=n%10;
           n=n/10;
           c=c+(a*a*a);           
        }
        if(temp==c)
            System.out.println(temp + "is an Armstrong number");
        else
            System.out.println(temp + "is not an Armstrong number");
    }
}
