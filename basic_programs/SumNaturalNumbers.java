import java.util.Scanner;

public class SumNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt(), sum = 0;
        for (int i = 1; i <= n; i++) sum += i;
        System.out.println("Sum: " + sum);
    }
}
