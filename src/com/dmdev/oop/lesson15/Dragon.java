package com.dmdev.oop.lesson15;

public class Dragon extends Enemy {

    public Dragon(int health) {
        super(health);
    }

    @Override
    public void attackHero(Hero hero) {
        hero.setHealth(hero.getHealth() - 14);
    }

}
