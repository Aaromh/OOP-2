import java.util.Scanner;

public class UserInformation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input surname and age
        System.out.print("Enter your surname: ");
        String surname = scanner.nextLine();
        
        System.out.print("Enter your current age: ");
        int age = scanner.nextInt();
        
        // Calculate the number of characters in the surname
        int numOfChars = surname.length();
        System.out.println("The number of characters is " + numOfChars);
        
        // Determine if the age is even or odd
        if (age % 2 == 0) {
            System.out.println("Your current age is an even number");
        } else {
            System.out.println("Your current age is an odd number");
        }
    }
}
