import java.util.ArrayList;
import java.util.Scanner;

public class Generic{
    static Scanner sc =new Scanner (System.in);
    static int count =0;

       static void check_evenodd(int n){
        if(n%2==0){
          System.out.println(n+"is even number");
        }else{
          System.out.println(n+"is odd number");
        }
       }
      //end
       static void  check_prime_or_not(int n){
        int flag = 0;
        for(int i=2;i<n;i++){
          if(n%2==0){
            flag=1;
          }else {
                flag =0;
          }
        }
          if(flag==1){
            System.out.println(n+"not prime");
          }else{
            System.out.println(n+"prime");
          }

        

        }




        
        static void Number_op(){
          int n;
          Scanner sc =new Scanner (System.in);
          System.out.println("enter number");
          n=sc.nextInt();
          check_evenodd(n);
          check_prime_or_not(n);
        }






       //number operation end


      static void check_pallidrome(String x){
        StringBuilder s1 =new StringBuilder(x);
        if(x.equals(s1.reverse().toString())){
            System.out.println(x+"is a pallidrome");
            count++;
        }else{
            System.out.println(x+"not pallidrome");
        }
      }



    //end
     static void String_op(){
        int n;
        String word;
        System.out.println("enter number of elements");
        n=sc.nextInt();
        ArrayList <String> list= new ArrayList<String>();
        for(int i=0;i<n ;i++){
       System.out.println("enter elements");
            word=sc.next();
            list.add(word);
        }
        for(String w:list){
          check_pallidrome(w);
        }
      //  count=0;
     }

    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.println("choose 1.string 2.number"); 
            int ch=sc.nextInt() ;
            if(ch==1)  {
                String_op();
                
            }else{
                Number_op();
            }
    }
}























