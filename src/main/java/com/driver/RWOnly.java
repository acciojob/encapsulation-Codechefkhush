package com.driver;

public class RWOnly {
       public static void main(String[] args) {
        RWOnly obj = new RWOnly();

        //obj.name = "Kunal";
        obj.setName("Kunal");
        obj.getName();
    }
}
