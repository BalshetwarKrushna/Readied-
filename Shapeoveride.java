

import java.util.Scanner;

abstract  class Shapeoveride {  

    abstract double get_perimeter();
    abstract double get_area();
    
}
 class Circle extends Shapeoveride{
    double radius;

    Scanner sc =new Scanner(System.in);
    @Override
    public double get_perimeter(){
        this.radius =sc.nextDouble();
        return (this.radius*2*3.14);
    }

    @Override
    public double get_area(){
        this.radius =sc.nextDouble();
        return (this.radius*2*3.14);
    }
    public static void main(String[] args) {
        Circle n=new Circle();
        n.get_perimeter();
        n.get_area();
        
    }

 }
