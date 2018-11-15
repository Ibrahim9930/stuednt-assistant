package fileprocessingdemo;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.*;
public class FileProcessingDemo {

    
    public static void main(String[] args) {
        
            Scanner inputs=new Scanner(System.in);
            PrintWriter output = null;
            BufferedReader input=null;
            String s,s2,ln="h";
            int x = 0,i=0;
            System.out.println("enter the id :-");
            s=inputs.nextLine();
            char c1[]=s.toCharArray();
            char c2[]=new char[c1.length];
            try {
                // output=new PrintWriter(new FileWriter("clients.txt"));
                input=new BufferedReader(new FileReader("clients.txt"));
            } catch (FileNotFoundException ex) {
                Logger.getLogger(FileProcessingDemo.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(FileProcessingDemo.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                x=input.read(c2);
            } catch (IOException ex) {
                Logger.getLogger(FileProcessingDemo.class.getName()).log(Level.SEVERE, null, ex);
            }
            while(ln!=null){
                while(x!=' '){
                    try {
                        x=input.read(c2);
                    } catch (IOException ex) {
                        Logger.getLogger(FileProcessingDemo.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                s2=new String(c2);
                if(s.equals(s2))
                {
                    System.out.println("found");
                    return;
                }
                try {
                    ln=input.readLine();
                } catch (IOException ex) {
                    Logger.getLogger(FileProcessingDemo.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    x=input.read();
                } catch (IOException ex) {
                    Logger.getLogger(FileProcessingDemo.class.getName()).log(Level.SEVERE, null, ex);
                }
                c2="".toCharArray();
            }
            System.out.println("not found");
        } 
    }

