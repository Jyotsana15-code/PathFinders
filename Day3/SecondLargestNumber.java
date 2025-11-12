package PathFinders.Day3;

public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        System.out.println("Second largest element = " + secondLargest);
    }
}
