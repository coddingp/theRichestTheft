package com.company;

import java.io.*;
import java.nio.CharBuffer;
import java.util.*;

public class Main {

    public static <IntTargetList> void main(String[] args) throws IOException {

        ArrayList<Integer> cashList = new ArrayList<Integer>();
        cashList.add(1);
        cashList.add(2);
        cashList.add(2);
        cashList.add(2);
        cashList.add(1);
        System.out.println(cashList);
        System.out.println(getResult(cashList, 0));

    }

    public static List<Integer> getResult(List<Integer> cash, int k) {
        ArrayList<Integer> richestTheft = new ArrayList<>();
        ArrayList<Integer> richestTheft2 = new ArrayList<>();
        ArrayList<Integer> richestTheft3 = new ArrayList<>();
        richestTheft.addAll(cash);
        int max = 0;
        for (int i = 0; i < richestTheft.size(); i++) {
            if (richestTheft.get(i) > max) {
                max = richestTheft.get(i);
            }
        }
        for (int i = 0; i < richestTheft.size(); i++) {
            if (richestTheft.get(i) + k >= max) {
                richestTheft2.add(i + 1);
            }
        }if (k == 0){
            richestTheft3.add(richestTheft.indexOf(max));
            return richestTheft3;
        }
        return richestTheft2;
    }
}
//}package com.company;
//
//import java.io.*;
//import java.nio.CharBuffer;
//import java.util.*;
//
//public class Main {
//
//    public static <IntTargetList> void main(String[] args) throws IOException {
//
//        ArrayList<String> stringList = new ArrayList<String>();
//        stringList.add("07-11");
//        stringList.add("10-12");
//        stringList.add("12-15");
//        System.out.println(getResult(stringList));
//
//    }
//
//    public static boolean getResult(ArrayList<String> strList) {
//        ArrayList<Integer> intList = new ArrayList<>();
//        for (int i = 0; i < strList.size(); i++) {
//            intList.add(Integer.parseInt(strList.get(i), 0, 2, 10));
//            intList.add(Integer.parseInt(strList.get(i), 3, 5, 10));
//            for (int j = i + 1; j < strList.size(); j++) {
//                intList.add(Integer.parseInt(strList.get(j), 0, 2, 10));
//                intList.add(Integer.parseInt(strList.get(j), 3, 5, 10));
//                if (intList.get(0) > intList.get(2)  && intList.get(0) <  intList.get(3) ||  intList.get(1) >  intList.get(2) &&  intList.get(1) <  intList.get(3)) return false;
//            }
//        }
//        return true;
//    }
//}
//}public class Main {
//
//    public static void main(String[] args) throws IOException {
//        boolean isItPossibleToVisitAllScheduledEvents = true;
//        ArrayList<String> stringList = new ArrayList<String>();
//        stringList.add("07-09");
//        stringList.add("10-12");
//        stringList.add("13-15");
//
//        ArrayList<Integer> stringListConvertedToIntegerList = new ArrayList<>();
//
//        for (String s:stringList) {
//            stringListConvertedToIntegerList.;
//        }
//
//
//
//        File stringListToFile = new File("stringListToFile");
//        FileWriter stringListWriter = new FileWriter("stringListToFile");
//
//        for (int i = 0; i < stringList.size(); i++) {
//            stringListWriter.write(stringList.get(i));
//        }
//        FileReader stringListReader = new FileReader("stringListToFile");
//        stringListWriter.close();
//
//
//        int[] intArray = new int[(int) stringListToFile.length()];
//
//        for (int i = 0; i < stringListToFile.length(); i++) {
//            intArray[i] = Character.getNumericValue(stringListReader.read());
//        }
//
//
//
//        stringListReader.close();
//        System.out.println(Arrays.toString(intArray));
////
////        for (int i = 5; i < stringListToFile.length(); i += 5) {
////            if (timeBlocks > 1) {
////                if (i + 1 < stringListToFile.length()) {
////                    if (intArray[i] < intArray[i + 1]) {
////                        isItPossibleToVisitAllScheduledEvents = false;
////                    }
////                }
////            } else isItPossibleToVisitAllScheduledEvents = false;
////        }
//
//        System.out.println(isItPossibleToVisitAllScheduledEvents);
//
//    }
//}
