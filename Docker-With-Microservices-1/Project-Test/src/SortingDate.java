import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public class SortingDate {

    public static void main(String[] args) {

        List<String> months= Arrays.asList("FEB","JAN","DEC");
List<Date> list=  months.stream().map((value)-> {
    try {
        return new SimpleDateFormat("MMM", Locale.ENGLISH).parse(value);
    } catch (ParseException e) {
        throw new RuntimeException(e);
    }
}).collect(Collectors.toList());

        SortedSet<Date> sortedSet= new TreeSet<>(list) ;


    sortedSet.stream().forEach(value-> System.out.println(value));





    }

    

}
