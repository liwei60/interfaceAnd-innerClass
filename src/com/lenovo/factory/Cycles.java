package com.lenovo.factory;

public class Cycles {

    public static void RunCycle(CycleFactory cycleFactory){
        Cycle cycle = cycleFactory.getCycle();
        System.out.println("Cycle :"+cycle.getClass().getSimpleName());
    }
    public static void main(String[] s){
        RunCycle(new UnicycleFactory());
        RunCycle(new BicycleFactory());
    }
}
