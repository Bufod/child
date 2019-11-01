package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Игра Арена");
        Scanner in = new Scanner(System.in);
        String ans;
        Person person;
        Boss dragon = new Boss(10000, 30, 1, 2);
        while (true){
            System.out.println("Выберите персонажа маг/лучник");
            ans = in.next();
            if (ans.equals("маг")) {
                person = new Mage(ans, 100, 50, 20, 10);
                break;
            }
            else if (ans.equals("лучник")){
                person = new Arch(ans,100, 25, 10, 10);
                break;
            }
            else
                System.out.println("Введенного класса не существует");
        }

        while (true){
            person.skill(dragon);
            if (dragon.getHp() <= 0){
                System.out.println("Победил " + person.getClassName());
                break;
            }
            dragon.skill(person);
            if (person.getHp() <= 0){
                System.out.println("Победил дракон");
                break;
            }
        }
    }
}
