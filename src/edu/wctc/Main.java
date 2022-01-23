package edu.wctc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Preference Quiz! \r\n");
        boolean playAgain;
        do{
            generateQuiz();
            System.out.println("Again? Enter 1 to play again, or any other key to exit.");
            System.out.print(">");
            Scanner keyboard = new Scanner(System.in);
            playAgain = keyboard.nextLine().equals("1");
        } while(playAgain);

    }

    public static void generateQuiz() {
        String[] questions = new String[5];
        int[] choices = new int[5];
        int points = 0;
        questions[0] = "Do you prefer mild or spicy?";
        questions[1] = "Do you prefer tea or coffee?";
        questions[2] = "Do you prefer breakfast or brunch?";
        questions[3] = "Do you prefer summer or winter?";
        questions[4] = "Do you prefer paper or plastic?";

        for (int i = 0; i < 5; i++) {
            System.out.println(questions[i]);
            hintForUser();
            Scanner keyboard = new Scanner(System.in);
            int userInput = Integer.parseInt(keyboard.nextLine());
            choices[i] = userInput;
            points += userInput;
        }

        System.out.printf("Your score is: %d \r\n", points);
        if(points < 3) {
            System.out.println("You prefer life to be calm and organized.");
        }
        else if (points > 3) {
            System.out.println("You prefer life to be spontaneous and active.");
        }
        else {
            System.out.println("You prefer a good balance in life.");
        }
    }

    public static void hintForUser() {
        System.out.println("Enter 0 for the preference on the left");
        System.out.println("Enter 1 for the preference on the right");
        System.out.print(">");
    }
}
