package PathFinders.Day11;

public class AlphabetPyramidPattern {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++)
                System.out.print(" ");
            char ch = 'A';
            for (int j = 1; j <= i; j++)
                System.out.print(ch++);
            ch -= 2;
            for (int j = 1; j < i; j++)
                System.out.print(ch--);
            System.out.println();
        }
    }
}

