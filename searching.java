import java.net.SocketTimeoutException;
import java.util.*;
public class searching {
    //linear search
    public static int linearsearch(int arr[], int key){
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i] == key)
                return i;
        }
        return -1;
    }

    //binary search
    public static int binarysearch(int arr[], int key){
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=(left +right)/2;

            if(arr[mid] == key) return mid;
            else if(key<arr[mid]) right = mid -1;
            else
                left =mid +1;
        }
        return -1;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter number of elements: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements :");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("\n--- Search Menu ---");
        System.out.println("1. Linear Search");
        System.out.println("2. Binary Search");
        System.out.print("Enter your choice: ");
        int choice=sc.nextInt();

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        int result=-1;
         switch (choice) {
            case 1:
                result = linearsearch(arr, key);
                break;

            case 2:
                result = binarysearch(arr, key);
                break;

            default:
                System.out.println("Invalid choice!");
                return;
        }

        if (result == -1)
            System.out.println("Element not found.");
        else
            System.out.println("Element found at index: " + result);
    }
}
        
    
