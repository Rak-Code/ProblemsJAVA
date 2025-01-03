import java.util.Scanner;

public class GcdOfTwoNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();

       for (int i = 0; i <= num1; i++) {
           if (i % num1 == 0 && i % num2 == 0) {
            System.out.println("The GCD of " + num1 + " and " + num2 + " is " + i); 
           }
       }


        

        
                
        
                
        
        
        
            } 
}
