package com.company;

public abstract class Person {
    protected float hp, damage;
    protected int lvl, vAtt, chanceMiss = 1;
    String className;

    Person(String className, float hp, float damage, int lvl, int vAtt){
        this.className = className;
        this.hp = hp;
        this.damage = damage;
        this.lvl = lvl;
        this.vAtt = vAtt;
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
