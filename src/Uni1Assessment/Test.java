package Uni1Assessment;

public class Test {


    public static void main(String[] args) {

        lifeBenchmarks(17);
        System.out.println(divisibleByNine(-45));
        System.out.println(reverseString("12345"));
        printEvents();

        System.out.println(sameStringLength("", ""));
        System.out.println(num());

    }

    public static double num() {
        double a = 5.0 / 3.0;
        return a;
    }

    public static void lifeBenchmarks(int age) {

        if (age >= 65) {
            System.out.println("You can now retire!");
        } else if (age >= 21) {
            System.out.println("You can now graduate college!");
        } else if (age >= 18) {
            System.out.println("You can now vote!");
        } else {
            System.out.println("You should stay in school!");
        }
    }


    public static boolean divisibleByNine(int input) {
        if (input % 9 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static String reverseString(String input) {
        String tupin = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            char letter = input.charAt(i);
            tupin += letter;
        }
        return tupin;
    }

    public static void printEvents() {

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }

        }
    }

    public static boolean sameStringLength(String word01, String word02) {

        if (word01.length() == word02.length()) {
            return true;
        }
        return false;

    }
}






