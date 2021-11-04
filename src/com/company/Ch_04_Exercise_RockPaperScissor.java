package com.company;

import java.util.Random;
import java.util.Scanner;

public class Ch_04_Exercise_RockPaperScissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter '1' for Rock,'2' for Paper and '3' for Scissor.");


        int draw = 0;
        int machnine_won = 0;
        int user_won = 0;

        int cntr = 0;

        while (cntr < 10) {
            int inp = sc.nextInt();
            Random ran1 = new Random();
            int random1 = ran1.nextInt(1, 4);

            if (inp == 1) {
                if (random1==1) {
                    System.out.println("You chose Rock and the Machine chose Rock too!!!");
                    System.out.println("The Game is Drawn!!!");
                    draw++;
                }

                else if(random1==2){

                        System.out.println("You chose Rock but the Machine chose Paper!!!");
                        System.out.println("Machine has Won!!!");
                        machnine_won++;
                }

                else {

                        System.out.println("You chose Rock but the Machine chose Scissor!!!");
                        System.out.println("You have Won!!!");
                        user_won++;

                }

            } else if (inp == 2) {
                if (random1==1) {

                    System.out.println("You chose Paper but the machine chose Rock!!!");
                    System.out.println("You have Won!!!");
                    user_won++;

                }
                else if (random1==2) {

                    System.out.println("You chose Paper and the machine chose Paper too!!!");
                    System.out.println("The Match is Drawn!!!");
                    draw++;
                }

                 else {
                        System.out.println("You chose Paper but the machine chose Scissor!!!");
                        System.out.println("Machine has Won!!!");
                        machnine_won++;

                }

            } else if (inp == 3) {
                if (random1==1) {
                    System.out.println("You chose Scissor but the machine chose Rock!!!");
                    System.out.println("Machine has Won!!!");
                    machnine_won++;
                }

                else if (random1==2) {

                    System.out.println("You chose Scissor but the machine chose Paper!!!");
                    System.out.println("You have Won!!!");
                    user_won++;
                }

                else {

                        System.out.println("You chose Scissor and the machine chose Scissor too!!!");
                        System.out.println("Match is Drawn");
                        draw++;

                }
            }
            else
            {
                System.out.println("Invalid Input");
            }

        cntr++;



        }
        System.out.println("No. of times match drawn: " + draw);
        System.out.println("No. of times You Won: " + user_won);
        System.out.println("No. of times Machine Won: " + machnine_won);

        if (user_won>machnine_won){
            System.out.println("You are the Ultimate Winner!!!");
        }
        else {
            System.out.println("Machine is the Ultimate Winner!!!");
        }
    }
}