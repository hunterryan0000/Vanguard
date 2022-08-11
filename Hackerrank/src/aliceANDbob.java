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

    public class aliceANDbob {

        /*
         * Complete the 'compareTriplets' function below.
         *
         * The function is expected to return an INTEGER_ARRAY.
         * The function accepts following parameters:
         *  1. INTEGER_ARRAY a
         *  2. INTEGER_ARRAY b
         */

        public List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
            List<Integer> c = Arrays.asList(0,0);

            for(int i=0;i<3;i++)
            {
                if(a.get(i)<b.get(i))
                    c.set(1,c.get(1)+1);
                else if(a.get(i)>b.get(i))
                    c.set(0,c.get(0)+1);
            }
            return c;

        }

        public static void main(String[] args) {
        aliceANDbob aliceANDbob = new aliceANDbob();
            List<Integer> a = Arrays.asList(1,2,3);
            List<Integer> b = Arrays.asList(3,2,1);
            System.out.println(aliceANDbob.compareTriplets(a,b));
        }
    }
