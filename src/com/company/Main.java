package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Игра Арена");
        Scanner in = new Scanner(System.in);
        String ans;
        Person[] team = new Person[3];
        Boss dragon = new Boss(10000, 30, 1, 2);
        int count = 0;
        while (count != 3){
            System.out.println("Выберите персонажа маг/лучник или напишите \"Начать играть\"");
            ans = in.nextLine();
            if (ans.equals("маг")) {
                team[count] = new Mage(ans);
                count++;
            }
            else if (ans.equals("лучник")){
                team[count]  = new Arch(ans);
                count++;
            }
            else if (ans.equals("Начать играть")){
                break;
            }
            else
                System.out.println("Введенного класса не существует");
        }

        outer:
        while (true){
            for(int i = 0; i < team.length && team[i] != null; i++){
                Person cur = team[i];
                cur.skill(dragon);
                if (dragon.getHp() <= 0){
                    System.out.println("Победил " + cur.getClassName());
                    break outer;
                }
                dragon.skill(cur);
                if (cur.getHp() <= 0){
                    System.out.println("Победил дракон");
                    break outer;
                }
            }
        }
    }
}
