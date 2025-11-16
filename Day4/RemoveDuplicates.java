package PathFinders.Day4;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        int[] temp = new int[arr.length];
        int uniqueCount = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < uniqueCount; j++) {
                if (arr[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                temp[uniqueCount] = arr[i];
                uniqueCount++;
            }
        }
        System.out.print("Unique Elements: [");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(temp[i]);
            if (i < uniqueCount - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}

