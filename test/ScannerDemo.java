import java.util.*;
import java.io.*;
public class ScannerDemo {
    public static void main(String args[]){
         Scanner input = null;
        Scanner inputS=new Scanner(System.in);
        try {
              input=new Scanner(new File("clients.txt"));
        } catch (FileNotFoundException ex) {
            System.err.println("file not found");;
        }
        
        String s1,s2;
        
        System.out.println("please enter the id :-");
        s1=inputS.nextLine();
        
        s2=String.valueOf(input.nextInt());
       
        while(input.hasNext()){
            if(s2.equals(s1)){
                System.out.println("found");
                System.exit(0);
            }
            System.out.println("in loop");
            input.nextLine();
            s2=String.valueOf(input.nextInt());
            
        }
        System.out.println("not found");
    }
    
}
