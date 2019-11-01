package com.company;

public class Arena {
    Boss boss;
    Person[] team;
    private int winner;
    Arena(Boss boss, Person[] team){
        this.boss = boss;
        this.team = team;
    }

    public int getWinner() {
        return winner;
    }

    void startFight(){
        outer:
        while (true){
            for(int i = 0; i < team.length && team[i] != null; i++){
                Person cur = team[i];
                cur.skill(boss);
                if (boss.getHp() <= 0){
                    System.out.println("Победил " + cur.getClassName());
                    winner = 0;
                    break outer;
                }
                boss.skill(cur);
                if (cur.getHp() <= 0){
                    System.out.println("Победил " + boss.getName());
                    winner = 1;
                    break outer;
                }
            }
        }
    }
}
