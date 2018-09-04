/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tpz9tam
 */
public class InsertionSort {
    
    public static void main(String args[]){
        int arr[] = {43,6,9,460,4,2,3};
        System.out.println("array before sorting");
        for (int k:arr){
            System.out.print(k + " ");
        }
        insertSort(arr);
        System.out.println("array after sorting");
        for (int k:arr){
            System.out.print(k + " ");
        }
    }
   
   static void insertSort(int arr[]){
       for (int i=1;i<arr.length;i++){
           int key = arr[i];
           int j = i-1;
           while((j>=0) && (arr[j] > key) ){               
               arr[j+1] = arr[j];
               j = j-1;
           }
           arr[j+1] = key;
        }          
    }
}