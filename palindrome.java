/*Write a java program to reverse a number and check whether it is a Palindrome. */
import java.util.Scanner;
public class palindrome {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        int original = n;
        int reverse =0;
        while(n>0){
            int digit=n%10;
            reverse=reverse *10 +digit;
            n=n/10;
        }
        System.out.println(reverse + " is the reverse of " + original);

        if(original==reverse){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not palindrome");
        }
        sc.close();
    }
}
