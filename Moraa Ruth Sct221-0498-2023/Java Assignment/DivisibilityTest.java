import java.util.Scanner;

public class DivisibilityTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user to enter an integer
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
        // Checking divisibility for digits 1-9 (skipping 0 since division by 0 is undefined)
        System.out.println("Checking divisibility for digits 1-9:");
        
        for (int i = 1; i <= 9; i++) {
            if (number % i == 0) {
                String reason = getDivisibilityReason(number, i);
                System.out.println("The number " + number + " is divisible by " + i + reason);
            }
        }
    }

    // Helper method to generate a reason why the number is divisible
    private static String getDivisibilityReason(int number, int divisor) {
        switch (divisor) {
            case 2:
                return " because it is even.";
            case 3:
                return " because the sum of its digits is divisible by 3.";
            case 4:
                return number % 100 % 4 == 0 ? " because the last two digits form a number divisible by 4." : ".";
            case 5:
                return number % 10 == 0 || number % 10 == 5 ? " because it ends in 5 or 0." : ".";
            case 6:
                return number % 2 == 0 && number % 3 == 0 ? " because it is divisible by both 2 and 3." : ".";
            case 7:
                return " because the difference between twice the last digit and the rest of the digits is divisible by 7.";
            case 8:
                return number % 1000 % 8 == 0 ? " because the last three digits form a number divisible by 8." : ".";
            case 9:
                return " because the sum of its digits is divisible by 9.";
            default:
                return ".";
        }
    }
}
