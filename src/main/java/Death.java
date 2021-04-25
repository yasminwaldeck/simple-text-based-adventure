import java.util.Scanner;

public class Death {


    public void rip(){
        Scenarios sc = new Scenarios();
        Scanner in = new Scanner(System.in);
        System.out.println("Rest in peace, adventurer.");
        System.exit(0);
    }


    public void ropeDeath(){
        System.out.println("A hole opens underneath you.");
        System.out.println("You fall into it and are surrounded by ropes.");
        System.out.println("Wait...");
        System.out.println("Ropes don't move...");
        System.out.println("Those are snakes!!!");
        System.out.println("They bite you and you die.");
        rip();
    }

    public void orkDeath(){
        System.out.println("The ork pulls you near and you smell it's horrible breath.");
        System.out.println("You try to free yourself, but the ork is stronger.");
        rip();
    }


}
