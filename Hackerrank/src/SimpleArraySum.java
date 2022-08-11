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

class SimpleArraySum {

    /*
     * Complete the 'simpleArraySum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY ar as parameter.
     */

    public int simpleArraySum(List<Integer> ar) {
        int y = 0;
        for (int i = 0; i < ar.size(); i++) {
            y += ar.get(i);
        }return y;

    }


    public static void main(String[] args) {
        SimpleArraySum simpleArraySum = new SimpleArraySum();
        List<Integer> ar = Arrays.asList(1, 5, 8);
        System.out.println(simpleArraySum.simpleArraySum(ar));
    }
}

