package classes;

import interfaces.Filter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyCollection {

    public static <T> T[] filter(T[] array, Filter filter){
        List<T> resultArray = new ArrayList<>();

        for (T elem: array){
            resultArray.add((T) filter.apply(elem));
        }
        return resultArray.toArray(array.clone());
    }

    public static <T> Map<T, Integer> mapOfCountElements(T[] array){ //дженерик типа T
        Map<T, Integer> countMap = new HashMap<>();
        for (T elem:array){
            countMap.put(elem, countMap.getOrDefault(elem, 0) + 1);
        }
        return countMap;
    }
}
