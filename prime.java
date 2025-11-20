/*Write a java program to generate all Prime Numbers within a range, where range is user input. */
import java.util.Scanner;
public class prime {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the start range: ");
        int start=sc.nextInt();
        System.out.println("Enter the end range: ");
        int end=sc.nextInt();
        System.out.println("prime numbers between "+start+"and " + end);
        for(int num=start;num<=end;num++){
            if(isPrime(num)){
                System.out.println(num + "Prime");
            }
        }
        sc.close();
    }
    public static boolean isPrime(int n){
        if(n<=1) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0)return false;
        }
        return true;
    }
}
