public class Functions {

    public static void main(String[] arg) {

        int a = 5;
                a = 7;

        String period = "Summer";
        String result = getWeather(period);

        System.out.println(result);
    }
        public static String getWeather(String period) {


        if (period.equals ("Summer")){
           return "Warm";

            }
        else if (period.equals ("Winter")) {
            return "Cold";

        }
        else {
            return "";
            }

//            int count = 0;
//            while (true) {
//                System.out.println(count);
//                count += 1;
//                if (count > 10)
//                    break;
//            }
    }
}