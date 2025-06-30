package Test.Timertasks;

import java.util.TimerTask;
import java.util.Timer;

public class Main {

    public static void main(String[] args){

        //TimerTask = represent the task that will  be executed by the Timer
        //              You will extend the Timertask class to define your task
        //              Create a sublcass of TimerTask and @override run()



        Timer timer = new Timer();
        TimerTask task = new TimerTask() {

            int count = 3;
            @Override
            public void run() {
                System.out.println("Hello");
                count--;
                if(count <= 0){
                    System.out.println("Task Complete");
                    timer.cancel();
                }
            }
        };

        timer.schedule(task, 3000, 1000);

    }
}
