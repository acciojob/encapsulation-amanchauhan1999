package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();
        //  obj.name = "Aman";
        //System.out.println(obj.name);

        obj.setName("Aman");
        String ans = obj.getName();
        System.out.println(ans);
    }
}