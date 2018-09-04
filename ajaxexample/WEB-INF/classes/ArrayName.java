/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tpz9tam
 */
public class ArrayName {
    
   
   public static void main(String args[]){
   int[] ar = {1,2,4};
   Class c = ar.getClass();
   String n = c.getName();
   System.out.println("This is the internal name of the array" + n);
   }
    
}
