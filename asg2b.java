/*B. Consider the basic pay of an employee as user input. AGP is 50% of the basic pay.
 Company provides 50% DA and 15% HRA on the merged basic (Basic + AGP). 
 Write a java program to calculate and display total salary of the employee.*/
import java.util.Scanner;
public class asg2b{
    public static void main(String args[]){
        System.out.println("Enter the basic pay of the employee:");
        Scanner sc=new Scanner(System.in);
        double basicPay=sc.nextInt();
        double agp=0.5*basicPay;
        double mergedBasic=basicPay+agp;
        double da=0.5*mergedBasic;
        double hra=0.15*mergedBasic;
        double totalSalary=mergedBasic+da+hra;
        System.out.println("The total salary of the employee is: "+totalSalary);

    }
}