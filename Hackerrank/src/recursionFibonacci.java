public class recursionFibonacci {
        public static int fibonacci_numbers(int n)
        {
            if(n == 0){
                return 0;
            }
            else if(n == 1){
                return 1;
            }
            else{
                return fibonacci_numbers(n-2) + fibonacci_numbers(n-1);
            }
        }
        public static void main (String[] args) {
            int n = 9;
            for(int i = 0; i < n; i++){
                System.out.print(fibonacci_numbers(i)+ " ");
                //prints 0 1 1 2 3 5 8 13 21
            }

        }
}

class recursionFibOutputOnly {
    static int fib(int n)
    {
        if (n <= 1)
            return n;
        return fib(n-1) + fib(n-2);
    }

    public static void main (String args[])
    {
        int n = 9;
        System.out.println(fib(n));
        //prints 34
    }
}
