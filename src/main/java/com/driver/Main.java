package com.driver;

public class Main {
    public static void main(String[] args) {
<<<<<<< HEAD
        RWOnly obj = new RWOnly();
        //  obj.name = "Aman";
        //System.out.println(obj.name);

        obj.setName("Aman");
        String ans = obj.getName();
        System.out.println(ans);
    }
=======
<<<<<<< HEAD
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


=======
        RWOnly rwOnly = new RWOnly("Aman");

        System.out.println(rwOnly.getName());

        rwOnly.setName("Himanshu");
        System.out.println(rwOnly.getName());
>>>>>>> 8dba0ef6fc43aef05786dee159944cc5f960f4bd
    }
  
>>>>>>> 755352647b2afaa27ce3d5993e28dd045d8568d3
}