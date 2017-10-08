package Homework3;

import java.util.Scanner;

public class Homework3 extends Trainer {

    public static void main(String[] args) {

        String trainer = "trainer";
        String quiz = "quiz";
        String joke = "Two bytes meet. The first byte asks: Are you ill? The second byte replies: No, just feeling a bit off.";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi, Fellow! Welcome to Java-Master 1.0. What training method would you like to use " + trainer
                + " or " + quiz + "?");

        String name = scanner.nextLine();

        if (name.equals(trainer)) {
            System.out.println("Great choice! Welcome to " + trainer + "!");

            createMethod();

            System.out.println("Would you like to check your knowledge in quiz \uD83D\uDC47 ?");

            String reply = scanner.nextLine();

            if (reply.equals("yes")) {

                solveQuiz();
            }
            else {
                System.out.println("We hope you have learned a lot today anyway!");
            }
        }

        else {

            System.out.println("Great choice! Welcome to " + quiz + "!");
            solveQuiz();
        }

        System.out.println("You have done an ok job \uD83E\uDD13 and deserve a joke on the topic we discussed this week.");
        System.out.println(joke);
    }
}