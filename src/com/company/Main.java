package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Please, enter your employee ID number: ");
        int inputID = scn.nextInt();
        scn.nextLine();

        System.out.println("Enter your name: ");
        String inputName = scn.nextLine();

        System.out.println("Enter your email address: ");
        String inputEmail = scn.nextLine();

        System.out.println("Enter your position: ");
        String inputPosition = scn.nextLine();

        System.out.println("Enter your salary: ");
        int inputSalary = scn.nextInt();
        scn.nextLine();

        Employee e1 = new Employee(inputID, inputName, inputEmail);
        Salary s1 = new Salary(inputID, inputPosition, inputSalary);

        System.out.println("Finally, choose your database: 1 for HashMap, 2 for ArrayList, 3 for LinkedList: ");
        int inputDB = scn.nextInt();
        scn.nextLine();

        HashMapDB map1 = new HashMapDB();
        ArrayListDB array1 = new ArrayListDB();
        LinkedListDB linked1 = new LinkedListDB();

        if(inputDB == 1) {
            map1.m1.put(inputID, e1);
            map1.m2.put(inputID, s1);
        }
            else if(inputDB == 2) {
                array1.list1.add(e1);
                array1.list2.add(s1);
            }
                else {
                linked1.linked1.add(e1);
                linked1.linked2.add(s1);
                }

        System.out.println("Now enter your ID number and we will pull your information out of the database: ");
        int responseID = scn.nextInt();
        scn.nextLine();

        if(inputDB == 1) {
            System.out.println("You have entered the following information: ");
            System.out.println("Your employee ID is: " +responseID);
            System.out.println("Your name is: " +map1.m1.get(responseID).getName());
            System.out.println("Your email address is: " +map1.m1.get(responseID).getEmail());

            System.out.println("Your position is: " +map1.m2.get(responseID).getPosition());
            System.out.println("Your salary is: " +map1.m2.get(responseID).getSalary());

        }
        else if(inputDB == 2) {
            System.out.println("You have entered the following information: ");
            System.out.println("Your employee ID is: " +responseID);
            System.out.println("Your name is: " +array1.list1.get(0).getName());
            System.out.println("Your email address is: " +array1.list1.get(0).getEmail());

            System.out.println("Your position is: " +array1.list2.get(0).getPosition());
            System.out.println("Your salary is: " +array1.list2.get(0).getSalary());

        }
        else {
            System.out.println("You have entered the following information: ");
            System.out.println("Your employee ID is: " +responseID);
            System.out.println("Your name is: " +linked1.linked1.get(0).getName());
            System.out.println("Your email address is: " +linked1.linked1.get(0).getEmail());

            System.out.println("Your position is: " +linked1.linked2.get(0).getPosition());
            System.out.println("Your salary is: " +linked1.linked2.get(0).getSalary());
        }

        System.out.println("---Fun Section---");
        System.out.println("Create a datastructure of a datastructure, ie HashMap of HashMaps,");
        System.out.println("Type 1 to merge, 2 to exit");

        int inputDBmerge = scn.nextInt();
        scn.nextLine();

        if(inputDBmerge == 1) {
            map1.m3.put(e1,s1);
            map1.hashMapOfHM(inputID);
            System.out.println("Merging completed! Thanks for using my little app. Good day!");
        }
        else System.out.println("Thanks for using my little app! Have a great day!");

    }
}

