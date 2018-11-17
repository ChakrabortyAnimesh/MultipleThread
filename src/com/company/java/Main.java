package com.company.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        new NewThread("one");
        new NewThread("Two");
        new NewThread("Three");

        try {
                Thread.sleep(1000);
            }

        catch(InterruptedException e) {
            System.out.println("Main Thread interrupted");
        }
        System.out.println("Main thread exiting");

    }
}
