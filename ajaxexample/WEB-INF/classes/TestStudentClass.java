/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tpz9tam
 */
class StudentClass {
    int id;
    String name;
    static String college="IIT";
    StudentClass(){
        StudentClass.change();
    }        
    static void change(){
        college="JNTU";
    }
//    int methodov(int a,int b){
//        return a+b;
//    }
    double methodov(double a,int b){
        return a+b;
    }
}


public class TestStudentClass{
   public static void main(String args[]){
   StudentClass s1=new StudentClass();
   System.out.println(s1.methodov(3,4));
   System.out.println(s1.methodov(6.5,7));
   System.out.println(s1.id + " " + s1.name + " " + StudentClass.college);
   TestStudentClass.main();
}
   public static void main(){
       System.out.println("This is called from different main method");
   }
}
