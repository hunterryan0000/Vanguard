import java.util.*;

import static java.util.stream.Collectors.joining;

public class PlusMinus {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        float pos = 0f;
        float neg = 0f;
        float zero = 0f;

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) >= 1){
                pos += (1f/arr.size());
            } if (arr.get(i) < 0){
                neg += (1f/arr.size());
            } if (arr.get(i) == 0){
                zero += (1f/arr.size());
            }
        } System.out.format("%.6f" + "\n", pos);
        System.out.format("%.6f" + "\n", neg);
        System.out.format("%.6f", zero);
        // System.out.println(pos + "\n" + neg + "\n" + zero );

    }

    public static void main(String[] args) {
       List<Integer> arr = new ArrayList<>(List.of
                (-4, 3, -9, 0, 4, 1));

        PlusMinus.plusMinus(arr);
    }
}

