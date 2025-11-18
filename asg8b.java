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
