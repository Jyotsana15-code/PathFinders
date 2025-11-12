package PathFinders.Day1;

public class SumOfNaturalNumbers {
    public static void main(String[] args){
        int N = 5;
        int num = 0;
        for(int i = 1; i<=N; i++){
            num+= i;
        }
        System.out.println("Sum of the natural number is: " +num);
    }
}
