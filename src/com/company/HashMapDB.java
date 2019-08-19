package com.company;

import java.util.HashMap;
import java.util.Map;

public class HashMapDB implements DBInterfaces {

    HashMap<Integer, Employee> m1 = new HashMap<>();
    HashMap<Integer, Salary> m2 = new HashMap<>();

    HashMap<Employee, Salary> m3 = new HashMap<>();
    Map<Integer, HashMap<Employee, Salary>> m4 = new HashMap<>();

    public void hashMapOfHM(int x){

        m4.put(x,m3);
    }

    public void getObject(int x) {

        //this would get particular object in the Maps according to Employee ID passed in
        //I wanted to show I understand interfaces,and they could be useful in this app
        //I could use same method for all three data structures and define them differently

    }
}
