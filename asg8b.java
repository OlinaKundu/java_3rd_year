/*Write a program that creates a base class called “Number”. This class holds an integer value and contains an
abstract method called displayNum(). Create two derived classes called “HexNum” and “OctalNum” that inherit
“Number”. Override displayNum() in the derived classes so that it displays the value in Hexadecimal and Octal
respectively. Write a main() function to create objects of type “HexNum” and “OctalNum” classes and display
the hexadecimal and octal form of supplied integer value. (Use base class reference to call a function). */
abstract class Number{
    int n;
    public Number(int n){
        this.n=n;
    }
    public abstract void displayNum();
}
class HexNum extends Number{
    public HexNum(int n){
        super(n);
    }
    @Override
    public void displayNum(){
        System.out.println("Hexadecimal number: " + Integer.toHexString(n));
    }
}
class OctalNum extends Number{
    public OctalNum(int n){
        super(n);
    }
    @Override
    public void displayNum(){
        System.out.println("Octal number" + Integer.toOctalString(n));
    }
}

public class asg8b {
    public static void main(String args[]){
        HexNum obj=new HexNum(12245);
        OctalNum ob=new OctalNum(45);
        obj.displayNum();
        ob.displayNum();
    }
}

/*
String hex = "";
int val = n;
char hexDigits[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
if (val == 0) hex = "0";
else {
    while (val > 0) {
        int rem = val % 16;
        hex = hexDigits[rem] + hex;
        val /= 16;
    }
}
System.out.println("Hex value: " + hex); 


String oct = "";
val = n; // reset val to original number
char octDigits[] = {'0', '1', '2', '3', '4', '5', '6', '7'};

if (val == 0) {
    oct = "0";
} else {
    while (val > 0) {
        int rem = val % 8;
        oct = octDigits[rem] + oct;  // prepend the digit
        val /= 8;
            }
        }*/