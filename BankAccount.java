 class BankAccount {
    double a=1000;
     void deposit(){
        a+=100;
        System.out.println("balance"+a);

     }
     void withdraw(){
        System.out.println("current balance"+a);
     }



    
}
class Saving_accout extends BankAccount{
    void withdraw(){
        if(a<100){
            System.out.println("not sufficient balance");
       
            
        } 

          else{
            a-=100;
            System.out.println("balance "+a);
        }

    }

    public static void main(String[] args) {
        Saving_accout S =new Saving_accout();
        S.withdraw();
    }
    }

