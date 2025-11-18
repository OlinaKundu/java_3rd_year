//Write a java program to swap two variables with and without using third variable.
import java.util.Scanner;
public class asg2a{
    public static void main(String args[]){
        System.out.println("Enter the two numbers to be swapped:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Before swapping: a="+a+",b="+b);
        //swapping with thrid variable
        int c;
        c=a;
        a=b;
        b=c;
        System.out.println("After swapping using third vaariable:a="+a+",b="+b);
        //swapping withut third variable
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping without using third variable: a="+a+",b="+b);
    }
}