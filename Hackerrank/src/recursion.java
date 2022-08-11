public class recursion {
    /**Use recursion to add all of the numbers up to 10.**/
    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);
        //prints 55 == (10 + sum(9)) == 10+9+8+7+6+5+4+3+2+1+0
    }
    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }
}

class Recursion2 {
    /**Use recursion to add all of the numbers between 5 to 10.**/
    public static void main(String[] args) {
        int result = sum(5, 10);
        System.out.println(result);
        //prints 45 == 5+6+7+8+9+10
    }
    public static int sum(int start, int end) {
        if (end > start) {
            return end + sum(start, end - 1);
        } else {
            return end;
        }
    }
}
