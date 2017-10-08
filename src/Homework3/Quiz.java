package Homework3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;

public class Quiz {

    public static void main(String[] args) {

        solveQuiz();

    }

    public static void solveQuiz() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Answer the following 5 questions to hear a joke.");

        for (int count = 1; count <= 5; count++) {

            System.out.println("Question " + count);


            if (count == 1) {
                System.out.println("Which from the below list is a dynamic data structure?");

                ArrayList<String> name = new ArrayList<>();
                name.add("1. array");
                name.add("2. arrayList");
                name.add("3. hashMap");

                for (int i = 0; i < name.size(); i++) {
                    System.out.println(name.get(i));
                }

                int option = scanner.nextInt();

                if (option == 2 || option == 3) {
                    System.out.println("You almost there! Anything else?");

                    int option1 = scanner.nextInt();

                    if (option1 == 2 || option1 == 3) {
                        System.out.println("Well done! The correct answer is 2 and 3: arrayList and hashMap.");
                    }
                } else {
                    System.out.println(" ❌ You need to do more reading. The correct answer is 2 and 3: arrayList and hashMap.");
                }

            } else if (count == 2) {
                System.out.println("Java is ... ");

                ArrayList<String> name = new ArrayList<>();
                name.add("1. strongly-typed language");
                name.add("2. weakly-typed language");
                name.add("3. loosly-typed language");

                for (int i = 0; i < name.size(); i++) {
                    System.out.println(name.get(i));
                }

                int option = scanner.nextInt();

                String answer = "The correct answer is 1. Java is a strongly-typed language because every variable " +
                        "must be declared with a data type.";

                if (option == 1) {
                    System.out.println("✅ You got it! " + answer);
                } else {
                    System.out.println(" ❌ C'mon, you can do better. " + answer);
                }

            } else if (count == 4) {
                System.out.println("Convert 100101 binary number into decimal.");

                ArrayList<String> name = new ArrayList<>();
                name.add("1. 101");
                name.add("2. 110");
                name.add("3. 111");

                for (int i = 0; i < name.size(); i++) {
                    System.out.println(name.get(i));
                }

                int option = scanner.nextInt();

                String answer = "The correct answer is 101.";

                if (option == 1) {
                    System.out.println("✅ You are my superstar! " + answer);
                } else {
                    System.out.println(" ❌ Math is not your strongest side. " + answer);
                }
            } else if (count == 5) {
                System.out.println("Who is the father of Java?");

                ArrayList<String> name = new ArrayList<>();
                name.add("1. Dennis Ritchie");
                name.add("2. Bjarne Stroustroup");
                name.add("3. James Gosling");

                for (int i = 0; i < name.size(); i++) {
                    System.out.println(name.get(i));
                }

                int option = scanner.nextInt();

                String answer = "The correct answer is 3. James Gosling.";

                if (option == 3) {
                    System.out.println(" ✅ Today is your day! " + answer);
                } else {
                    System.out.println(" ❌ Maybe Java is not for you. " + answer);
                }
            } else if (count == 3) {
                System.out.println("What was the original name for Java?");

                ArrayList<String> name = new ArrayList<>();
                name.add("1. Ada");
                name.add("2. Lisp");
                name.add("3. Oak");

                for (int i = 0; i < name.size(); i++) {
                    System.out.println(name.get(i));
                }

                int option = scanner.nextInt();

                String answer = "The correct answer is 3.Oak.";

                if (option == 3) {
                    System.out.println(" ✅ I am proud of you! " + answer);
                } else {
                    System.out.println(" ❌ We have a problem. " + answer);
                }

            }
        }
    }
}





