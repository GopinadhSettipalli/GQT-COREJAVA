package com.gqt.corejava.patterns;
import java.util.Scanner;

public class Pattern31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the count: ");
        int n = sc.nextInt();

        // Top half
        for (int i = 1; i <= n; i++) {
            // Leading spaces (3 per level)
            for (int j = 1; j <= n - i; j++) {
                System.out.print("   ");
            }

            // First number
            System.out.print(i);

            // Inner space
            for (int j = 1; j <= 2 * i - 3; j++) {
                System.out.print(" ");
            }

            // Second number (only when i > 1, using loop trick)
            for (int j = 1; j <= (2 * i - 3); j += (2 * i - 3)) {
                System.out.print(i);
            }

            System.out.println();
        }

        // Bottom half
        for (int i = n - 1; i >= 1; i--) {
            // Leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("   ");
            }

            // First number
            System.out.print(i);

            // Inner space
            for (int j = 1; j <= 2 * i - 3; j++) {
                System.out.print(" ");
            }

            // Second number (only when i > 1)
            for (int j = 1; j <= (2 * i - 3); j += (2 * i - 3)) {
                System.out.print(i);
            }

            System.out.println();
        }
    }
}
