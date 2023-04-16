package com.epam.conditions;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        int result = divider / divider;
        if (result == 0) {
            System.out.println("division by zero");
        } else if (result * divider != dividend) {
            System.out.println("cannot be divided completely");
        } else if (result * divider == dividend){
            System.out.println("can be divided completely");
        }
    }
}
