package com.tnsif.packagetest;

import com.tnsif.AccessModifiersDemo.AccessModifiersDemo;

public class MainPackage extends AccessModifiersDemo {
    public void display() {
        //System.out.println(protectedVar); // OK, because MainPackage is subclass
        System.out.println(publicVar);    // OK
        // defaultVar -> ERROR
        // privateVar -> ERROR
    }
}

