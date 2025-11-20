import java.util.Scanner;

// Abstract base class
abstract class Number {
    protected double value;

    Number(double value) {
        this.value = value;
    }

    abstract void displayNum();
}

// Utility functions for converting fractional numbers
class Converter {

    // Convert full number to hexadecimal (integer + fractional)
    static String toHex(double num) {
        int intPart = (int) num;
        double fracPart = num - intPart;

        String hexInt = Integer.toHexString(intPart).toUpperCase();
        StringBuilder hexFrac = new StringBuilder();

        // Convert fractional part (6 digits)
        for (int i = 0; i < 6; i++) {
            fracPart *= 16;
            int digit = (int) fracPart;
            hexFrac.append(Integer.toHexString(digit).toUpperCase());
            fracPart -= digit;
        }

        return hexInt + "." + hexFrac.toString();
    }

    // Convert full number to octal (integer + fractional)
    static String toOctal(double num) {
        int intPart = (int) num;
        double fracPart = num - intPart;

        String octInt = Integer.toOctalString(intPart);
        StringBuilder octFrac = new StringBuilder();

        // Convert fractional part (6 digits)
        for (int i = 0; i < 6; i++) {
            fracPart *= 8;
            int digit = (int) fracPart;
            octFrac.append(Integer.toOctalString(digit));
            fracPart -= digit;
        }

        return octInt + "." + octFrac.toString();
    }
}

// Hex subclass
class HexNum extends Number {

    HexNum(double value) {
        super(value);
    }

    @Override
    void displayNum() {
        System.out.println("Hexadecimal: " + Converter.toHex(value));
    }
}

// Octal subclass
class OctalNum extends Number {

    OctalNum(double value) {
        super(value);
    }

    @Override
    void displayNum() {
        System.out.println("Octal: " + Converter.toOctal(value));
    }
}

public class asg8bfrac {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a fractional number: ");
        double input = sc.nextDouble();

        Number ref;

        ref = new HexNum(input);
        ref.displayNum();

        ref = new OctalNum(input);
        ref.displayNum();

        sc.close();
    }
}
