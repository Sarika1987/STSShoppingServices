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
public class Palindrome {
    public static void main(String args[]){
        
        boolean isPalindrome = false;
        while(!isPalindrome) {
        String original, reverse = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a String/Number to check whether it is a Palindrome");
        original = in.nextLine();
        int length = original.length();
        for (int i=length-1;i>=0;i--)
            reverse = reverse+original.charAt(i);
        
        if(original.equals(reverse)){
            System.out.println("The entered string is a palindrome" );
            isPalindrome = true;
        }
        else
            System.out.println("The entered string is not a palindrome");
        }
                
    }
}
