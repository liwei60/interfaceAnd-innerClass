package com.lenovo.adpter;



public class Apply {
    public static void process(Processor p ,Object s){
        System.out.println("Using Processor :"+p.name());
        System.out.println(p.process(s));
    }
    public static void main(String[] args){
        Apply.process(new FilterAdpter(new LowPass()),"lowPass");
        Apply.process(new FilterAdpter(new HighPass()),"highPass");
    }
}
