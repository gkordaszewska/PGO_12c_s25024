package com.company;
import java.util.Arrays;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        int[] arr = new int[10];
        System.out.print("Generated array: [");
        {
            Random r = new Random();
            for (int i = 0; i < 10; i++) {
                arr[i] = r.nextInt(901) + 100;
                if (i < 9) {
                    System.out.print(arr[i] + ", ");
                } else if (i == 9) {
                    System.out.print(arr[i] + "]");
                }
            }
            System.out.println();
            System.out.print("Sorted array: [");
            Arrays.sort(arr);
            for (int i = 0; i < 10; i++) {
                if (i < 9) {
                    System.out.print(arr[i] + ", ");
                } else if (i == 9) {
                    System.out.print(arr[i] + "]");
                }
            }
        }
    }
}
