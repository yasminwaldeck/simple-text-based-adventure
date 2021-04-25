import java.util.Scanner;

public class Death {

    public void rd(String text){
        System.out.println(text);
        try {
            Thread.sleep(2000);
        } catch(InterruptedException ex) {
        }
    }

    public void rip(){
        Scenarios sc = new Scenarios();
        Scanner in = new Scanner(System.in);
        rd("Rest in peace, adventurer.");
        System.exit(0);
    }


    public void ropeDeath(){
        rd("A hole opens underneath you.");
        rd("You fall into it and are surrounded by ropes.");
        rd("Wait...");
        rd("Ropes don't move...");
        rd("Those are snakes!!!");
        rd("They bite you and you die.");
        rip();
    }

    public void orkDeath(){
        rd("The ork pulls you near and you smell it's horrible breath.");
        rd("You try to free yourself, but the ork is stronger.");
        rip();
    }


}
