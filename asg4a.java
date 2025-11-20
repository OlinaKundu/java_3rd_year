/*find teh largest and the smallest element frpm  1D array */
import java.util.*;

public class asg4a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter elements:");
        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();

        int largest = arr[0], smallest = arr[0];

        for(int x : arr) {
            if(x > largest) largest = x;
            if(x < smallest) smallest = x;
        }

        System.out.println("Largest = " + largest);
        System.out.println("Smallest = " + smallest);
        sc.close();
    }
}
