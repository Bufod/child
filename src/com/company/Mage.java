package com.company;

import java.util.Random;

public class Mage extends Person {
    Mage(float hp, float damage, int lvl, int vAtt) {
        super(hp, damage, lvl, vAtt);
    }

    @Override
    void skill(Boss boss) {
        Random rnd1 = new Random(System.currentTimeMillis());
        int rnd = 1 + rnd1.nextInt(3);
        System.out.println("Удар мага");
        switch (rnd) {
            case 1:
                boss.hp -= (fireBall() + lvl) * vAtt;
                System.out.println("\tумение fire ball");
                break;
            case 2:
                boss.hp -= (frozenBall() + lvl) * vAtt;
                System.out.println("\tумение frozen ball");
                break;
            case 3:
                boss.hp -= (ult() + lvl) * vAtt;
                System.out.println("\tсупер умение");
                break;
        }
        System.out.println("\tОсталось здоровья босса: " + boss.getHp());

    }

    float fireBall() {
        return damage * 6;
    }

    float frozenBall() {
        return damage * 2;
    }

    float ult() {
        return damage * 10;
    }

    boolean guard() {
        Random rnd1 = new Random(System.currentTimeMillis());
        int rnd = 1 + rnd1.nextInt(100);
        if (rnd > 50) {
            System.out.println("Маг уклонился от атаки");
            return true;
        } else
            return false;
    }

}
