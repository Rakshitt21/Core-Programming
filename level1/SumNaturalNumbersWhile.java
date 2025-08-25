import java.util.Scanner;

public class SumNaturalNumbersWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = input.nextInt();
        
        if (n < 1) {
            System.out.println("Number is not natural.");
        } else {
            // Formula sum
            int sumFormula = n * (n + 1) / 2;
            
            // While loop sum
            int sumWhile = 0;
            int i = 1;
            while (i <= n) {
                sumWhile += i;
                i++;
            }
            
            System.out.println("Sum using formula: " + sumFormula);
            System.out.println("Sum using while loop: " + sumWhile);
            
            if (sumFormula == sumWhile) {
                System.out.println("Both results are equal.");
            } else {
                System.out.println("Results differ.");
            }
        }
        
        input.close();
    }
}
