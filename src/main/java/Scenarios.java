import de.yasminwaldeck.adventure.model.Player;

import java.util.Scanner;

public class Scenarios {


    private Scanner in = new Scanner(System.in);
    private Player you = new Player();
    private Death death = new Death();

public void rd(String text){
    System.out.println(text);
    try {
        Thread.sleep(1000);
    } catch(InterruptedException ex) {
    }
}
    public void scenario1() {
        rd("You wake up. Someone is knocking on the door. What do you do?");

        System.out.println("a. Open the door.");
        System.out.println("b. Hide in bed.");
        switch (in.nextLine()) {
            case "a" -> greeting();
            case "b" -> continueKnocking();
            default -> {
                rd("That is not an option, idiot. Try again.");
                scenario1();
            }
        }
    }

    public void greeting(){

        rd("\"Hello there!\"");
        rd("\"What's your name?\"");
        String name =  in.nextLine();
        you.setName(name);
        rd("\"" + you.getName() + ", huh? That is a strange name...\"");
        death.ropeDeath();
    }

    public void continueKnocking(){

        rd("They continue knocking. What do you do?");
        System.out.println("a. Open the door.");
        System.out.println("b. Hide in bed.");
        switch (in.nextLine()) {
            case "a" -> greeting();
            case "b" -> continueKnocking();
            default -> {
                rd("That is not an option, idiot. Try again.");
                scenario1();
            }
        }
    }

}
