package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

// user input simplistic character removal
        
// declare
        String b;
        String c;

// create a scanner
        Scanner in = new Scanner(System.in);

// user input original characters
        System.out.println("Please input some characters");

// assign to "b" and iterate
        b = in.nextLine();

// user input character to remove
        System.out.println("Please input the character that you want to remove");

//assign to "c" and iterate
        c = in.nextLine();

// remove the desired character
        b = b.replace(c, "");

// print final output
        System.out.println(b);


// simplistic fixed input character replacement
        String a = "food 2";
        a = a.replace(" 2", "");
        System.out.println(a);

    }
}
