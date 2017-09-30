import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

//import java.lang.reflect.Array;
//import java.util.Arrays;
//import java.util.Random;
//import java.util.Scanner;
//
//public class Homework {
//
//    public static void main(String[] args) {
//
//        Person m = new Person(); //Object
//        Person t = new Person();
//        m.getAge();
//        t.getAge();
//
//        Person volha = new Person("Volha", "CTO");
//        int futureAge = volha.getOlder(29);
//        System.out.println(futureAge);
//
//
//        int five =5;
//        switch (five) {
//            case 6:
//                System.out.println("found tide");
//
//            case 5:
//                System.out.println("found fi");
//            case 7:
//                System.out.println("found 7");
//            default:
//                System.out.println("default");
//
//
//        }
//        iceCream();
//
////        boolean result = answerCell(false, false, false);
////        boolean result1 = answerCell(false, false, true);
////        boolean result2 = answerCell(true, false, false);
////        boolean result3 = answerCell(true, true, false);
////
////        System.out.println(result);
////        System.out.println(result1);
////        System.out.println(result2);
////        System.out.println(result3);
////
////        int sum = add(1, 2);
////        System.out.println(sum);
////
////        String age = calculateAge(1988, 2017);
////        System.out.println(age);
////
////        System.out.println(XO("ooxx"));
////        System.out.println(XO("xooxx"));
////        System.out.println(XO("ooxXm"));
//
//
////        System.out.println(sell("Endlessly"));
//
////        scanner();
//
//
////        System.out.println(counting("Hello!"));
////        System.out.println(counting("Hello, world!"));
////        System.out.println(counting("That's not my name."));
//
////        System.out.println(countCode("aaacodebbb"));
////        System.out.println(countCode("codexxcode"));
////        System.out.println(countCode("cozexxcope"));
//
////        System.out.println(vowelCount("test string"));
//////        System.out.println(vowelCount("longer string with more vowels"));
////
////        System.out.println(subStrAfterChars("this is a test string", 'a'));
////        System.out.println(subStrAfterChars("this is another test", 'o'));
//    }
//
////    public static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
////
////        if (isAsleep || isMorning) {
////            return false;
////        } else if (isMorning && isMom) {
////            return true;
////        }
////
////
////        return true;
////    }
////
////
////    public static int add(int a, int b) {
////
////        int c = a + b;
////        return c;
////    }
////
////    public static String calculateAge(int a, int b) {
////
////        int diff = b - a;
////        int diff1 = b - a - 1;
////
////        String age = "You are either " + diff + " or " + diff1;
////
////        return age;
////
////    }
////
////    public static boolean XO(String a) {
////
////        int countx = 0;
////        int counto = 0;
////
////        for (int i = 0; i < a.length(); i++) {
////
////            char letter = a.charAt(i);
////
////            if (letter == 'x' || letter == 'X') {
////
////                countx++;
////            }
////            if (letter == 'o' || letter == 'O') {
////
////                counto++;
////
////            }
////        }
////
////        if (countx == counto) {
////            return true;
////        }
////
////        return false;
////
////    }
////
////    public static boolean sell(String s) {
////
////        int lastIndex = s.length() - 1;
////        int lastIndex2 = s.length() - 2;
////
////        char lastLetter = s.charAt(lastIndex);
////        char lastLetter1 = s.charAt(lastIndex2);
////
////
////        if (lastLetter == 'y' && lastLetter1 == 'l') {
////
////            return true;
////        }
////
////        return false;
////    }
////
////    public static void scanner() {
////
////        while (true) {
////            Scanner scanner = new Scanner(System.in);
////            System.out.println("Enter a food:");
////
////            String name = scanner.next();
////
////            int firstIndex = 0;
////            char firstLetter = name.charAt(firstIndex);
////
////            if (firstLetter == 'h') {
////                System.out.println("Yum!");
////            } else {
////                System.out.println("Yuck!");
////            }
////
////
////        }
////
////    }
////
////    public static String counting(String f) {
////
////        int lastIndex = f.length() - 1;
////
////        String newString = f.substring(0, 3) + "..." + f.substring(lastIndex);
////
////        if (newString.length() > f.length()) {
////            return f;
////        } else {
////            return newString;
////        }
////
////    }
////
////    public static int countCode(String w) {
////
////        int count = 0;
////
////        for (int o = 0; o < w.length(); o++) {
////
////            char first = w.charAt(o);
////            if (first == 'c') {
////
////                String newString = w.substring(o, o + 4);
////                boolean isCode = match(newString);
////
////                if (isCode) {
////                    count++;
////
////                }
////            }
////        }
////        return count;
////    }
////
////    public static boolean match(String p) {
////
////        if (p.charAt(1) == 'o' && p.charAt(3) == 'e') {
////            return true;
////        }
////        return false;
////
////    }
//
//////    9.
////    public static int vowelCount(String input) {
////
////        int count = 0;
////
////        for (int p = 0; p < input.length(); p++) {
////
////            char zero = input.charAt(p);
////
////            if (zero == 'a') {
////                count++;
////            }
////
////            else if (zero == 'e') {
////                count++;
////            }
////
////            else if (zero == 'i') {
////                count++;
////            }
////
////            else if (zero == 'o') {
////                count++;
////            }
////
////            else if (zero == 'u') {
////                count++;
////            }
////        }
////        return count;
////
////    }
////
//////    10.
////
////    public static boolean bobThere(String h) {
////
////        for (int u = 0; u < h.length(); u++) {
////
////            char newChar = h.charAt(u);
////
////            if (newChar == 'b') {
////
////                String stringNew = h.substring(u, u + 3);
////                boolean match = matchNow(stringNew);
////                if (match == true) {
////                    return true;
////                }
////            }
////        }
////        return false;
////
////    }
////
////    public static boolean matchNow(String w) {
////        if (w.charAt(2) == 'b') {
////            return true;
////        }
////        return false;
//////    }
////
//////    11.
////
////    public static String subStrAfterChars(String input, char m) {
////
////        int d = 0;
////
////
////        for (d = 0; d < input.length(); d++) {
////            char point = input.charAt(d);
////
////
////            if (point == m) {
////
////                return input.substring(d + 1, input.length());
////
////            }
////        }
////
////        return "";
////
////    }
//
//    public static void iceCream() {
//
//        int countToppings = 0;
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Welcome to our ice cream service! What's your name?");
//        String name = scanner.nextLine();
//
//        Scanner iceCreamFlavour = new Scanner(System.in);
//        System.out.println("Okay " + name + "Which flavor of ice cream would you like?");
//        String nameone = iceCreamFlavour.nextLine();
//
//
//        Scanner topping1 = new Scanner(System.in);
//        System.out.println("Would you like chocolate chips?");
//        String nametwo = topping1.nextLine();
//        if (nametwo.equals("yes")) {
//            countToppings++;
//
//        }
//
//        Scanner topping2 = new Scanner(System.in);
//        System.out.println("Would you like bananas?");
//        String namethree = topping2.nextLine();
//        if (namethree.equals("yes")) {
//            countToppings++;
//
//        }
//
//        Scanner topping3 = new Scanner(System.in);
//        System.out.println("Would you like gummy bears?");
//        String namefour = topping3.nextLine();
//        if (namethree.equals("yes")) {
//            countToppings++;
//        }
//
//        double price = 2.33 + (0.33 * countToppings);
//
//        Random r = new Random();
//        int time = r.nextInt(60);// 0-59
//        int time1 = r.nextInt(61);// 0-60
//        int time2 = r.nextInt(60) + 1;// 1-60
//
//
//        System.out.println("Okay! A " + nameone + "ice cream with " + countToppings + "toppings. Your total is " + price
//                + "and your ice cream will arrive in " + time + "minutes");
//
//    }
//
//
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
