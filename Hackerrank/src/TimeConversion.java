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

public class TimeConversion {

        /*
         * Complete the 'timeConversion' function below.
         *
         * The function is expected to return a STRING.
         * The function accepts STRING s as parameter.
         */

        public static String timeConversion(String s) {
            int hour = Integer.parseInt(s.substring(0,2));
            if ( s.endsWith("AM") && hour == 12 )
                hour = 0;
            else if (s.endsWith("PM") && hour < 12 ) {
                hour += 12;
            }
            return String.format("%02d%s", hour,s.substring(2, s.length() - 2));
        }

        public static void main(String[] args) {
            System.out.println(timeConversion("07:05:45PM"));
        }
    }
