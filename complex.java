
import java.util.*;


class complexno{
    int realpart;
    int imaginarypart;
    int realpart1;
    int imaginarypart1;

    complexno(int i,int j,int k,int l){
        this.realpart=i;
        this.imaginarypart=j;
        this.realpart1=k;
        this.imaginarypart1=l;

    }

void add(){
    System.out.println(" first complex no number"+realpart+"i"+imaginarypart);
    System.out.println("second complex no"+realpart1+"i"+imaginarypart1);
     System.out.println("addition of complex no :"+(realpart+realpart1)+"i"+(imaginarypart+imaginarypart1));
}

}

public class complex {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
     System.out.println("enter first real no");
      int i=sc.nextInt();
      System.out.println("enter first imaginary no");
      int j =sc.nextInt();
      System.out.println("enter second real no");
      int k=sc.nextInt();
      System.out.println("enter second imaginary");
      int l=sc.nextInt();

      complexno n= new complexno(i,j,k,l);
      n.add();

    }
    
}
