package com.dmdev.oop.lesson15;

public class Warrior extends Hero {

    public Warrior(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(8);
        System.out.println("Воин " + getName() + " ударил дубиной");
    }
}
