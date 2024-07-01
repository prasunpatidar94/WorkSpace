package com.pp.sun;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {

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

        System.out.println("-----------------------------------------------------------------");




    }
//
//    public boolean binarySearch(List<Integer> intList,Integer fi,Integer mi,Integer li) {
//
//
//        if (miV == item) {
//            System.out.println(intList.get(mi) + " Is present in this list");
//            break;
//        } else if (item < miV) {
//            li = mi - 1;
//        } else if (item > miV) {
//            fi = mi + 1;
//        }
//        mi = (fi + li) / 2;
//
//    }
}
