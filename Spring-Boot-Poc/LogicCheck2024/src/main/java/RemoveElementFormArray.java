import java.util.Arrays;
import java.util.List;

public class RemoveElementFormArray {
    public static void main(String[] args) {

        int[] oList=  {1,2,3,4,5,7,8};
         oList =Arrays.stream(oList).filter(e->e!=5).toArray();
        System.out.println(Arrays.toString(oList));
//        System.out.println(Arrays.toString(nList));


        String name= "sandeep";
        List list =Arrays.asList(name.toCharArray());
        System.out.println(list.stream().findAny());
        System.out.println(name);
    }
}
