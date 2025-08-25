import java.util.Scanner;

public class FactorialFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = input.nextInt();
        
        if (n < 1) {
            System.out.println("Number is not a natural number.");
        } else {
            long factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            System.out.println("The factorial of " + n + " is " + factorial);
        }
        
        input.close();
    }
}
