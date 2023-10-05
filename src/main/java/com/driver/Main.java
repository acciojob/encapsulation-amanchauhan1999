package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly rwOnly = new RWOnly("Aman");

        System.out.println(rwOnly.getName());

        rwOnly.setName("Himanshu");
        System.out.println(rwOnly.getName());
    }
  
}