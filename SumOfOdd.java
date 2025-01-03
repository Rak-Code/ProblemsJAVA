import java.util.Scanner;

public class SumOfOdd {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.println("Odd number is "+i);
                sum += i;
        }
    }
    System.out.println("Sum of odd number is "+sum);
} 
}
