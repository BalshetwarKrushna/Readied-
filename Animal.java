

abstract class Animal1 {
    
        
    
    abstract public void Sound();
      
}

class cat extends Animal1{
   public void Sound(){
        System.out.println("cat sound is meow");
    }
}

class Dog extends Animal1{
    public void Sound(){
        System.out.println("dog sound is bhoo bhoo");
    }
}


public class Animal{
    public static void main(String[] args) {
        Dog d=new Dog();
        d.Sound();
        cat c=new cat();
        c.Sound();
    }
}