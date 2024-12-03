package com.dmdev.oop.lesson15;

public abstract class Enemy
        implements Mortal {

    private int health;

    public Enemy(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void takeDamage(int damage) {
        if (isAlive() && health <= damage) {
            health = 0;
            System.out.println("Вмэр");
        } else {
            this.health -= damage;
            System.out.println("Получил урона: " + damage + "осталось здоровья: " + getHealth());
        }
    }

    abstract void attackHero(Hero hero);

    public boolean isAlive() {
        return health > 0;
    }

}
