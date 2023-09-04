import java.io.*;
import java.util.Scanner;
public class FileHandling {
    public static void main(String[]args)throws IOException{
        File file = new File("this.txt");
        file.createNewFile();
        FileWriter fileWriter = new FileWriter("this.txt");
        fileWriter.write("My name is Krrish Madaan");
        fileWriter.write("My age is 18.");
        fileWriter.close();
        Scanner sc = new Scanner(file);
        while(sc.hasNextLine()){
            String l = sc.nextLine();
            System.out.println(l);
        }
    }
}


