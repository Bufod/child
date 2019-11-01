package com.company;

public class Mage extends Person {

    Mage(String className) {
        super(className);
    }

    @Override
    void skill(Boss boss) {
        System.out.println("Ход мага");
        float res_dmg = 0;
        int rnd = 1 + (int)(Math.random()*3);
        switch (rnd){
            case 1:
                System.out.println("\tОгненный шар");
                res_dmg = (fireBall()*lvl)+vAtt;
                break;
            case 2:
                System.out.println("\tЛедяной шар");
                res_dmg = (frozenBall()*lvl)+vAtt;
                break;
            case 3:
                System.out.println("\tСупер способность");
                res_dmg = (ult()*lvl)+vAtt;
                break;

        }
        boss.checkDmg(res_dmg);
    }

    float fireBall(){
        return damage*2;
    }

    float frozenBall(){
        return damage*6;
    }
    float ult(){
        return damage*10;
    }

}
