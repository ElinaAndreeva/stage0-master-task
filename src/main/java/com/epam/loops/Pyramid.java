package com.epam.loops;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        for (int i = 0 ; i < cathetusLength; i++){
            for (int j = cathetusLength; j > 0; j--){
                if (cathetusLength - j  < cathetusLength - i - 1){
                    System.out.print(" ");
                    continue;
                }
                System.out.print(j);
            }

            for (int j = 2; j <= cathetusLength; j++){
                if (j > i + 1){
                    break;
                }
                System.out.print(j);
            }

            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
