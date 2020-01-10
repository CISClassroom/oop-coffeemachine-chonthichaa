package com.company;

import java.util.Scanner;

public class CofeeMachine {
    int water = 10;
    int coffee = 10;

    public void makeCoffee(int iAmericano) {

        if (iAmericano > 0) {
            for (int i = 0; i < iAmericano; i++) {
                Americano americano = makeAmericano();
                if (americano != null)
                    System.out.println("Here your americano");
                else
                    System.out.println("Sorry can't make it");
            }
        }
    }

    Americano makeAmericano() {

        //check recipe = americano coffee 1,water

        if (coffee > 1 && water > 2) {
            coffee -= 1;
            water -= 2;
            //create ameruicano object and return
            Americano americano = new Americano();
            return americano;

        } else
            return null;

    }
}

