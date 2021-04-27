package de.yasminwaldeck.adventure.model;

public class Ork {

    private int level;
    private int hp;

    //Set Up Monsters

    public Ork(int lvl) {
        level = lvl;
        hp =  (2*lvl) +1;
    }

    //Set & Get

    public int getLevel(){
        return level;
    }

    public int getHP(){
        return hp;
    }

    public void setHP(int n){
        hp = n;
    }


    //Other helpers

    public boolean isDead(){
        return hp <= 0;
    }

}
