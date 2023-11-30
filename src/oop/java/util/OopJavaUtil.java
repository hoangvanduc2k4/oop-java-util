package oop.java.util;

import java.util.Scanner;

public class OopJavaUtil {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        long result = OopJava.getFactorial(a);
        System.err.println(a+"! = " + result);
    }

}
