/*An automorphic number is the number which contained in last digit(s) of its square. Example 25 is an
automorphic number as its square is 625 and 25 is present as the last two digits. Print all automorphic numbers
within range 11 to 40. */
public class asg5b {
    public static void main(String args[]) {
        for (int num = 11; num <= 40; num++) {

            int square = num * num;
            int tempNum = num;
            int tempSquare = square;
            boolean isAuto = true;

            while (tempNum > 0) {
                int digitNum = tempNum % 10;//last digit of the number
                int digitSquare = tempSquare % 10; //last digit of the squared number

                if (digitNum != digitSquare) {
                    isAuto = false;
                    break;
                }

                tempNum /= 10;
                tempSquare /= 10;
            }

            if (isAuto) {
                System.out.println(num + " is Automorphic");
            }
        }
    }
}
