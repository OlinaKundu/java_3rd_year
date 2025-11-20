//"Write a java program to display the first n Non-Fibonacci terms using recursion.
// Create a separate class to define the non-static recursive function Fibo(int n)."
// Class containing non-static recursive Fibonacci function
class Fibo {
    int fib(int n) {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }
}

public class nonFibonacciDemo {

    // Function to check whether a number is Fibonacci
    static boolean isFibo(int num, Fibo f) {
        int i = 0;
        while (true) {
            int fibnum = f.fib(i);

            if (fibnum == num)
                return true;     // number is Fibonacci

            if (fibnum > num)
                return false;    // passed beyond -> not Fibonacci

            i++;
        }
    }

    // Recursive function to print the first 'count' non-Fibonacci numbers
    static void printNonFibo(int count, int num, int found, Fibo f) {
        if (found == count)
            return;   // stop condition

        if (!isFibo(num, f)) {
            System.out.print(num + " ");
            found++;
        }

        // recursive call to next number
        printNonFibo(count, num + 1, found, f);
    }

    public static void main(String[] args) {
        Fibo f = new Fibo();

        int n = 10;   // change this to print more Non-Fibonacci numbers

        System.out.println("First " + n + " Non-Fibonacci numbers:");
        printNonFibo(n, 1, 0, f);   // start checking from number 1
    }
}

