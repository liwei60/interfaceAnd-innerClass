package com.lenovo.adpter;

public class FilterAdpter implements Processor {
    Filter filter;
    public FilterAdpter(Filter filter){
        this.filter = filter;
    }
    @Override
    public String name() {
        return filter.name();
    }

    @Override
    public Object process(Object input) {
        return input;
    }
}
