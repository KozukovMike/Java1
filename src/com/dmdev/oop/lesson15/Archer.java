package com.dmdev.oop.lesson15;

public class Archer extends Hero {

    public Archer(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(5);
        System.out.println("Лучник " + getName() + " выстрелил");
    }
}
