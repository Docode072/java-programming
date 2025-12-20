package QuizApp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuestionService qs = new QuestionService();
        qs.startQuiz();
        Scanner sc = new Scanner(System.in);   
        //qs.displayQuestion();
        System.out.print("Enter your name: ");
        String userName = sc.nextLine();
        System.out.println("Welcome to the quiz, " + userName + "!");

        // for (Question question : qs.getQuestions()) {
        //     qs.playQuiz();
        // }
        qs.playQuiz();
        sc.close();
    }
}
