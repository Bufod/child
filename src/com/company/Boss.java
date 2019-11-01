package com.company;

public class Boss {
    protected float hp, damage;
    protected int lvl, vAtt;
    Boss(float hp, float damage, int lvl, int vAtt){
        this.hp = hp;
        this.damage = damage;
        this.lvl = lvl;
        this.vAtt = vAtt;
    }
    void skill(Person pr){
        System.out.println("Ход босса");
        float res_dmg = (damage*lvl)+vAtt;
        pr.checkDmg(res_dmg);
    }
    void checkDmg(float inDamage){
        this.hp -= inDamage;
        System.out.println("\tОсталось здоровья босса: " + hp);
    }

    public float getHp() {
        return hp;
    }
}
