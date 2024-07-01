public class FunctionAndMethod {
    public static void main(String[] args) {

//        System.out.println(addNumbers(100,200));
        System.out.println(fectorialOfNumber(5));
    }
    public static int addNumbers (int a, int b){
        return a+b;
    }
    public static int fectorialOfNumber (int inputNumber){
        if (inputNumber<=1){
            return 1;
        }else {

           return (inputNumber * fectorialOfNumber(inputNumber-1));

        }

    }
}