import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("===============================");
        System.out.println("     WELCOME TO QUIZ APP       ");
        System.out.println("===============================");
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        User player = new User(name);
        
        System.out.println("\nHello " + player.getUsername() + "!");
        System.out.println("Get ready for the quiz!\n");
        
        Quiz quiz = new Quiz();
        int finalScore = quiz.startQuiz();  // Gets the returned score
        
        player.addScore(finalScore);
        player.showStats();
        
        scanner.close();
    }
}
