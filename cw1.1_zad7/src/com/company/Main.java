package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;
        System.out.println("Podaj liczbę nieparzystą i równą lub większą niż 5");
        N = scanner.nextInt();
        if (N < 5 || N % 2 == 0) {
            while (N < 5 || N % 2 == 0) {
                System.out.println("Podaj liczbę, która jest nieparzysta i równa lub większą niż 5");
                N = scanner.nextInt();
            }
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (i == 1 || j == 1 || i == N || j == N || i == j) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}

