package com.lenovo.innerClass;

public class Outer {
    static class  Inner{
         static int i = 5;
         void print(){
            System.out.println(" Inner print !");
        }
    }
    public  Inner getInner(){
        return new Inner();
    }
    public void print(){
        Inner inner = new Inner();
        inner.print();
        System.out.println("Outer print !"+Inner.i);
    }
    public static void main(String[] s){
        Outer outer  = new Outer();
        //Inner inner = outer.getInner();
        //Outer.Inner i = outer.new Inner();
        Inner inner = new Inner();
        outer.print();
    }
}
