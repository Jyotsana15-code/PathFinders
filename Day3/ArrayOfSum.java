package PathFinders.Day3;

public class ArrayOfSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int sum = 0;
        for (int num : arr) {
            sum = sum + num;
        }
        System.out.println("Sum of array elements = " + sum);
    }
}

