/*Create a class with 2 instance variables say integer a & integer b. Create a method add that will copy value of
instance variables into some local variables c & d. Then the method will sleep for 0.5 seconds, add their values (a
& b) and print it. Create another method increase that will increase the value of a & b by 5 each, wait for 0.5
seconds and print their values. Create two different threads to perform these 2 tasks, invoke the add thread first. */

class Class{
    int a,b;
    Class(int a, int b){
        this.a=a;
        this.b=b;
    }
    public void add(){
        int c=a;
        int d=b;

        try{
            Thread.sleep(500);
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
        int sum = c +d;
        System.out.println("Sum of a and b is: " + sum);

    }
    //method to increase a and b 
    public void increase(){
        a+=5;
        b+=5;
        try{
            Thread.sleep(500);

        }catch(InterruptedException e){
            System.out.println(e);
        }
        System.out.println("Increased values of a and b :" + a + " "  + b) ;
    }
}

class AddThreads extends Thread{
    Class obj;
    AddThreads(Class obj){
        this.obj=obj;
    }
    public void run(){
        obj.add();
    }
}

class Increase extends Thread{
    Class obj;
    Increase(Class obj){
        this.obj=obj;
    }
    public void run(){
        obj.increase();
    }
}

public class asg10b {
    public static void main(String[] args){
        Class obj=new Class(10,20);
        Thread t1=new AddThreads(obj);
        Thread t2=new Increase (obj);

        t1.start();
        t2.start();
    }
}