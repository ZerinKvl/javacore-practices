package helloworld;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class AddtoArrayFormofInteger {

    public static void main(String[] args) {

        int[] arrayForm = { 1, 2, 6, 3, 0, 7, 1, 7, 1, 9, 7, 5, 6, 6, 4, 0, 0, 6, 4, 3, 5, 6, 6 };

        System.out.println(addToArrayForm(arrayForm, 1));// will write to console
        // [1, 2, 6, 3, 0, 7, 1, 7, 1, 9, 7, 5, 6, 6, 4, 0, 0, 6, 4, 3, 5, 6, 7]

    }

    public static List<Integer> addToArrayForm(int[] A, int K) {
        int size = A.length;
        String createdStrFromArray = "";
        String lastStr = "";// after adding K

        //// input array length should between 1 and 1000
        if (size >= 1 && size <= 10000) {
            for (int i = 0; i < size; i++) {
                if (size > 1) {
                    if (A[0] != 0) {
                        if (A[i] >= 0 && A[i] <= 9) {
                            createdStrFromArray = createdStrFromArray + A[i];// create string from element of array
                        }
                    } else {
                        return null;
                    }
                } else {
                    createdStrFromArray = createdStrFromArray + A[0];
                }
            }
            // created string from above loop should have size of array input
            // (size==n.length)
            // and if this size is greater or equal to than 10 ,
            // we can not take Integer value of this string(we know max value for integer
            // is 2,147,483,647) that has the length
            // so we take long value of this.
            if (K >= 0 && K <= 10000) {
                if (size >= 10) {
                    System.out.println("size>=10 " + size + "    " + createdStrFromArray.length());
                    int index = 0;
                    for (int x = 1; x <= createdStrFromArray.length(); x++) {
                        lastStr = lastStr + Integer.valueOf(createdStrFromArray.substring(index, x));
                        index++;
                    }
                    System.out.println(lastStr);
                    BigInteger bd = new BigInteger(lastStr);
                    bd = bd.add(new BigInteger(String.valueOf(K)));
                    lastStr = String.valueOf(bd);
                    System.out.println(lastStr);
                } else {
                    lastStr = String.valueOf(Integer.parseInt(createdStrFromArray) + K);
                }
            } else {
                lastStr = createdStrFromArray;
            }
        } else
            return null;

        return makeListFromString(lastStr);
    }

    public static List<Integer> makeListFromString(String str) {
        List<Integer> list = new ArrayList<Integer>();
        int leng = str.length();
        int i = 0, j = 1;
        for (int s = 0; s < leng; s++) {
            list.add(Integer.valueOf(str.substring(i, j)));
            i++;
            j++;
        }
        return list;
    }
}
