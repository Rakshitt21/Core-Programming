import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0.0;
        double value;
        
        System.out.print("Enter a number (0 to stop): ");
        value = input.nextDouble();
        
        while (value != 0) {
            total += value;
            System.out.print("Enter a number (0 to stop): ");
            value = input.nextDouble();
        }
        
        System.out.println("Total sum is " + total);
        
        input.close();
    }
}
