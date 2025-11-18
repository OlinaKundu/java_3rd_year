import java.util.Scanner;
class Hanoi{
    void TOH(int n, String source, String helper, String destination){
        if(n==1){
            System.out.println("Move the disk 1 from " + source + " to " + destination);
            return;
        }
        TOH(n-1,source,destination,helper);
        System.out.println("Move the desk from " + source + " to " + destination);
        TOH(n-1,helper,source,destination);
    }
} 

public class TowerOfHanoi{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of disks:");
        int n=sc.nextInt();
        Hanoi h= new Hanoi();
        h.TOH(n,"A","B","C");
        sc.close();
    }
}
