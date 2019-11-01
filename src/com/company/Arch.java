package com.company;

public class Arch extends Person {

    Arch(String className, float hp, float damage, int lvl, int vAtt) {
        super(className, hp, damage, lvl, vAtt);
    }

    @Override
    void skill(Boss boss) {
        System.out.println("Ход лучника");
        float res_dmg = 0;
        int rnd = 1 + (int)(Math.random()*3);
        switch (rnd){
            case 1:
                System.out.println("\tОгненная стрела ");
                res_dmg = (fireArrow()*lvl)+vAtt;
                break;
            case 2:
                System.out.println("\tЛедяная стрела");
                res_dmg = (frozenArrow()*lvl)+vAtt;
                break;
            case 3:
                System.out.println("\tСупер способность");
                res_dmg = (ult()*lvl)+vAtt;
                break;
        }
        boss.checkDmg(res_dmg);
    }

    float fireArrow(){
        return damage*4;
    }

    float frozenArrow(){
        this.setChanceMiss(20);
        return damage*4;
    }

    float ult(){
        return damage*7;
    }

}
