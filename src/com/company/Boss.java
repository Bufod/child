package com.company;

public class Boss {
    protected float hp, damage;
    protected int lvl, vAtt;

    Boss(float hp, float damage, int lvl, int vAtt) {
        this.hp = hp;
        this.damage = damage;
        this.lvl = lvl;
        this.vAtt = vAtt;
    }

    void skill(Person pr) {
        System.out.println("Ход босса");
        if (!pr.guard())
            pr.hp -= (damage + lvl) * vAtt;
        System.out.println("\tОсталось здоровья мага: " + pr.getHp());
    }

    float getHp() {
        return this.hp;
    }

}
