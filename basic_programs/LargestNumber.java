
public class LargestNumber {
    public static void main(String[] args) {
        int a = 10, b = 25, c = 15;
        int largest = (a > b && a > c) ? a : (b > c ? b : c);
        System.out.println("Largest number is: " + largest);
    }
}
