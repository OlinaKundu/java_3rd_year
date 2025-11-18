//A. Create a class Room which will store width, 
//height and breadth of the room in three variables.
// Create another class Roomdemo which will use earlier class,
// create instances of rooms, set the values of variables and 
//would calculate volume of the rooms.
class Room {
    double width;
    double height;
    double breadth;

    void dim(double w, double h, double b){
        width=w;
        height=h;
        breadth=b;
       
    }
    double volume(){
        return width * height * breadth;
    }
}

public class assg7a{
    public static void main(String args[]){
        Room room1=new Room();
        Room room2 = new Room();
        room1.dim(452,646,236);
        room2.dim(4984,2236,222);

        System.out.println("Volume of room1 is:" + room1.volume());
        System.out.println("Volume of room 2 is:" + room2.volume());
    }
}