import interfaces.Filter;

import java.util.Map;

import static classes.MyCollection.filter;
import static classes.MyCollection.mapOfCountElements;

public class Main {
    public static void main(String[] args) {
        Object[] initArray = {10, 20, 30, 40, 190, 60, 180, 9, 60, 3, 10, 3, 3, 40};
        String[] initArrayOfStrings = {
                "To be or not to be",
                "I think, therefore I am",
                "To be or not to be",
                "The unexamined life is not worth living",
                "I think, therefore I am",
                "Knowledge is power",
                "To be or not to be"
        };

        System.out.println("///////////////// [ЗАДАНИЕ #1 FILTER] /////////////////\n");

        printArray("initArray", initArray);

        Filter addFiveIfDividedByTwoWithoutRemainder = o -> {
            if (o instanceof Integer && (Integer) o%2==0) {
                return (Integer) o + 5;
            }
            return o;
        };

        Filter addString = o -> {
            if (o instanceof String){
                return o + " FILTER_STRING";
            }
            return o;
        };

        Object[] resultArray = filter(initArray, addFiveIfDividedByTwoWithoutRemainder);
        printArray("\nFilter (addFiveIfDividedByTwoWithoutRemainder)\nResult array", resultArray);

        System.out.println("OR");
        System.out.println("initArrayOfStrings");
        for (String s:initArrayOfStrings) {
            System.out.println(s);
        }
        String[] resultArrayOfStrings = filter(initArrayOfStrings, addString);

        System.out.println("\nFilter (addString)\nresultArrayOfStrings");
        for (String s:resultArrayOfStrings) {
            System.out.println(s);
        }


        System.out.println("\n///////////////// [ЗАДАНИЕ #2 MAP] /////////////////\n");
        printArray("initArray", initArray);

        Map<Object, Integer> resultMap = mapOfCountElements(initArray);

        System.out.println("\nResult Map");
        for (Map.Entry<Object, Integer> entry : resultMap.entrySet()) {
            System.out.println("\"" + entry.getKey() + "\" appears " + entry.getValue() + " times.");
        }
        System.out.println("OR");


        System.out.println("initArrayOfStrings");

        for (String s:initArrayOfStrings) {
                System.out.println(s);
            }

        System.out.println("\nresultMapOfString");
        Map<String, Integer> resultMapOfString = mapOfCountElements(initArrayOfStrings);

        // Выводим результат
        for (Map.Entry<String, Integer> entry : resultMapOfString.entrySet()) {
            System.out.println("\"" + entry.getKey() + "\" appears " + entry.getValue() + " times.");
        }
    }
    private static void printArray(String label, Object[] array) {
        System.out.print(label + ": [");
        for (int index = 0; index < array.length; index++) {
            System.out.print(array[index]);
            if (index < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

}

