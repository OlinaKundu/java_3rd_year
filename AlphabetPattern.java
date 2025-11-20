public class AlphabetPattern {
    public static void main(String[] args) {
        int rows = 5;
        char ch = 'A';

        for (int i = 1; i <= rows; i++) {
            // print leading spaces to center the pyramid
            for (int s = 0; s < rows - i; s++) {
                System.out.print("  "); // two spaces for nicer alignment
            }

            // print i letters separated by a space
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                if (j < i) System.out.print("   "); // space between letters
                ch++;
            }

            System.out.println();
        }
    }
}
