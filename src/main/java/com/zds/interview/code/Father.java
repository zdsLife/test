package com.zds.interview.code;

public class Father {


    public Father() {
        System.out.println("father  wu can gou zhao");
    }

    private String name;

    {
        System.out.println("father");
    }
    static {
        System.out.println("father static");
    }





    public Father(String name) {
        this.name = name;
    }

}
