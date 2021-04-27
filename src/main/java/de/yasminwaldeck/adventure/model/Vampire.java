package de.yasminwaldeck.adventure.model;

import de.yasminwaldeck.adventure.model.Monster;

public class Vampire implements Monster {

        private int level;
        private int hp;

        //Set Up Monsters

        public Vampire(int lvl) {
            level = lvl;
            hp =  lvl * 3;
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

