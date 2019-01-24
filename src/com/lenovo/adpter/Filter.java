package com.lenovo.adpter;

public class Filter {
    public String name(){
        return getClass().getSimpleName();
    }
    public Object process(Object input){
        return input;
    }
}
