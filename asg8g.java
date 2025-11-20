/*Write a Java program in which interface is given by name MeanInterface. Method mean() is defined in this
interface that calculates the mean of the given numbers arranged in an array. This interface is then extended and
the method is defined in this interface that calculates the deviation from the mean value evaluated for each of the
numbers. */
// Base Interface
import java.util.Scanner;

// Base Interface
interface MeanInterface {
    double mean(int[] arr);
}

// Extended Interface
interface DeviationInterface extends MeanInterface {
    void deviation(int[] arr);
}

// Implementing Class
class MeanDeviation implements DeviationInterface {

    // Method to calculate mean
    public double mean(int[] arr) {
        double sum = 0;
        for (int x : arr) {
            sum += x;
        }
        return sum / arr.length;
    }

    // Method to calculate deviation for each element
    public void deviation(int[] arr) {
        double m = mean(arr);
        System.out.println("\nMean = " + m);

        System.out.println("Deviation of each element from mean:");
        for (int x : arr) {
            System.out.println(x + " → " + (x - m));
        }
    }
}

// Main Class
public class asg8g {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        MeanDeviation md = new MeanDeviation();
        md.deviation(arr);
    }
}
