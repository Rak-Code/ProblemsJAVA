public class ArmStrongNumber {
    public static void main(String[] args) {
        int num = 153;
        int sum = 0;
        int originalNum = num;
        while (num != 0) {
            int remainder = num % 10;
            sum = sum + (remainder * remainder * remainder);
            num = num / 10;
    }

    if (sum == originalNum) {
        System.out.println(originalNum + " is an Armstrong number");       
    }
    else {
        System.out.println(originalNum + " is not an Armstrong number");
    }

}
}
