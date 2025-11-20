/*Develop an abstract class “GeometricObject” which will have two member variables color and weight. It would
have constructor function for setting the color as “White” and weight as “1.0” as default values. The class should
have methods getColor() and getWeight() to return the color and weight values to the caller. The class should
have two abstract methods findArea() and findCircumference(). Write a subclass for “GeometricObject” called
“Triangle” which will able to calculate area and circumference for a triangle. */

abstract class GeometricObject{
    String color;
    double weight;
    GeometricObject(){
        this.color="White";
        this.weight=1.0;
    }
    public String  getColor(){
        return color;
    }
    public double getWeight(){
        return weight;
    }
    public abstract void findArea();
    public abstract void findCircumference();
}

class Triangle extends GeometricObject{
    double a,b,c;
    Triangle(double a, double b, double c){
        super();
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public void findArea(){
        double s=(a+b+c)/2;
        double area= Math.sqrt((s*(s-a)*(s-b)*(s-c)));
        System.out.println("area is:"+area);
    }
    public void findCircumference(){
        double cir=a+b+c;
        System.out.println("Circumference:"+cir);
    }
}
public class asg8d {
    public static void main(String[] args){
        Triangle obj=new Triangle(2,4,3);
        obj.findArea();
        obj.findCircumference();
        System.out.println("Color: " + obj.getColor());
        System.out.println("Weight: " + obj.getWeight());

    }
}
