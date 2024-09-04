import java.io.*;

public class Filehandling {
    public static void main(String[] args) {
        //create new file
        try {
            File f=new File("new.txt");
            f.createNewFile();  
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
//write in new file
        try {
            FileWriter w=new FileWriter("new.txt");
            w.write("my name is krushna");
            w.close();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        //read file
        try (BufferedReader h=new BufferedReader(new FileReader("new.txt"))){
            while(h.ready()){
                System.out.println(h.readLine());
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    
}
}
