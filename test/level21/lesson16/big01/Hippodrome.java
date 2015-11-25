package com.javarush.test.level21.lesson16.big01;

import java.util.ArrayList;

public class Hippodrome {
    private ArrayList<Horse> horses = new ArrayList<Horse>();

    public ArrayList<Horse> getHorses(){
        return horses;
    }

    public static Hippodrome game;

    public void run() throws InterruptedException {
        for(int i=0; i<100; i++){
            move();
            print();
            Thread.sleep(10);
        }
    }

    public void move(){
        for(Horse horse : horses){
            horse.move();
        }
    }

    public void print(){
        for(Horse horse : horses){
            horse.print();
            System.out.println();
        }
    }

    public Horse getWinner(){
        Horse winner = new Horse("test", 0, 0);
        for(Horse horse : horses){
            if(winner.getDistance() < horse.getDistance()){
                winner = horse;
            }

        }
        return winner;
    }

    public void printWinner(){
        System.out.println("Winner is " + getWinner().getName() + "!");
    }

    public static void main(String[] args) throws InterruptedException {
        game = new Hippodrome();
        Horse horse1 = new Horse("Буян", 3, 0);
        Horse horse2 = new Horse("Один", 3, 0);
        Horse horse3 = new Horse("Перун", 3, 0);
        game.getHorses().add(horse1);
        game.getHorses().add(horse2);
        game.getHorses().add(horse3);
        game.run();
        game.printWinner();
    }
}
