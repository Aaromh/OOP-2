public class FibonacciSum {

    public static void main(String[] args) {
        int limit = 4000000;
        int sum = sumFibonacci(limit);
        System.out.println("Sum of even-valued terms: " + sum);
    }

    int firstTerm = 1;           
    int secondTerm = 2;          
    int evenSum = 0;             

    while (secondTerm <= limit) {
    // Check if the current term in the sequence is even
    if (secondTerm % 2 == 0) {
        evenSum += secondTerm; // Add even Fibonacci term to the sum
    }

    // Calculate the next term in the Fibonacci sequence
    int nextFibonacciTerm = firstTerm + secondTerm; 
    
    // Move to the next two terms in the sequence
    firstTerm = secondTerm;
    secondTerm = nextFibonacciTerm;
}

        
        return sum;
    }
}
