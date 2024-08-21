

abstract class Employee2 {
    abstract void get_salary();
    abstract void work();

    
}


class HR extends  Employee2{
    void get_salary(){
        System.out.println("salary of hr is 50000/- ");
    }
    void work(){
        System.out.println("work as an hr manager");
    }
       public  void add(){
        System.out.println("new addded employee name is abc");
    }
    public static void main(String[] args) {
        HR emp =new HR();
        emp.work();
        emp.get_salary();
        emp.add();

    }
}
