import java.util.Scanner;

public class PalindromeAndReversedNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        int reversedNumber = 0;
        int originalNumber = n;

        while (n != 0) {
            int digit = n % 10;
            reversedNumber = reversedNumber * 10 + digit;
            n /= 10;
        }

        System.out.println("Reversed Number is " + reversedNumber);

        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is a palindrome.");

        }
        else{
            System.out.println(originalNumber + " is not a palindrome.");
        }


    }
}