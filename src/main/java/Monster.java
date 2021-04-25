public class Monster {

    private int level;
    private int hp;

    //Set Up Monsters

    public Monster(String type, int lvl) {
        switch (type) {
            case "ork" -> setUpOrk(lvl);
            case "vampire" -> setUpVampire(lvl);
            default -> setUpMonster(lvl);
        }
    }

    public void setUpOrk(int lvl){
        level = lvl;
        hp =  ((lvl + 1) *2);
    }

    public void setUpVampire(int lvl){
        level = lvl;
        hp =  lvl * 3;
    }

    public void setUpMonster(int lvl){
        level = lvl;
        hp =  lvl * 2;
    }


    //Set & Get

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


    //Other helpers

    public boolean isDead(){
        return hp <= 0;
    }



}
