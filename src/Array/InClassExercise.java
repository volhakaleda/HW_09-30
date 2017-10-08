package Array;

import java.util.ArrayList;
import java.util.HashMap;

public class InClassExercise {

    public static void main(String[] args) {

        ArrayList<Character> list = new ArrayList<>();
        list.add('a');
        list.add('b');
        list.add('c');
        list.add('d');
        list.add('e');

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }
        getTrue(list,'a');
    }

        public static boolean getTrue(ArrayList<Character> list, char anyCharacter) {
            for (int i = 0; i < list.size(); i++)
                if (list.contains(anyCharacter)) {

                    System.out.println(anyCharacter);
                    return true;

                } else {
                    System.out.println("learn");
                }
            return false;

        }

//        list.add('c');
//        list.add('b');
//        list.add('a');

//        ArrayList<Character> list = new ArrayList<>();
//        list.add('c');
//        list.add('b');
//        list.add('a');
//
//        for (Character a : list) {
//            System.out.println(a);
//        }
//
//        for(int i =0; i < list.size(); i++) {
//            System.out.println(list.get(i)); // arrayList.get(index)  will print out index
//        }
//
//        isTrue(list, 'a');
//        checkHashMap();
//
//        HashMap<String, Integer> monthsM = new HashMap<>();
//        monthsM.put("Jany", 1);
//        monthsM.put("Febu", 1);
//        monthsM.put("Mar", 3);
//        monthsM.put("Apr", 4);
//        monthsM.put("Dece", 12);
//        monthsM.put("May", 5);
//
//        compare(monthsM);
//
//        String[] array = new String [3];
//        array[0] = "Volha";
//        array[1] = " ";
//        array[2] = "Murat";
//        array[2] = "John";
//
//        System.out.println(array.length);
//
//            ArrayList<Integer> arrayList = new ArrayList<>();
//
//            for (int i = 0; i < 3; i++) {
//                arrayList.add(i); //adds more elements to arraylist
//            }
//
//            System.out.println(arrayList.get(2));
//            arrayList.set(2, 5);
//            System.out.println(arrayList.set(2, 5));
//            arrayList.remove(0);



//        int[] aray = new int[5];
//
//        char[] array1 = new char[10];
//
//        String[] array2 = new String[7];
//
//        int[] array3 = new int[5];
//
//        System.out.println(array3.length);
//


//        int[] number = {0,1,2,3,4,5,6,7,8,9};
//
//
//        for (int i = 0; i < number.length; i++) {
//            System.out.println(number[i]);
//        }

//

//        ArrayList<Integer> numbers = new ArrayList<>();
//        numbers.add(10);
//        numbers.add(9);
//        numbers.add(8);
//        numbers.add(7);
//        numbers.add(6);
//        numbers.add(5);
//        numbers.add(4);
//        numbers.add(3);
//        numbers.add(2);
//        numbers.add(1);
//
//        for (int i = 0; i <= numbers.size(); i++) {
//            System.out.println(numbers.get(i));
//        }

//        for (int i : numbers
//             ) {
//            System.out.println(n);
//        }


    public static boolean isTrue(ArrayList<Character> f, char anyCharacter) {
        if (f.contains(anyCharacter)) {

            System.out.println(anyCharacter);
            return true;
        } else {
            System.out.println("learn");
            return false;

        }
    }

     public static void checkHashMap () {

         HashMap<String, Integer> monthsM = new HashMap<>();
         monthsM.put("Jany", 1);
         monthsM.put("Febu", 1);
         monthsM.put("Mar", 3);
         monthsM.put("Apr", 4);
         monthsM.put("May", 5);


         for (String key : monthsM.keySet()) { //monthsM.keySet() gives a list of all keys
             if (key.length() % 2 == 0) {
//                 int value = monthsM.get(key);
                 System.out.println(monthsM.get(key)); // // hashMap.get(key)  will print out value
             }

         }


         for (Integer num : monthsM.values()){ // monthsM.values gives a list of all values
             System.out.println(num);
         }

     }

     public static void compare(HashMap<String, Integer> monthsM) {

         for (String key : monthsM.keySet()) {
             int value = monthsM.get(key);
             if(value > 10) {
                 System.out.println(value);
             }
         }
     }
//     ﻿ArrayList<String> places = new ArrayList<>(Arrays.asList("Buenos Aires", "Córdoba", "La Plata")); = ﻿add()


}




