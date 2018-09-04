/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tpz9tam
 */
                class BaseClass {
                    BaseClass dosomething(){
                        System.out.println("Print BaseClass");
                        return this;
                    }

                }

                class AnotherBaseClass extends BaseClass {
                    @Override
                    BaseClass dosomething(){
                        System.out.println("Print AnotherBaseClass");
                        return this;
                    }
                }



                class SubClass extends AnotherBaseClass {
                    @Override
                    SubClass dosomething(){            /*Here SubClass is co-vairant return type*/
                        System.out.println("Print SubClass");
                        return this;
                    }
                    public static void main(String args[]){
                      SubClass s1 = new SubClass();
                      s1.dosomething();
                    }
                }

