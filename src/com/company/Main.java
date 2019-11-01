package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Игра Арена");
        Scanner in = new Scanner(System.in);
        String ans;
        Person[] team = new Person[3];
        Boss cur_boss = new Boss("Дракон", 10000, 30, 1, 2);
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

        int score = 0;
        while (true){
            Arena arena = new Arena(cur_boss, team);
            arena.startFight();
            if (arena.getWinner() == 0)
                score+=100;
            System.out.println("Текущий счет: " + score);
            System.out.println("Продолжить Да/Нет?");
            ans = in.nextLine();
            if (ans.equals("Нет"))
                break;
            else if (arena.getWinner() == 0){
                // Восстановление босса
                cur_boss.setLvl(cur_boss.getLvl()+1);
            }
        }


    }
}
