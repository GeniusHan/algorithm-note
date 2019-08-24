package com.company;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double[] a = {3.0, 4.0};
        Vector vector = new Vector(a);
        a[0]=0.0;

        System.out.println(vector.toString());

        Stack<String> stack = new Stack<>();
    }
}
