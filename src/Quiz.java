import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.io.File;

public class Quiz {

    private ArrayList<Question> questions = new ArrayList<>();
        private int score = 0;
      private int questionCount = 0;

      private Random random = new Random();
               private Scanner input = new Scanner(System.in);

    // This loads the questions from file .
    public void loadfile() {

        try {
            Scanner fileScanner = new Scanner(new File("questions.txt"));

            while (fileScanner.hasNextLine()) {

                String questionText = fileScanner.nextLine();

                String[] choices = new String[4];
                for (int i = 0; i < 4; i++) {
                    if (fileScanner.hasNextLine()) {
                        choices[i] = fileScanner.nextLine();
                    }
                }

                if (!fileScanner.hasNextLine()) break;
                int answer = Integer.parseInt(fileScanner.nextLine());

                Question q = new Question(questionText, choices, answer);
                questions.add(q);
            }

            fileScanner.close();

        } catch (Exception e) {
            System.out.println("Error loading file: " + e.getMessage());
        }
    }

    // This starts the quiz
    public void startQuiz() {

        loadfile();

        score = 0;
        questionCount = 0;

        while (questionCount < 10 && !questions.isEmpty()) {

            int index = random.nextInt(questions.size());
            Question q = questions.get(index);

            //we use this method to  display the question.
            q.display_question();

            // get user answer
            System.out.print("Your answer: ");
            int userAnswer = input.nextInt();

            // check answer
            if (q.isCorrect(userAnswer)) {
                score++;
                System.out.println("Correct!");
            } else {
                System.out.println("Wrong!");
            }

            // remove question (no repeat)
            questions.remove(index);

            questionCount++;
        }

        System.out.println("\nQuiz Finished!");
        System.out.println("Score: " + score + "/10");
    }
}