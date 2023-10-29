package org.gmail.ollga.task3;

import java.util.Random;

public class Array {
    public static void main(String[] args) {

        int[] array = new int[10];
        Random random = new Random();
        System.out.println(" Random array: ");

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
        }
        for (int a : array) {
            if (a % 3 == 0) System.out.println(a);
        }
    }
}




