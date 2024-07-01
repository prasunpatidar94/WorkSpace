package design.test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 6, 7, 8};
//        int[] full= {1, 2, 3,4,5, 6, 7, 8};
//
//        System.out.println(Arrays.mismatch(arr,full));

//        Array array= Arr{1, 2, 3,4,5, 6, 7, 8};
        System.out.println(getSmallestMissingNumber(arr));

    }

    public static int getSmallestMissingNumber(int[] arr) {

        int temp = 0;
        for (int v : arr) {

            if (v != arr[v - 1]) {
                return temp+1;
            } else{
                temp=v;
            }

        }

        return -1;
    }

}
