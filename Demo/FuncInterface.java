import java.util.function.Function;
import java.util.function.Predicate;

public class FuncInterface {

    public static void main(String[] args) {
/*

        Fn1 fn1= ()->"data";


        System.out.println(fn1.show());
        */

        Function<Integer,String> function = (data)->"this is the data in java "+data;

        System.out.println(function.apply(1000 ));


        Predicate
    }

}

@FunctionalInterface
 interface Fn1{
     String show();
}

interface Fn2 extends Fn1{
    String info();
}


