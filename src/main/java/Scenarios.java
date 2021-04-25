import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Scenarios {


    private Scanner in = new Scanner(System.in);
    private Player you = new Player();
    private Death death = new Death();


    public void scenario1() {
        System.out.println("You wake up. Someone is knocking on the door. What do you do?");
        System.out.println("a. Open the door.");
        System.out.println("b. Hide in bed.");
        switch (in.nextLine()) {
            case "a" -> greeting();
            case "b" -> continueKnocking();
            default -> {
                System.out.println("That is not an option, idiot. Try again.");
                scenario1();
            }
        }
    }

    public void greeting(){

        System.out.println("\"Hello there!\"");
        System.out.println("\"What's your name?\"");
        String name =  in.nextLine();
        you.setName(name);
        System.out.println("\"" + you.getName() + ", huh? That is a strange name...\"");
        death.ropeDeath();
    }

    public void continueKnocking(){

        System.out.println("They continue knocking. What do you do?");
        System.out.println("a. Open the door.");
        System.out.println("b. Hide in bed.");
        switch (in.nextLine()) {
            case "a" -> greeting();
            case "b" -> continueKnocking();
            default -> {
                System.out.println("That is not an option, idiot. Try again.");
                scenario1();
            }
        }
    }

}
