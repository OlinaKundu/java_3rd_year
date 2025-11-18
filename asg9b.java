/*Create an array of 10 integers and assign an integer in location 15 of the array. Print the appropriate message in
catch block. Considering the same assignment write two catch block one to catch the “Exception” another for
exception “ArrayIndexOutofBoundsException”. In first catch block re-throw the exception caught. In second
catch block print the origin of the exception. */

public class asg9b {
    public static void main(String[] args){
        try{
            int arr[]=new int[10];
            arr[15]=8; //this causes arrayIndexOutOfBoundsException
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bounds exception caught!" + e);
            System.out.println("Origin of the exception caught:");
            e.printStackTrace();
        }
        //catch exception -> prinnt mssg --> rethrow
        catch(Exception e){
            System.out.println("Exception caught in first catch block:" + e);
            throw e; //rethrowing the caught exception
        }
        
        
    }
}
