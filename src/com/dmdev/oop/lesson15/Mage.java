package com.dmdev.oop.lesson15;

public class Mage extends Hero{

    public Mage(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(12);
        System.out.println("Маг " + getName() + " кастанул фаербол");
    }
}
