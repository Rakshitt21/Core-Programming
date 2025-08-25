import java.util.Scanner;

public class SumNaturalNumbersFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = input.nextInt();
        
        if (n < 1) {
            System.out.println("Number is not natural.");
        } else {
            int sumFormula = n * (n + 1) / 2;
            int sumFor = 0;
            
            for (int i = 1; i <= n; i++) {
                sumFor += i;
            }
            
            System.out.println("Sum using formula: " + sumFormula);
            System.out.println("Sum using for loop: " + sumFor);
            
            if (sumFormula == sumFor) {
                System.out.println("Both results are equal.");
            } else {
                System.out.println("Results differ.");
            }
        }
        
        input.close();
    }
}
