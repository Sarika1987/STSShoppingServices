

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tpz9tam
 */
public class gNomeSort {
public static void main (String args[]){   
        
        int a[] = {60,3,2,56,320,56,78,5};
        int c[] = new int[a.length];
        System.out.println("Array before gnome sort");
        for(int m:a){
            System.out.print(m+" ");
        }
        gnomeSorting(a);
        System.out.println("Array after gnome sort");
        for(int n:a){
            System.out.print(n+" ");
        }
    }  
static void gnomeSorting(int a[]){
    int i=0;
    while(i< a.length){ 
      if((i==0) || (a[i-1] <= a[i])){
        i = i+1;
      }else{
          int temp;
          temp = a[i-1];
          a[i-1] = a[i];
          a[i] = temp;
          i=i-1;
         }
      
    }
}
}
