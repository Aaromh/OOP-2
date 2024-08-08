import java.util.Scanner;

public class AvgMarks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] marks = new int[5];
        
        // Input marks
        System.out.println("Enter the marks for five units:");
        for (int i = 0; i < 5; i++) {
            marks[i] = scanner.nextInt();
        }
        
        // Calculate the average
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        double average = (double) sum / marks.length;
        
        System.out.printf("The average marks are: %.2f%n", average);
    }
}
