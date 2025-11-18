/*Create a superclass Mathexception and two subclasses Overflowexception and UnderflowException. Write a code
segment that throws an Overflowexception. Write three catch block one for Mathexception and others are for
Overflowexception and UnderflowException. In first catch block re-throw the exception caught in other two catch
blocks, write appropriate message to handle it and show the results. Instantiate an integer variable and initialize
with some value. If the value is greater than 100 an OverFlowException is thrown otherwise an
UnderFlowException is thrown, handle the exception with appropriate message. */

import java.util.Scanner;

class Mathexception extends Exception{
    public Mathexception(String msg){
        System.out.println("Math Exception:" + msg);
    }
}
class Overflowexception extends Mathexception{
    public Overflowexception(String msg){
        super(msg);
        System.out.println("Overflow exception:"+msg);
    }
}
class Underflowexception extends Mathexception{
    public Underflowexception(String msg){
        super(msg);
        System.out.println("Underflow exception:"+ msg);
    }
}

public class asg9d{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a value of an integer:");
        int n=sc.nextInt();
        try{
            if(n>100){
                try{
                    throw new Overflowexception("The given number is greater than 100");
                }
                catch(Overflowexception e1){
                    throw e1;
                }
                
            }else{
                try{
                    throw new Underflowexception("The given number is lesser than 100");
                }
                catch(Underflowexception e2){
                    throw e2;
                }
            }
        }
        catch(Exception e){
            System.out.println("Exception: " + e);
        }
        sc.close();
    }
    
}