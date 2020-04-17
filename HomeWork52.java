package com.itacademy.lesson5;

public class HomeWork52 {

    public static void main(String[] args) {
        int[] values = {5, 5, 5, 5, 5, 5, 5, 5, 6};

        printArray(values);
        System.out.println();
        printShiftedArray(values);

    }

    public static void printArray(int[] values) {
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");

        }
    }

    public static void printShiftedArray(int[] values) {

        for (int i = 0; i < values.length; i++) {
            for (int j = i + 1; j < (values.length); j++) {
                if (values[i] == values[j]) {
                    values[i] = 0;

                }

            }

            System.out.print(values[i] + " ");

        }

    }

}
