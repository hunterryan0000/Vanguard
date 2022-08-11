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

class MiniMaxSum {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        long min = 0;
        long max = 0;

        Collections.sort(arr);

        for (int i = 0; i < arr.size()-1; i++) {
            min += arr.get(i);
        }
        for (int i = 1; i < arr.size(); i++) {
            max += arr.get(i);
        }
        System.out.println(min + " " + max);
    }




    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(List.of(256741038, 623958417, 467905213, 714532089, 938071625));

        MiniMaxSum.miniMaxSum(arr);
    }
}

