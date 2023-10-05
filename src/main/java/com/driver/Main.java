package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly rwOnly = new RWOnly();
//        rwOnly.name = "Aman";
//
//        System.out.println(rwOnly.name()
//  java: name has private access in com.driver.RWOnly error is shown
//  here name is a private string due to which you canot set name without getter and setter
//  so we use here a setter that i make in RWOnly class

        rwOnly.setName("Aman");

//  now it set the name of RWOnly class now we can get its name by getter method that i created in RWOnly class

        System.out.println(rwOnly.getName());


    }
  
}