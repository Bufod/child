package com.company;

public class Main {

    public static void main(String[] args) {
        Person mageS = new Mage(100, 50, 20, 10);
        Boss dragon = new Boss(10000, 30, 1, 2);

        while (true) {
            mageS.skill(dragon);
            if (dragon.getHp() <= 0) {
                System.out.println("Победил маг");
                break;
            }
            dragon.skill(mageS);
            if (mageS.getHp() <= 0) {
                System.out.println("Победил дракон");
                break;
            }
        }
    }
}