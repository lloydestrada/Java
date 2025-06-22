package MiniEntryProjects.MusicPlayer;
import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        String filePath = "C:\\Users\\iamll\\Self Study\\Java\\Java_MiniEntryProjects\\MiniEntryProjects\\MusicPlayer\\o, kay tagal din kitang minahal.wav";

        File file = new File(filePath);

        try(Scanner scanner = new Scanner(System.in);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)){

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            String response = "";

            while(!response.equals("Q")){

                System.out.println("P = Play");
                System.out.println("S = Stop");
                System.out.println("R = Reset");
                System.out.println("Q = Quit");
                System.out.print("Enter your options: ");

                response = scanner.next().toUpperCase();

                switch (response){

                    case "P" -> clip.start();

                    case "S" -> clip.stop();

                    case "R" -> clip.setMicrosecondPosition(0);

                    case "Q" -> clip.close();
                }
            }
        }
        catch(FileNotFoundException e){
            System.out.println("Could not locate file");
        }

        catch (IOException e) {
            System.out.println("Something went wrong!");

        } catch (UnsupportedAudioFileException e) {
            System.out.println("Audio file is not supported");

        } catch (LineUnavailableException e) {
            System.out.println("Unable access audio resource");
        }

        finally {
            System.out.println("Thanks for listening, Bye!");
        }
    }
}
