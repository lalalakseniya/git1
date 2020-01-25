package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	System.out.println("Hello world!");
        Scanner in = new Scanner(System.in);
        System.out.println("Input number");
        int number = in.nextInt();
        int number1=number%10;
        System.out.println("last numb "+number1);
        int square=number1*number1;
        int square1= square %10;
        System.out.println("last numb of square "+square1);
        in.close();
    }
}
