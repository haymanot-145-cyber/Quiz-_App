public class Question {
    String questionText;
    String[] choices;
    int answer;

    // Constructor
    public Question(String questionText, String[] choices, int answer) {

        this.questionText = questionText;
          this.choices = choices;
            this.answer = answer;
    }

    // This method will show the question.
    public void display_question ()  {

        System.out.println(questionText);

        for (int i = 0; i < choices.length; i++) {

               System.out.println((i + 1) + ". " + choices[i]);
                }
    }

    // This method checks if the answer is correct.
    public boolean isCorrect(int userAnswer) {

        return userAnswer == answer;
    }
}

