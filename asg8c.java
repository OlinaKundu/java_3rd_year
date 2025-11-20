/*Create an abstract base class called called “2Dfigure” that holds two dimensions of a figure. It also declares an
abstract function called calculateArea() that when overridden by derived classes returns the area of type 2Dfigure
defined by the derived class. Create two derived classes “Rectangle” and “Triangle” that inherit “2Dfigure”. Write
a main() function to create object of these classes and display the area of rectangle and triangle.(Use base class
reference to call a function). */
abstract class twoDfigure{
    int a,b;
    twoDfigure(int a, int b){
        this.a=a;
        this.b=b;
    }
    public abstract void calculateArea();
}
class Rectangle extends twoDfigure{
    Rectangle(int a, int b){
        super(a,b);
    }
    public void calculateArea(){
        int area=a*b;
        System.out.println("Area of teh rectangle is:"+ area);
    }
}

class Triangle extends twoDfigure{
    Triangle(int a, int b){
        super(a,b);
    }
    public void calculateArea(){
        double area=0.5 * a *b;
        System.out.println("Area of the triangle:"+area);
    }
    
}
public class asg8c {
    public static void main(String[] args){
        twoDfigure obj=new Rectangle(45,75);
        twoDfigure ob=new Triangle(12,54);

        obj.calculateArea();
        ob.calculateArea();
    }
}
