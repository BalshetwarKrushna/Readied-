package ranjit;

import java.util.Scanner;

   class Format_Exception{
	  
	 Scanner sc =new Scanner(System.in); 
	 Float Division(int num1 ,int num2) {
		 float div=num1/num2;
		 return div;
	 }
	 public void Format_Exception(){
		 try {
			 System.out.println("enter first number");
			String  num1=sc.nextLine();
			System.out.println("enter second number");
			String num2=sc.nextLine();
System.out.println("division of two number"+num1+"and"+num2+"is"+Division(Integer.parseInt(num1),Integer.parseInt(num2)));
				
			}
		 catch( NumberFormatException e ){
			 System.out.println("it is format Exception"+e);
			 
			 
		 }
		 
		 
	 }
	 
	  } 
   class Trycatch1 {
		 public void ArthimaticException() {
		Scanner sc =new Scanner(System.in);
		
			try {
				System.out.println("enter number");
				int a =sc.nextInt();
				int div=a/0;
				System.out.println("value of div is"+div);
			}
			catch(ArithmeticException e) {
				System.out.println("It is arithmatic exception"+e);
				
				
			}
			
			
		}

	}
   public class ArrayException1 {
		public void Array_Index_Bound() {
			try {
				Scanner sc=new Scanner(System.in);
				int []arr= {5,87,98,34,80};
				System.out.println("enter index value");
				int index =sc.nextInt();
				System.out.println( "integer value at index is:"+arr[index] );
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("arrayException is"+e);
			}
			
			
			
		}
		

	}


    
public class Assignment6 {
	public static void main(String args[]) {
		Format_Exception obj1=new Format_Exception();
		obj1.Format_Exception();
		TryCatch1 obj =new TryCatch1();
         obj.ArthimaticException();
         ArrayException1 obj2 = new ArrayException1();
         obj2.Array_Index_Bound();
	}

}
