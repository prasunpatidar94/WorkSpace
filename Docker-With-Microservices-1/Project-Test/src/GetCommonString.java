import java.util.*;
import java.util.stream.Collectors;

public class GetCommonString {

    public static void main(String[] args) {

//        String s1="my a name is Prasun Patidar";
//        List<String> s2= Arrays.asList(new String("my d name is Ompal Singh").split(" "));
//
//        List <String>  list=
//        Arrays.stream(s1.split(" ")).filter((v)->s2.contains(v)).collect(Collectors.toList());
//
//        System.out.println(list);
//
//
//        List <Integer> listin= Arrays.asList(44,55,88,44,55,22,66,858,44);
//        List <Integer> listout= new LinkedList<>(listin);
//        Set<Integer> set = new HashSet<>(listin);
//
//        System.out.println("vbvghvghvgh"+listout.add(5));
//
//        for (Integer v: listin) {
//
//
//
//        }
//
//
//

        Map<String,String> stringStringMap= new HashMap<>();

        stringStringMap.put(null,"Prasun");
        stringStringMap.put(null,"kamal");

        stringStringMap.put("1","Prasun");
        stringStringMap.put("1","kamal");

        System.out.println(stringStringMap);



    }

}


