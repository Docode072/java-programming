package QuizApp;
public class Question {
    // Placeholder for Question properties and methods      
    private final String questionText;
    private final String[] options;
    private int correctAnswerIndex;

    public Question(String questionText, String[] options, int correctAnswerIndex) {
        this.questionText = questionText;
        this.options = options;
        this.correctAnswerIndex = correctAnswerIndex;
    }

    public Question(String[] options, String questionText) {
        this.options = options;
        this.questionText = questionText;
    }
    public String getQuestionText() {
        return questionText;
    }

    public String[] getOptions() {
        return options;
    }
    public int getCorrectAnswerIndex() {
        return correctAnswerIndex;
    }
    public boolean isCorrect(int answerIndex) {
        return answerIndex == correctAnswerIndex;
    }
    
}
