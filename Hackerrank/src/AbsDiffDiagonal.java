import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class AbsDiffDiagonal {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Initialize Both diagonal sum values by zero.
        int left2r = 0, right2l = 0, n = arr.size();

        for (int i = 0; i < n; i++) {
            left2r += arr.get(i).get(i);
            // the left to right diagonal sum is calculated in left2r variable by running a simple loop till .size()
            // of the list arr left2r += arr.get(i).get(i); e: 0+1+2
            right2l += arr.get(i).get(n - (1 + i));
            // Similarly, the right2l is calculated in the same loop by right2l += arr.get(i).get(arr.size() - (1 + i));
            // e: 2+1+0
        }
        return Math.abs(left2r - right2l);
        // the absolute difference between the sums of its diagonals
    }


    public static void main(String[] args) {

        List<List<Integer>> lists = new ArrayList<>(List.of( // initialize lists and add
                new ArrayList<>(List.of(11, 2, 4)),
                new ArrayList<>(List.of(4, 5, 6)),
                new ArrayList<>(List.of(10, 8, -12))
        ));
        System.out.println(diagonalDifference(lists));// = 15

    }
}
