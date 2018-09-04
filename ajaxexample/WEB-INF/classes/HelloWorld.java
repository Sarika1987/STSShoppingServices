/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tpz9tam
 */
public class HelloWorld {

    /**This program calculates prime numbers
     *
     * @param args
     */
    public static void main(String args[]){
        /** This is for documentation purpose */
//        System.out.println("Hello Sarika,Welcome to java");
        String s3 = "This is Java String example";
        String s4 = "This is Java String example";
        StringBuffer s1=new StringBuffer(s3);
        
        String s2 = new String();
        s2 = "My world";
        s2 = s2.replace("My","Our");
        
        System.out.println(s2);
        System.out.println(s3==s4);
        System.out.println(s3.equals(s4));
//        int n=1923;
//         for(int j=2;j<=n;j++){
//          if (isPrime(j)){
//              System.out.println(j);
//          }
//         }
//                 int a[]={0,11,12,34,18};
//        for(int k:a){
//            System.out.println(k);
//        }
          
    }
    /** This method calculates prime number by fastest method*/
//    static boolean isPrime(int n){
//      if (n%2==0) return false;
//      for (int i=3;i*i<=n;i+=2){
//        if (n%i==0) 
//              return false;
//                      
//      }
//      return true;
//    }
}
