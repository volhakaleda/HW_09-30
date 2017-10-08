package Homework3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Trainer extends Quiz{

    public static void main(String[] args) {

        createMethod();
        solveQuiz();
    }

    public static void createMethod() {
        String[] terms = new String[5];
        terms[0] = "base";
        terms[1] = "jvm";
        terms[2] = "jdk";
        terms[3] = "jre";
        terms[4] = "compiler";


        System.out.println("From the following Java terms, please choose the first that you would like to learn more " +
                "about: " + Arrays.toString(terms));

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            String term = scanner.nextLine();


            if (term.equals("base")) {
                System.out.println("A base is the number of unique digits, including zero, used to represent numbers in a " +
                        "positional numeral system.");
            } else if (term.equals("jvm")) {
                System.out.println("Java Virtual Machine, a virtual machine that interprets Java bytecode and enables " +
                        "your computer to run it as a program");

            } else if (term.equals("jdk")) {
                System.out.println("Java Development Kit, contains the basics needed to develop a Java program" +
                        " (including the JRE as well as tools such as javac)");

            } else if (term.equals("jre")) {
                System.out.println("Java Runtime Environment, a software package that contains what is needed to " +
                        "run a Java program (including the JVM)");

            } else if (term.equals("compiler")) {
                System.out.println("Compiler is a program that translates source code into machine code");

            } else {
                System.out.println("Oops, try typing again.");
            }
        }
        System.out.println("Great job done! \uD83D\uDC4D");
    }
}



