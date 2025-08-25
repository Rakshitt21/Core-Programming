import java.util.Scanner;

public class YoungestTallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter ages of Amar, Akbar, Anthony:");
        int ageAmar = sc.nextInt();
        int ageAkbar = sc.nextInt();
        int ageAnthony = sc.nextInt();
        
        System.out.println("Enter heights of Amar, Akbar, Anthony:");
        double heightAmar = sc.nextDouble();
        double heightAkbar = sc.nextDouble();
        double heightAnthony = sc.nextDouble();
        
        // Find youngest age
        int youngestAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
        String youngestFriend = (youngestAge == ageAmar) ? "Amar" : (youngestAge == ageAkbar) ? "Akbar" : "Anthony";
        
        // Find tallest height
        double tallestHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));
        String tallestFriend = (tallestHeight == heightAmar) ? "Amar" : (tallestHeight == heightAkbar) ? "Akbar" : "Anthony";
        
        System.out.println("Youngest friend is " + youngestFriend + " with age " + youngestAge);
        System.out.println("Tallest friend is " + tallestFriend + " with height " + tallestHeight);
        
        sc.close();
    }
}
