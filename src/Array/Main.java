package Array;

import javax.print.attribute.HashAttributeSet;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {


        int nums = 879;
        String s = String.valueOf(nums);
        System.out.println(s.length());

//        for (nums = 0; nums<nums.length(); )
//        System.out.println(nums.count);

        ArrayList<String> arrayList = new ArrayList<>();
        System.out.println(arrayList.size());
//
//        String type = "I like books";
//
//        HashMap<String, String> map = new HashMap<>;
//
//        map.put("January", "Capricorn");
//        map.put("February", "Aquarius");
//        map.put("MArch", "Pisces");
//        map.put("May", "Taurus");
//        map.put("January", "CApricorn");
//
//        HashMap<String, List<Dogs>> owners = new HashMap<>;


//        ArrayList<Dog> arrayList = new ArrayList<>();
//        arrayList.add(new Dog());
//
//
//
////        //primitive String array
////        String[] arr = new String[type.length()];
//        char[] chars = new char[type.length()];
//
//        for (int i = 0; i < type.length(); i++) {
//            chars[i] = type.charAt(i);
//
//            arr[i] = "" + type.charAt(i);
//            arr[i] = String.valueOf(type.charAt(i));
//
////            String[] split = type.split(" ");
////            String[] result = {"i", "like", "books"};
//
//            System.out.print(chars[i]);
//        }

    }

    public static int getSum(ArrayList<Integer> arrayList) {
        int result = 0;

        for (int i : arrayList) {
            result += arrayList.get(i);
        }
        return (result);

    }
    //takes a list of int and returns the smallest

//    public static int returnSmallest (ArrayList<Integer> arrayList) {
//
//        int smallest = arrayList.get(0);
//
//        for (int i : arrayList) {
//            if (smallest < i) {
//            }
//            return smallest;
//
//        }
//        else


    }


