/*Write a java code segments that results a “NullPointerException”.
 Write a necessary catch block to handle the
exception. Also write a finally block with appropriate statements in it. */
public class asg9c {
    public static void main(String args[]){
        try{
            String str=null; //str has no object
            System.out.println(str.length()); //Causes NullPointer Exception
        }
        catch(NullPointerException e){
            System.out.println("Null pointer exception caught: " + e);
            System.out.println("Origin of the exception:");
            e.printStackTrace();
        }
        finally{
            System.out.println("Finally block executed, end of code...");
        }
    }
}
