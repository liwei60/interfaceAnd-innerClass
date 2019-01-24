package com.lenovo.adpter;

public class HighPass extends Filter {
    @Override
    public String name() {
        return getClass().getSimpleName();
    }

    @Override
    public Object process(Object input) {
        return input;
    }
}
