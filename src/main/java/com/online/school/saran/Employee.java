package com.online.school.saran;



public class Employee {

    // static over view, use
    // String is data type

    public String name;
    public String id;

    // comman for all employee
    public String dept="Engineering";


    // ctor ?
    public Employee() {
    }

    // this reference to current object
    public Employee(String name, String id) {
        this.name = name;
        this.id = id;
    }

    // inside static fun/method we can't access non static fields

    public static void method1(){
       // dept="dfsdfd";
        // compilation error
        //name="dfdfdsfsd";

    }

}
