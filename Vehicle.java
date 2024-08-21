

abstract class Vehicle1 {
   abstract public  void drive();
    
}
class Car extends Vehicle1{
    public void drive(){
        System.out.println("repair the car");
    }

}
public class Vehicle{
    public static void main(String[] args) {
        Car c=new Car();
        c.drive();
    }
}
