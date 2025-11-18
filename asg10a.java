/*Create two threads. One will print from 1 to 10. Another will print 10 to 1.
 In the second thread if value is 6 it will sleep for 10000 milliseconds. */
class thread1 extends Thread{
    public void run(){
        for(int i=0;i<=10;i++){
            System.out.println("Thread 1 prints: " + i);
        }
    }
}
class thread2 extends Thread{
    public void run(){
        for(int i=10;i>=1;i--){
            System.out.println("Thread 2 prints: " + i);
            if(i==6){
                try{
                    Thread.sleep(100000);
                }
                catch(InterruptedException e){
                    System.out.println(e);
                }
            }
        }
    }
}
 public class asg10a {
    public static void main(String args[]){
        thread1 t1=new thread1();
        thread2 t2=new thread2();
        t1.start();
        t2.start();
    }
}
