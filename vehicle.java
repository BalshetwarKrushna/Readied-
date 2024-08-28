package ranjit;

interface vehicle1{
	void gearchange();
	void speedup();
	void brake();
}

class Bicycle implements vehicle1{
	public void gearchange() {
		System.out.println("no gear");
	}
	
	public void speedup() {
		System.out.println("speed of bicycle ");
	}	
   public void  brake() {
	   System.out.println("bicycle has two brake");
	
}
}	

class car implements vehicle1{
	public void gearchange() {
		System.out.println(" five gear");
	}
	
	public void speedup() {
		System.out.println("speed of car is high ");
	}	
   public void  brake() {
	   System.out.println(" one brake");
   }
	
}
class bike implements vehicle1{

	public void gearchange() {
		System.out.println(" four gear");
	}
	
	public void speedup() {
		System.out.println(" high speed of bike  is 140");
	}	
   public void  brake() {
	   System.out.println("  brake");
   }
	
	
	
}	
	
	
	
	
public class vehicle {
	public static  void main (String arg[]) {
		vehicle1 obj=new bike();
		obj.gearchange();
		obj.speedup();
		obj.brake();
		
		vehicle1 obj1=new Bicycle();
		obj1.gearchange();
		obj1.speedup();
		obj1.brake();
	}

}
