package com.epam.conditions;

public class DaysInMonth {
    public void printDays(int year, int month) {
        if (month>=1 && month <=12 && year >0) {
            boolean isLeapYearBool = year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
            int leap;
            if (isLeapYearBool) {
                leap = 1;
            } else {
                leap = 0;
            }
            if (leap == 1) {
                switch (month) {
                    case 1, 3, 5, 7, 8, 10, 12:
                        System.out.println(31);
                        break;
                    case 2:
                        System.out.println(29);
                        break;
                    case 4, 6, 9, 11:
                        System.out.println(30);
                        break;
                    default:
                        System.out.println("wrong number!");
                } } else {
                switch (month) {
                    case 1, 3, 5, 7, 8, 10, 12:
                        System.out.println(31);
                        break;
                    case 2:
                        System.out.println(28);
                        break;
                    case 4, 6, 9, 11:
                        System.out.println(30);
                        break;
                    default:
                        System.out.println("wrong number!");
                } }
        } else {
            System.out.println("invalid date");
        }
    }
}
