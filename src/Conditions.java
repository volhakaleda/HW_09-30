public class Conditions {
    public static void main(String[] arg) {

        int adult = 19;

        if (adult >= 18) {
            System.out.println ("Adult");
        }
        else  {
            System.out.println ("Not Adult");
        }

        boolean isSunday = true;
        boolean isSat = false;
        boolean isWeekend = isSunday || isSat;


        System.out.println (isWeekend);


        int day = (isSunday && isSat) ? 5 : 6;
        System.out.println(day);

         String result = ("Yuliya".equals ("Olga")) ? "more" : "less";
         System.out.println(result);




        int number = 31;

        if (number > 20) {
            System.out.println("Positive");
        }

            else if (number > 30) {
                System.out.println("Negative");
        }





    }
}

