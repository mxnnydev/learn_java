import java.util.Scanner;

public class ArmstrongChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt(), original = num, result = 0;
        while (num != 0) {
            int digit = num % 10;
            result += Math.pow(digit, 3);
            num /= 10;
        }
        System.out.println((original == result) ? "Armstrong Number" : "Not an Armstrong Number");
    }
}
