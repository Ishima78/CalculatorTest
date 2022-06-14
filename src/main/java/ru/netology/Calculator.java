package ru.netology;

public class Calculator {

    public int plus (int a , int b ){
        return a+b ;
    }

    public int minus (int a , int b ){
        return a-b;
    }

    public int multiplication ( int a , int b ){
        return  a*b;
    }
    public int division (int a ,int b ){
            return b==0 ? Integer.valueOf("Наноль не делят "): a/b;
    }


}
