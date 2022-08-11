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

public class Staircase {

        /*
         * Complete the 'staircase' function below.
         *
         * The function accepts INTEGER n as parameter.
         */

        public static void staircase(int n) {
            for(int i = 0; i< n; i++){
                for(int x = i+1; x < n; x++){
                    System.out.print(" ");
                }
                for(int x = n-(i+1); x < n; x++){
                    System.out.print("#");
                }
                System.out.println();
            }
        }

        public static void main(String[] args) {
           Staircase.staircase(6);
        }
    }