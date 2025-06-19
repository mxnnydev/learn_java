import java.util.Scanner;
public class ChangeName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Display greeting with the user's name
        System.out.println("Hello, " + name + "!");


        System.out.print("Change your name: ");
        String newName = scanner.nextLine();
        
        // Display greeting with the user's new name
        System.out.println("Hello, " + newName + "!");


        // Close the scanner
        scanner.close();
    }
    
}
