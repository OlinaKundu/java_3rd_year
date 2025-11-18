//Write a code segment in Try block where divide by zero occurs, 
//also write corresponding catch block to catch the
//exception that occurs in the try block. Print the origin of the exception caught.
public class asg9a {
    public static void main(String[] args){
        try{
            int a = 10;
            int b= 0;
            int result=a/b;
            System.out.println("Result:" + result);
        }
        catch(ArithmeticException e){
            System.out.println("Exception caught:" + e);
            System.out.println("Origin of teh exception caught :");
            e.printStackTrace();
        }
        System.out.println("Program continues properly...");
    }
}
