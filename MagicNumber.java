/*Write a program to check a given number is a magic number or not. A number is said to be a Magic number if the
sum of its digits are calculated till a single digit is obtained by recursively adding the sum of its digits. If the single
digit comes to be 1 then the number is a magic number. Example- 199 is a magic number as 1+9+9=19 but 19 is
not a single digit number so 1+9=10 and then 1+0=1 which is a single digit number and also 1. Hence it is a magic
number. Print all the magic numbers within a given range. */
public class MagicNumber {

    // Function to repeatedly find digit sum until single digit
    public static int digitSum(int n) {
        while (n > 9) {   // keep reducing until we get a single digit
            int sum = 0;
            while (n > 0) {
                sum += n % 10;  // add last digit
                n /= 10;        // remove last digit
            }
            n = sum; // continue with the new number
        }
        return n;
    }

    // Function to check magic number
    public static boolean isMagic(int n) {
        return digitSum(n) == 1;
    }

    public static void main(String[] args) {

        System.out.println("Magic numbers between 1 and 500:");

        for (int num = 1; num <= 500; num++) {
            if (isMagic(num)) {
                System.out.println(num + " is a Magic Number");
            }
        }
    }
}



