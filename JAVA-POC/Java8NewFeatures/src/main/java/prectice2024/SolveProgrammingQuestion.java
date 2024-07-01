package prectice2024;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

public class SolveProgrammingQuestion {
    public static void main(String[] args) {
//        Given a string find out duplicate character and its count .
        String in = "Prasun Patidar Is Good Boy!";
        HashMap<String, Integer> map = new HashMap<>();
        Arrays.stream(in.split("")).forEach(e -> {
//            map.put(e,map.getOrDefault(e,0)+1);
            map.put(e, (map.get(e) == null) ? 0 : map.get(e) + 1);
        });

        System.out.println(map);
        ;
//        --------------------------------------------------------
        map.clear();
        Arrays.stream(in.split(" ")).forEach(e -> map.put(e, map.getOrDefault(e, 0) + 1));
        System.out.println(map);

        HashMap
    }
}
