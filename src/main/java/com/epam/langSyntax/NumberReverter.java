package com.epam.langSyntax;

public class NumberReverter {
    public void revert(int number) {
        int num1 = number / 100;
        int num2 = (number % 100) / 10;
        int num3 = number % 10;
        int reverse = num3* 100 + num2*10 + num1;
        System.out.println(reverse);
    }
}