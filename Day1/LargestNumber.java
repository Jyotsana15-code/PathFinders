package PathFinders.Day1;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args){
        Scanner numbers = new Scanner(System.in);
        System.out.print("First Number: ");
        int num1 = numbers.nextInt();
        System.out.print("Second Number: ");
        int num2 = numbers.nextInt();
        if(num1 > num2){
            System.out.println("Largest number  is : " +num1);
        }
        else{
            System.out.println("Largest number is : " +num2);
        }
        numbers.close();
    }
}
