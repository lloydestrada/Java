package Test.WriteFile;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
public class WriteFile {

    public static void main(String[] args){


        //It creates a file and good for medium text files

        String filePath = "C:\\Users\\iamll\\OneDrive\\Desktop\\Test.txt";
        String textContent = """
                
                Learning java
                Day 12
                HEHEHEHE
                
                """;

        try(FileWriter writer = new FileWriter(filePath)){
            writer.write(textContent);
            System.out.println("File has been written");
        }
        catch (FileNotFoundException e){

            System.out.println("File not have been located");
        }
        catch(IOException e){
            System.out.println("File have not been written");

        }
    }
}
