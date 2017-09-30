package HomeworkWeek2Game;

import java.util.Scanner;

public class LetsShakeIt {


    public static void main(String[] args) {

        String input = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi there! What is your name?");
        String name = scanner.nextLine();

        System.out.println("Do you like spirits, " + name + "?");
        String name1 = scanner.nextLine();

        if (name1.equals("yes")) {
            System.out.println("Great! Let me make you one!");

        } else {
            System.out.println("Not a problem! I will make you one that you will really like!");
        }

        while (true) {
            String a = "vodka";
            String b = "gin";
            String c = "bourbon";
            System.out.println("Tell me what alcohol you " +
                    "prefer " + a +", " + b + " or " + c + "?");

            input = scanner.nextLine();
            boolean keepAsking = tellMe(a,b,c, input);
            if (keepAsking) {
                break;
            }
        }

        call(input);
        input = scanner.nextLine();

        System.out.println("Here you are!  \uD83C\uDF78 \uD83C\uDF78 \uD83C\uDF78");

    }

    public static boolean tellMe(String a, String b, String c, String input) {

            if (input.equals(a)) {
                bastard("Russian");
                return true;

            } else if (input.equals(b)) {
                bastard("Dutch");
                return true;

            } else if (input.equals(c)) {
                bastard("Scottish");
                return true;

            } else {
                System.out.println("Com'on! Don't be difficult, choose one!");
                return false;
            }
        }

    public static void bastard(String nationality) {
        System.out.println("You " + nationality + " Bastard! This is a great choice!");
    }

    public static void call(String input) {

        switch(input) {
            case "vodka":
                Vodka vodka = new Vodka();
                vodka.print();
                break;
            case "gin":
                Gin gin = new Gin();
                gin.print();
                break;
            case "bourbon":
                Bourbon bourbon = new Bourbon();
                bourbon.print();
                break;
        }
    }

}
