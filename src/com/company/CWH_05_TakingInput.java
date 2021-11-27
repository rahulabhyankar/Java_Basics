package com.company;
import java.util.Scanner;

public class CWH_05_TakingInput {
    public static void main(String[] args) {
        System.out.println("Taking Input from the user ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int a = sc.nextInt();
        System.out.println("Enter number 2");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("The sum of these number is ");
        System.out.println(sum);

        // float
        System.out.println("Enter number 1");
        float c = sc.nextFloat();
        System.out.println("Enter number 2");
        float d = sc.nextFloat();
        float sum1 = c + d;
        System.out.println(sum1);

        //checking the input is number or not
        System.out.println("Enter number");
        boolean e = sc.hasNextInt();
        System.out.println(e);

        //String input

        System.out.println("Enter string");
        String str = sc.next();
        System.out.println(str);
    }
}
