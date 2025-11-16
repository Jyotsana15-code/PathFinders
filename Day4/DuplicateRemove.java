package PathFinders.Day4;

import java.util.*;

public class DuplicateRemove {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        int n = arr.length;
        int[] result = new int[n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            boolean duplicate = false;
            for (int j = 0; j < index; j++) {
                if (arr[i] == result[j]) {
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate) {
                result[index++] = arr[i];
            }
        }
        System.out.print("Array without duplicates: ");
        for (int i = 0; i < index; i++) {
            System.out.print(result[i] + " ");
        }
    }
}

