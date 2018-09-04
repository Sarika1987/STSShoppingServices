/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tpz9tam
 */
public class FibonacciSeries {
    static int n1=0,n2=1,n3,i,count=10;
    static void fibonacci(int count){
        if (count > 0){
            
            n3 = n1+n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
            fibonacci(count-1);
            
        }
    }
    public static void main(String args[]){
    
    /*System.out.println(n1 + "\n" + n2);
    
    for (i=2;i<=count;i++){
    
    n3 = n1 + n2;
    System.out.println(""+n3);
    n1 = n2;
    n2 = n3;*/
    System.out.print(n1 + " " + n2);
    fibonacci(count-2);
    
}
}  

