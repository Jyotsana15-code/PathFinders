package PathFinders.Day9;

import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter max width of diamond (odd number): ");
        int n = sc.nextInt();
        if (n % 2 == 0) n--;
        int mid = n / 2;
        for (int i = 0; i < n; i++) {
            int spaces = Math.abs(mid - i);
            int stars = n - 2 * spaces;
            System.out.println(" ".repeat(spaces) + "*".repeat(stars));
        }
        sc.close();
    }
}


