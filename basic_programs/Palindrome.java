import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        String reversed = new StringBuilder(str).reverse().toString();
        if (str.equals(reversed))
            System.out.println("Palindrome");
        else
            System.out.println("Not a palindrome");
    }
}
