import java.util.Scanner;

abstract class shape1{
    double base;
    double height;

    public abstract void accept();
    public abstract void comput_area();
    public abstract void display();


}


class Triangle extends shape1{
    double area;

    public void accept(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the dimension of triangle base");
         base =sc.nextDouble();
        System.out.println("enter the dimension of triangle height");
         height =sc.nextDouble();

    }

    public void comput_area(){
        
        
        area=(this.base*this.height)/2;
    }
    public void display(){
        System.out.println("the area of the triangle"+this.area);
    }
}



class Rectangle extends shape1{
    double area;

    public void accept(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the dimension of rectangle base");
        double base =sc.nextDouble();
        System.out.println("enter the dimension of rectangle height");
        double height =sc.nextDouble();

    }

    public void comput_area(){
        
        
        area=(this.base*this.height);
    }
    public void display(){
        System.out.println("the area of the rectangle"+this.area);
    }
}



public class shape {
    public static void main(String[] args) {
        shape1 t =new Triangle();
        shape1 r= new Rectangle();
        Scanner sc =new Scanner(System.in);
        int ans;
        System.out.println("enter the choise");
        ans=sc.nextInt();

        switch(ans){

        case 1:
        t.accept();
        t.comput_area();
        t.display();
        break;

        case 2:
        r.accept();
        r.comput_area();
        r.display();
        break;
        default:
        System.out.println("invalid choise");
        }
    }
    
}
