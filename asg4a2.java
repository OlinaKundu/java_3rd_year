/*find the largest and teh smallest elemnt from he 2D array  */
import java.util.*;

public class asg4a2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows and columns: ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int arr[][] = new int[r][c];
        System.out.println("Enter matrix elements:");

        int largest, smallest;
        largest = smallest = arr[0][0];

        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                arr[i][j] = sc.nextInt();
                if(arr[i][j] > largest) largest = arr[i][j];
                if(arr[i][j] < smallest) smallest = arr[i][j];
            }
        }

        System.out.println("Largest = " + largest);
        System.out.println("Smallest = " + smallest);
    }
}
