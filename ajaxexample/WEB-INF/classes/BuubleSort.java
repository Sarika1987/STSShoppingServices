/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tpz9tam
 */
//import java.util.*;
public class BuubleSort {
    
    public static void main (String args[]){
        
        int a[] = {60,3,2,56,320,56,78,5,6,4546,234,45,35,67,65,67};
        System.out.println("Array before Bubble sort");
        for(int m:a){
            System.out.print(m+" ");
        }
        bubblesort(a);
        System.out.println("Array after Bubble sort");
        for(int n:a){
            System.out.print(n+" ");
        }
    }
static void bubblesort(int[] b){
  int n = b.length, temp=0;
  for (int i=0;i<(n-1);i++ ){
      for (int j=0;j<(n-1);j++){
          
          if (b[j] > b[j+1]){
            temp = b[j];
            b[j] = b[j+1];
            b[j+1] = temp;
          }
        
      }
  }
}    
}


