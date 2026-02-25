package com.ironhack.IntroToTesting;

public abstract class Player {
    private int health;
    private int strength;
    private int lives;
    private int originalHealth;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public Player(int health, int strength, int lives) {
        this.health = health;
        this.strength = strength;
        this.lives = lives;
        this.originalHealth=health;
    }
    public void decrementLive(){
        lives--;
        if(lives<=0){
            System.out.println("This character is dead");
            health = 0;
        }
        else {
            health = originalHealth;
        }
    }

    public void attack (Player playerToAttack){
        playerToAttack.setHealth(playerToAttack.getHealth()-strength);
    }

    public void checkHealth(){
        if (health<=0){
            decrementLive();
        }
    }
}
