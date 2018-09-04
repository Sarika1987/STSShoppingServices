


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tpz9tam
 */
public class MergeSort {
 public static void main (String args[]){   
        
        int a[] = {60,3,2,56,320,56,78,5};
        int c[] = new int[a.length];
        System.out.println("Array before Bubble sort");
        for(int m:a){
            System.out.print(m+" ");
        }
        c=mergeSorting(a);
        System.out.println("Array after Bubble sort");
        for(int n:c){
            System.out.print(n+" ");
        }
    }  
static int[] mergeSorting(int a[]){
    
    int l = a.length;
    int m = l/2;
        int c[] = new int[l]; 
        if (l==1){
            return a;
        }
        int a1[] = new int[m];
        int a2[] = new int[m];
        //System.out.print(l+" ");
        for(int i=0,j=0;i<l/2;i++){            
              a1[j] = a[i]; 
              j++;
        }
        for(int i=l/2,j=0;i<l;i++){
                a2[j] = a[i];  
                j++;
        }
        /*for(int n:a1){
            System.out.print(n+" ");
        }
        for(int n:a2){
            System.out.print(n+" ");
        }*/
        
        if (a1.length > 1){
         a1 = mergeSorting(a1);
        }
        if (a2.length > 1){
         a2 = mergeSorting(a2);
        }
        return merge(a1,a2);
}
static int[] merge(int a1[],int a2[]){
    int i=0,j=0,k=0;
    int c[] = new int[a1.length+a2.length];
    while (i<a1.length && j<a2.length){
        if (a1[i] > a2[j]){
           c[k] = a2[j];
           j++;
        }
        else
        {
           c[k] = a1[i];
           i++;
        }
        k++;
    }
    while (i<a1.length){
       c[k] = a1[i];
       i++;
       k++;
    }
    while (j<a2.length){
       c[k] = a2[j];
       j++;
       k++;
    }
    return c;
}
}

