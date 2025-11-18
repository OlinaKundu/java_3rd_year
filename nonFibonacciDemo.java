//"Write a java program to display the first n Non-Fibonacci terms using recursion.
// Create a separate class to define the non-static recursive function Fibo(int n)."
class Fibo{
    int fib(int n){
        if(n<=1) return n;
        return fib(n-1)+fib(n-2);
    }
}

public class nonFibonacciDemo{
    static boolean isFibo(int num, Fibo f){
        int i=0;
        while(true){
            int fibnum=f.fib(i);
            if (fibnum==num) return true;
            if(fibnum>num)return false;
            i++;
        }
    }
    static void printNonFibo(int count, int num, int found, Fibo f){
        if(found==count) return;
        if(!isFibo(num, f)){
            System.out.print(num + " ");
            found++;
        }
       // printNonFibo(int count,int num, int found, Fibo f)
    }
}
