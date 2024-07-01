package org.example.itest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class InTest {

    public static void main(String[] args) {
        System.out.println("");


        //Find the number iwth max occurence in an array of integers.

        int[] arr = {1, 4, 5, 6, 1, 9, 2, 4, 8, 2, 4};

        int maxOcc = 0;
        int maxOccElement = 0;


        for (int i = 0; i <= (arr.length - 1); i++) {
            int element = arr[i];
            int count = 0;
            for (int j = 0; j <= (arr.length - 1); j++) {

                if (element == arr[j]) {
                    count = count + 1;
                }
            }
            if (count > maxOcc) {
                maxOccElement = element;
                maxOcc = count;
            }
            System.out.println("element " + element + " feq : " + count);
        }
        System.out.println("maxOccElement : " + maxOccElement + " maxOcc : " + maxOcc);

    }
//    find all the
//    last log in
//
//
//    10 2 5

//    table user
//            name , last log ,duretion log
}


//OrderBy DEC limit 1,1;
//
//
//grupBy name;
//
//select name , max(last_login) as loginTime form user_table  grupBy name Where last_login
//        = (select max(last_login) from user_table grupBy name  ) ;
//
//
//select name , logDuration as Duration from User_Table  OrderBy DEC logDuration limit 1,6;


 touch name.txt

cat touch name.txt


first name , lastName

select alias prasun patidar

cust a , b, c
 1 a
2  a b
3



name  day  thansection  transectionTime



select name , day , max(transectionTime) from GroupBy name ;


self Join
















