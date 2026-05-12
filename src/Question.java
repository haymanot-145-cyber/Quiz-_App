public class Question {
    String questionText;
    String[] choices;
    int Answer;

    // Constructor
    public Question(String questionText, String[] choices, int Answer) {

        this.questionText = questionText;
          this.choices = choices;
            this.Answer = Answer;
    }

    // This method will show the question.
    public void show_question ()  {

        System.out.println(questionText);

          for (int i = 0; i < choices.length; i++) {

               System.out.println((i + 1) + ". " + choices[i]);
                }
    }

    // This method checks if the answer is correct.
    public boolean isCorrect(int userAnswer) {

        return userAnswer == Answer;
    }
}

