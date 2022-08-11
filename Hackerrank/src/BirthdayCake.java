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

class BirthdayCake {

    /*
     * Complete the 'birthdayCakeCandles' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY candles as parameter.
     */

    public static int birthdayCakeCandles(List<Integer> candles) {
        int count = 0, tallest = 0;

        for (int i = 0; i < candles.size(); i++) {
            int height = candles.get(i);
            if (height > tallest){
                tallest = height;
                count = 1;
            }
            else if (height == tallest)
                count++;
        } return count;
    }

    public static void main(String[] args) {
        List<Integer> candles = new ArrayList<>(List.of(3,4,1,2,4));

        System.out.println(birthdayCakeCandles(candles));
    }
}

