/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tpz9tam
 */
class SuperClass{
    int i=10;
    SuperClass(int i){
        System.out.println("Print super class variable" + i);
    }
}
public class SuperClassTesting extends SuperClass {
    SuperClassTesting(){
         super(11);      
    }   

    public static void main(String args[]){
    SuperClassTesting s = new SuperClassTesting();
    }
}
