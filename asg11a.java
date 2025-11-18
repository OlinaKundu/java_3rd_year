/*Create your own package having an interface called addmul with two methods add( ) and show ( ). 
Create three different implementations of that interface to add either 2 integers, or 2 double or 2 strings.
 Create your own method outside the package. */

 //YOU CAN YOU SWITCH CASES TOOOOOOOO
 import java.util.Scanner;
 import MyPackage.addmul;

//Implementation for integers
class A implements addmul{
    int x,y,z;
    A(int x,int y){
        this.x=x;
        this.y=y;
    }
    public void add(){
        z=x+y;
    }
    public void show(){
        System.out.println("Summ of the integres:" + z);
    }
}

//Implement for doubles
class B implements addmul{
    double x,y,z;
    B(double x, double y){
        this.x=x;
        this.y=y;
    }
    public void add(){
        z=x+y;
    }
    public void show(){
        System.out.println("Sum of the doubles are:"+z);
    }
}

class C implements addmul{
    String i,j,k;
    C(String i, String j){
        this.i=i;
        this.j=j;
    }
    public void add(){
        k=i+j;
    }
    public void show(){
        System.out.println("Concatenated the strings:"+k);
    }
}
public class asg11a {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two integers:");
        int m=sc.nextInt();
        int n=sc.nextInt();
        A obj1=new A(m,n);
        obj1.add();
        obj1.show();

        System.out.println("Enter the two doubles:");
        double v=sc.nextDouble();
        double w=sc.nextDouble();
        B obj2 = new B(v, w);
        obj2.add();
        obj2.show();

        System.out.println("Enter the two strings:");
        String s=sc.nextLine();
        String t=sc.nextLine();
        C obj3 =new C(s,t);
        obj3.add();
        obj3.show();
        sc.close();
    }
}
