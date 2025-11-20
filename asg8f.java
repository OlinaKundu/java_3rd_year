/*Write a Java program where multiple inheritance is achieved through interface. */
interface Interface{
    public abstract void sound();
    public abstract void food();
}
class Dog implements Interface{
    public void sound(){
        System.out.println("I bark!");
    }
    public void food(){
        System.out.println("I eat dog food");
    }
}

class Cat implements Interface{
    public void sound(){
        System.out.println("I meow!");
    }
    public void food(){
        System.out.print("I eat cat food!");
    }
}
public class asg8f {
    public static void main(String args[]){
        Dog pug = new Dog();
        Cat persian= new Cat();

        pug.sound();
        pug.food();

        persian.sound();
        persian.food();
    }
}
