package PathFinders.Day7;

public class PyramidPattern {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            for (int st = 1; st <= (2 * i - 1); st++) {
                System.out.print("*");
            }

                System.out.println();
        }
    }
}


