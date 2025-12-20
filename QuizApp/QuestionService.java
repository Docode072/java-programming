package QuizApp;

import java.util.Scanner;

public class QuestionService {
    int userScore = 0;
    Question[] questions = {
        new Question("What is the capital of France?", new String[]{"Berlin", "Madrid", "Paris", "Rome"}, 2),
        new Question("What is 2 + 2?", new String[]{"3", "4", "5", "6"}, 1),
        new Question("What is the largest planet in our solar system?", new String[]{"Earth", "Mars", "Jupiter", "Saturn"}, 2)
    };

    public void startQuiz() {
        System.out.println("Starting the quiz...");
    }
    public Question[] getQuestions() {
        return questions;
    }
    
   public void playQuiz() {
        for (Question question : questions) {
            System.out.println(question.getQuestionText());
            String[] options = question.getOptions();
            for (int j = 0; j < options.length; j++) {
                System.out.println((j + 1) + ". " + options[j]);
            }
            // Here you would normally get user input and check the answer
            System.out.println(); // Just for better readability 
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your answer (1-" + options.length + "): ");
            int userAnswer = sc.nextInt() - 1; // Adjusting for 0 
            if (question.isCorrect(userAnswer)) {
                System.out.println("Correct!");
                userScore++;
            } else {
                System.out.println("Wrong! The correct answer was: " + options[question.getCorrectAnswerIndex()]);
            }
            System.out.println(); // Just for better readability  
        }
        System.out.println("Quiz over! Your score: " + userScore + "/" + questions.length);
}


}
