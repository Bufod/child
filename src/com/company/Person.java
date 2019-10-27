package com.company;

public abstract class Person {
    protected float hp, damage;
    protected int lvl, vAtt;

    Person(float hp, float damage, int lvl, int vAtt) {
        this.hp = hp;
        this.damage = damage;
        this.lvl = lvl;
        this.vAtt = vAtt;
    }

    abstract void skill(Boss boss);

    float getHp() {
        return this.hp;
    }

    abstract boolean guard();
}
