package com.lenovo.adpter;

public class LowPass extends Filter {
    @Override
    public String name() {
        return getClass().getSimpleName();
    }

    @Override
    public Object process(Object input) {
        return input;
    }
}
