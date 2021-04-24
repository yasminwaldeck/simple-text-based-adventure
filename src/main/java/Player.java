public class Player {

    private int xp;
    private int level;
    private int hp;
    private int maxHP;
    private int luck;

    public Player(){
        xp = 0;
        level = 1;
        hp = 5;
        maxHP = 5;
        luck = 0.5;
    }

    public int getXP(){
        return xp;
    }

    public int getLevel(){
        return level;
    }

    public int getHP(){
        return hp;
    }

    public int getMaxHP(){
        return maxHP;
    }

    public int getLuck(){
        return luck;
    }

    public boolean isDead(){
        return hp <= 0;
    }

}
