package Robot;

import java.util.Scanner;

public class VolcanoApplication {
    public static void main(String[] arguments) {
        VolcanoRobot robot = new VolcanoRobot();
        System.out.println("Whats the name of your robot?");
        Scanner name = new Scanner(System.in);
        String nameInput = name.nextLine();
        robot.name = nameInput;
        System.out.println("Where is your robot exploring?");
        Scanner location = new Scanner(System.in);
        String locationInput = location.nextLine();
        robot.location = locationInput;
        robot.status = "Exploring";
        robot.speed = 2;
        System.out.println("Whats the temp of where your robot is exploring?");
        Scanner temp = new Scanner(System.in);
        float tempInput = temp.nextFloat();
        robot.temperature = tempInput;
        robot.showAttributes();

        System.out.println("Oh no there is trouble ahead. Should your robot run or continue (please only write those two responses)");
        Scanner reaction = new Scanner(System.in);
        String action = reaction.nextLine();
        System.out.println(action);
        if (action.equals("run")){
            robot.speed = 5;
            robot.status = "Returning home";
        } else {
            robot.speed = 0;
            robot.status = "Destroyed";
        }

        robot.showAttributes();

    }
}
