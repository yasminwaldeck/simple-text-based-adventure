package de.yasminwaldeck.adventure.model;

public class Player {


    // Set Up


    private int xp;
    private int level;
    private int hp;
    private int maxHP;
    private int luck;
    private String name;

    public Player(){
        xp = 0;
        level = 1;
        hp = 5;
        maxHP = 5;
        luck = 50;
        name = "undefined";
    }

    //Set & Get

    public int getXP(){
        return xp;
    }

    public void setXP(int n){
        xp = n;
    }

    public int getLevel(){
        return level;
    }

    public void setLevel(int n){
        level = n;
    }


    public int getHP(){
        return hp;
    }

    public void setHP(int n){
        hp = n;
    }


    public int getMaxHP(){
        return maxHP;
    }

    public void setMaxHP(int n){
        maxHP = n;
    }


    public int getLuck(){
        return luck;
    }

    public void setLuck(int n){
        luck = n;
    }

    public String getName(){
        return name;
    }

    public void setName(String input){
        name = input;
    }

    //Other helpers

    public boolean isDead(){
        return hp <= 0;
    }

}
