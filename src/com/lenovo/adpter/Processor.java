package com.lenovo.adpter;

public interface Processor {
    String SUCCESS="success";
    String name();
    Object process(Object input);
}
