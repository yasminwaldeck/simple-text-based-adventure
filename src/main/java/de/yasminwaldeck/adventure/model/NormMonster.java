package de.yasminwaldeck.adventure.model;

import de.yasminwaldeck.adventure.model.Monster;

public class NormMonster implements Monster {

        private int level;
        private int hp;

        //Set Up Monsters

        public NormMonster(int lvl) {
            level = lvl;
            hp =  (lvl * 2) - 1;
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
