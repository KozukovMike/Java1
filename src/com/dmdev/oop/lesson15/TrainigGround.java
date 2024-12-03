package com.dmdev.oop.lesson15;

public class TrainigGround {

    public static void main(String[] args) {
        Warrior warrior = new Warrior("Vovik");
        Archer archer = new Archer("Mike");
        Mage mage = new Mage("Alex");
        Enemy enemy = new Enemy(110);
        warrior.attackEnemy(enemy);
        System.out.println(enemy.getHealth());
        archer.attackEnemy(enemy);
        System.out.println(enemy.getHealth());
        mage.attackEnemy(enemy);
        System.out.println(enemy.getHealth());
        System.out.println(enemy.isAlive());
    }
}
