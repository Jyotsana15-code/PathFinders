package PathFinders.Day9;

import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an odd number (max width of diamond): ");
        int n = sc.nextInt();
        if (n % 2 == 0) {
            n = n - 1;
            System.out.println("Even input converted to odd: " + n);
        }
        int mid = (n / 2) + 1;
        for (int i = 1; i <= mid; i++) {
            int stars = 2 * i - 1;
            int spaces = (n - stars) / 2;
            for (int s = 0; s < spaces; s++) System.out.print(" ");
            // print stars
            for (int st = 0; st < stars; st++) System.out.print("*");
            System.out.println();
        }
        for (int i = mid - 1; i >= 1; i--) {
            int stars = 2 * i - 1;
            int spaces = (n - stars) / 2;
            for (int s = 0; s < spaces; s++) System.out.print(" ");
            for (int st = 0; st < stars; st++) System.out.print("*");
            System.out.println();
        }
        sc.close();
    }
}

