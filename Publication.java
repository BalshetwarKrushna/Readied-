import java.util.Scanner;

 class Publication {
    String title;
    int copies;
    int price;
    

 void accept(){
Scanner sc=new Scanner(System.in);

System.out.println("enter name of publication");
    String title= sc.nextLine();
    System.out.println("enter no of copies");
    int copies =sc.nextInt();
    System.out.println("enter price");
    int price =sc.nextInt();
}

  void display(){

System.out.println("name of publictaon"+title);
System.out.println ("no of copies"+copies);
System.out.println("price of the book"+price);
  
  
}


}



class book extends Publication{

private String author;

int total;

      void orderdcopies(){
    Scanner sc =new Scanner(System.in);
System.out.println("enter name of the author");
     String author=sc.nextLine();
     System.out.println("no of copies ordred");
     int total=sc.nextInt();


      }

      void remain(){

System.out.println("the total sale of publication"+total);
System.out.println("stock remaining"+(this.copies-total));


      }


    }


    class magzine extends Publication{
   int quantity;


      void orderquantity(){
Scanner sc= new Scanner(System.in);

      System.out.println("enter no of copies ordred");
      int quantity=sc.nextInt();


      }


      void currentissue(){

          System.out.println( "current issued book"+super. title);


      }

      void recieveissue(){
        System.out.println("recived issue book"+super.title);
        System.out.println("no of copies"+this.quantity);
      }


      void  salecopy(){
        Scanner sc= new Scanner(System.in);
         int orders =sc.nextInt();
        System.out.println("total magzine"+this.title+"sold"+orders);

      }

    }



public class Publication{

public static void main(String[] args) {
    publication p= new publication();
    System.out.println("enter publication details");
    p.accept();
    System.out.println("displaying details of publication");
    p.display();
    
    Book b=new Book();
    b.accept();
    b.orderdcopies();
    b.display();
    b.remain();


    magzine m=new magzine();
    m.accept();
    m.orderdcopies();
    m.orderdquantity();
    m.display();
    m.currentissue();
    m.reciveissue();
    
}




}








