import java.util.Scanner;

public class SimpleJavaProject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for input and processing
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        
        System.out.println("Hello, " + name + "! How are you today?");
        
        int age;
        do {
            System.out.print("Enter your age: ");
            age = Integer.parseInt(scanner.nextLine());
            
            if (age < 18) {
                System.out.println("Sorry, you're too young to play this game.");
            } else {
                break; // If user is old enough, continue playing
            }
        } while (true);
        
        int score;
        do {
            System.out.print("Enter your current score: ");
            score = Integer.parseInt(scanner.nextLine());
            
            if (score < 0 || score > 100) {
                System.out.println("Invalid score. Try again.");
            } else {
                break; // If user is old enough, continue playing
            }
        } while (true);
        
        int result = calculateScore(age, score);
        System.out.println("You got a score of " + result + ". Good job!");
    }

    private static int calculateScore(int age, int score) {
        if (age >= 18 && score <= 100) {
            return age * 2;
        } else if (score > 95) {
            return 100;
        } else {
            return Math.max(age - 20, score - 80);
        }
    }
}
