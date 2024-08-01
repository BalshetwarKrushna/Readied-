
import java.util.Scanner;
class Employee{
    String name;
    int Empid;
    String address;
    int mobileno;
    float BP;



 Scanner sc =new Scanner(System.in);


void GetEmployeeDetails(){
    System.out.println("enter name of employee");
       name=sc.nextLine();

      System.out.println("enter empid of employee");
       Empid=sc.nextInt();

      sc.nextLine();
      System.out.println("enter addresss of employee");
      String address=sc.nextLine();

      System.out.println("enter mobile no of employee");
       mobileno=sc.nextInt();

    
    
}
   void GeneratePaySlip(){
    float DA,HRA,PF,SCF,Gross_Salary,Net_Salary;
     DA=0.97f*BP;

     HRA=0.10f*BP;
     PF=0.12f*BP;
     SCF=0.001f*BP;
     Gross_Salary=BP+DA+HRA;
     Net_Salary=Gross_Salary-PF-SCF;
      

     System.out.println("*******Employee details*******");
     System.out.println("Name of the EMployee"+name);
     System.out.println("Employeeid"+Empid);
     System.out.println("Employee address"+address);
     System.out.println("employee mobile_no"+mobileno);
     

    System.out.println("*****pay slip*****");
    System.out.println("basic pay"+BP);
    System.out.println("Gross salary"+Gross_Salary);
    System.out.println("net salary "+Net_Salary);



   }
}

    class Programmer extends Employee{
        Scanner sc =new Scanner (System.in);
        void basic_pay(){
            System.out.println("enter basic pay");
        int BP=sc.nextInt();
        }
}

   class TeamLead extends Employee{
    Scanner sc=new Scanner(System.in);
    void basic_pay(){
        System.out.println("enter basic pay");
         BP=sc.nextInt();

    }
   }


    class Assistant_ProjectManager extends Employee{
        Scanner sc =new Scanner (System.in);
        void basic_pay(){
            System.out.println("enter basic pay");
         BP=sc.nextInt();
        }
}

   class ProjectManager extends Employee{
    Scanner sc=new Scanner(System.in);
    void basic_pay(){
        System.out.println("enter basic pay");
         BP=sc.nextFloat();
        
    }
   }

public class Assignment3{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
         int choice;
         do { 
            System.out.println("choose your position");
              choice=sc.nextInt();

              switch(choice){
                case 1:
                Programmer pgrm= new Programmer();
                pgrm.GetEmployeeDetails();
                pgrm.basic_pay();
                pgrm.GeneratePaySlip();
                break;

                case 2:
                TeamLead t1= new TeamLead();
                t1.GetEmployeeDetails();
                t1.basic_pay();
                t1.GeneratePaySlip();
                

                break;
                    
                case 3:
                Assistant_ProjectManager pgrm1= new Assistant_ProjectManager();
                pgrm1.GetEmployeeDetails();
                pgrm1.basic_pay();
                pgrm1.GeneratePaySlip();
                break;

                case 4:
                ProjectManager pgrm2= new ProjectManager();
                pgrm2.GetEmployeeDetails();
                pgrm2.basic_pay();
                pgrm2.GeneratePaySlip();
                break;

                case 5:
                  System.out.println("succesfully executed");
                   break;

                   default:
                          System.out.println("invalid input");

              }

         } while (choice!=5);
    }
}











    
