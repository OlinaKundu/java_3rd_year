/*Write a Java Program to create an abstract class named Shape that contains two integers and an empty method
named print Area(). Provide three classes named Rectangle, Triangle and Circle such that each one of the classes
extends the class Shape. Each one of the classes contains only the method print Area () that prints the area of the
given shape. */
abstract class Shape{
    int a, b;
    Shape(int a, int b){
        this.a=a;
        this.b=b;
        }
    public abstract void Area();
} 
class Rectangle extends Shape{
    Rectangle(int a,int b){
        super(a,b);
    }

    public void Area(){
        int area=a*b;
        System.out.println("ARea of the rectangle is :"+area);
    }
}
 class Triangle extends Shape{
    Triangle(int a,int b){
        super(a,b);
    }

    public void Area(){
        double area=0.5*a*b;
        System.out.println("ARea of the triangle is :"+area);
    }
}
class Circle extends Shape{
    Circle(int a){
        super(a,a);
    }

    public void Area(){
        double area=a*a*3.14;
        System.out.println("ARea of the rectangle is :"+area);
    }
}
public class asg8e {
    public static void main(String[] args){
        Rectangle x=new Rectangle(45,12);
        Triangle y=new Triangle(12, 32);
        Circle z=new Circle(12);
        x.Area();
        y.Area();
        z.Area();
    }
}
