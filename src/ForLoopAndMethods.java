import javax.xml.bind.SchemaOutputResolver;

public class ForLoopAndMethods {

    public static void main(String[] args) {

        int number = 3;

        System.out.println(number += 1);


        for (int i = 0; i <= 3; i++) {
            System.out.println(i);
            break;

        }

        for (int i = 4; i >= 0; i--) {
            if (i == 2) {
                continue;
            }

            System.out.println(i);
        }

        int i = 1;

        while (i <= 4) {
            if (i%2 != 0) {

                System.out.println(true);
            }
            else {

                System.out.println(false);
            }
            i++;
        }

        String name = "Volha";
        System.out.println(name.length());
        System.out.println(name.charAt(4));


        loop();
        number();
       letter();



    }

    public static void loop() {
        int i = 0;
        while (i <= 100) {
            i++;
            System.out.println(i);
        }

        for (int a = 0; a<=100; a++) {
            System.out.println(a);

        }
    }

      public static void number() {
            int b = 1;

            while (b<=100) {

                 if (b%3 == 0 && b%5 == 0) {
                    System.out.println("FizzBuzz");
                }
                else if (b%3 == 0) {
                    System.out.println("Fizz");
                }

                else if (b%5 == 0) {
                    System.out.println("Buzz");
                }

                else {
                    System.out.println(b);

                }
                b++;
            }
        }

    public static void letter() {
        String letter = 5+"";

        System.out.println(letter);
    }

    public static int getAsciiValue(String s){
        int total = 0;

        for(int i = 0; i < s.length(); i++){
            int intVal = (int) s.charAt(i);
            total += intVal;
        }
        return total;
    }


    }



