public class Question {
    private String questionText;
    private String[] choices;
    private int answer;
    
    public Question(String questionText, String[] choices, int answer) {
        this.questionText = questionText;
        this.choices = choices;
        this.answer = answer;
    }
    
    public void display_question() {
        System.out.println("\n" + questionText);
        for (int i = 0; i < choices.length; i++) {
            System.out.println((i + 1) + ". " + choices[i]);
        }
    }
    
    public boolean isCorrect(int userAnswer) {
        return userAnswer == answer;
    }
    
    // Add this getter
    public String[] getChoices() {
        return choices;
    }
    
    public int getAnswer() {
        return answer;
    }
}
