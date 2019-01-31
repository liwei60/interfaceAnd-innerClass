package com.lenovo.innerClass;

public class TestComputer {

    public Computer test(boolean b){
        if(b) {
            class HPComputer implements Computer {
                @Override
                public void print() {
                    System.out.print("this is HPComputer ！");
                }
            }
            return new HPComputer();
        }
       return  null;
    }
    private class LenovoComputer implements Computer{

        @Override
        public void print() {
            System.out.print("this is LenovoComputer !");
        }

    }

    public static void main(String[] s){
       // TestComputer testComputer = new TestComputer();
        //testComputer.test().print();

    }
}
