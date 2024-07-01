package com.pp.sun;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountFrequencyOfEachCharInGivenString {
    public static void main(String[] args) {
        String str = "gahsadyuashjddhvuwqb";

        Map<Object, Long> characterIntegerHashMap = Arrays.asList(str.split("")).stream()
                .collect(
                        Collectors
                                .groupingBy(
                                        e -> e,
                                        Collectors.counting()
                                )
                );

        System.out.println(characterIntegerHashMap);
/*
        --------------------------------------------------------------------------------------------------
*/

        HashMap<String, Integer> data = new HashMap<>();

        for (String e : str.split("")) {

            data.put(e, (data.get(e) == null) ? 1 : data.get(e) + 1);
        }
        System.out.println(data);



//---------------------------------------First Approch-----------------------------------------------------


        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 15);

        Integer fi = 0, li = (intList.size() - 1), mi = (int) (fi + li) / 2;
        Integer fiV, liV, miV;
        Integer item = 5;

        while (li >= fi) {
            miV = intList.get(mi);

            if (miV == item) {
                System.out.println(intList.get(mi) + " Is present in this list");
                break;
            } else if (item < miV) {
                li = mi - 1;
            } else if (item > miV) {
                fi = mi + 1;
            }
            mi = (fi + li) / 2;

        }
        if (intList.get(mi) != item)
            System.out.println("Not present");



    }
}
//This code is contributed by Shivam Miglani