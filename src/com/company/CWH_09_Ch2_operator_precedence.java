package com.company;

public class CWH_09_Ch2_operator_precedence {
    public static void main(String[] args) {
        //Precedence & Associativity
        /*int a = 6*5-34/2;
            *//*
            Highest precedence goes to * and /. They are then evaluated on the basis of lest to right associativity
            =30-34/2
            =30-17
            =13  *//*

        int b = 60/5-34*2;
          *//*
            =12-34*2
            =12-68
            =-56    *//*

        System.out.println(a);
        System.out.println(b);*/
        //Quick Quiz
        // 1--->    x-y/2

        /*int x = 6;
        int y = 1;
        int k = x * y/2;
        System.out.println(k);*/

        //1--->  b2-4ac/2a

        int a = 2;
        int b = 3;
        int c = 5;
        int k = b*b - (4*a*c)/(2*a);
        System.out.println(k);


    }
}
