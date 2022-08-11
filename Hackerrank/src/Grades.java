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

class Grading {

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> curve = new ArrayList<>();

        for (int i = 0; i < grades.size(); i++) {
            if (grades.get(i) <= 37)
                curve.add(grades.get(i));
            else if (grades.get(i) % 5 == 3)
                curve.add(grades.get(i) + 2);
            else if (grades.get(i) % 5 == 4)
                curve.add(grades.get(i) + 1);
            else curve.add(grades.get(i));

        } return curve;

    }


    public static void main(String[] args) {
        List<Integer> grades = new ArrayList<>(List.of(73, 67, 38, 33, 98, 29, 39, 40, 43, 77, 78));

        for (int i = 0; i < grades.size(); i++) {
            int grade = 0;
            grade = gradingStudents(grades).get(i);
            System.out.println(grade);
        }

    }
}

