import java.util.*;

public class AppMain {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Player you = new Player();
        System.out.println("Hello there!");
        System.out.println("What's your name?");
        String name =  in.nextLine();
        you.setName(name);
        System.out.println(you.getName() + ", huh? That is a strange name...");
    }
}
