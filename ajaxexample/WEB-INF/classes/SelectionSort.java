/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tpz9tam
 */
import java.util.*;
public class SelectionSort {
    
    public static void main(String args[]){
        int arr[] = {60,3,2,56,320,56,78,5,6,4546,234,45,35,67,65,67},s;
//        int arr[] = new int[50] , s;
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter number of elements(not more than 50)");
        s = arr.length;
//        System.out.println("Enter elements one by one");
//        for (int i=0;i<s;i++){
//            arr[i] = in.nextInt();
//        }
        
        System.out.println("Array before select sort");
        
        for (int k=0;k<s;k++){
            System.out.print(arr[k]+" ");
        }
        
        selectSort(arr,s);
        
        System.out.println("Array after select sort");
        
        for (int k=0;k<s;k++){
            System.out.print(arr[k]+" ");
        }
        
    }
    
    static void selectSort(int arr[],int s){
        for (int i=0;i<s;i++){
            int index = i,smallnum=0;
            for (int j=i+1;j<s;j++){
                if (arr[j]<arr[index]){
                  smallnum = arr[j];
                  index = j;
                }            
            }
            int temp = arr[i];
            arr[i] = smallnum;
            arr[index] = temp;
        }
    }
    
}
