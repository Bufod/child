package com.company;

import java.util.Scanner;

public abstract class Person {
    protected float hp, damage;
    protected int lvl, vAtt, chanceMiss = 1;
    String className;

    Person(String className){
        this.className = className;
        System.out.println("Создание персонажа " + className + ":");
        System.out.println("\tВведите количество здоровья:");
        Scanner in = new Scanner(System.in);
        this.hp = in.nextFloat();
        System.out.println("\tВведите количество наносимого урона:");
        this.damage = in.nextFloat();
        System.out.println("\tВведите уровень персонажа:");
        this.lvl = in.nextInt();
        System.out.println("\tВведите скорость атаки:");
        this.vAtt = in.nextInt();
    }

    public String getClassName() {
        return className;
    }

    abstract void skill(Boss boss);

    float getHp(){
        return this.hp;
    }

    void checkDmg(float inDamage){
        if(!guard())
            this.hp -= inDamage;
        System.out.println("\tОсталось здоровья: " + hp);
    }

    boolean guard(){
        int rnd = chanceMiss + (int)(Math.random()*(100-chanceMiss+1));
        if (rnd > 50) {
            System.out.println("\tУклонение");
            return true;
        }
        else
            return false;
    }

    public void setChanceMiss(int chanceMiss) {
        this.chanceMiss = chanceMiss;
    }
}
