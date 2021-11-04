package com.company;


import java.util.Random;
import java.util.Scanner;

class GuessingGame{

        int random;
        int guessNo;
        int noOfGuesses;
        int cntr;
        public boolean correctNo;

        public GuessingGame(){
                Random ran1=new Random();
                random=ran1.nextInt(1,100);

        }
        public void userInput(){
                Scanner sc=new Scanner(System.in);
                System.out.println("Guess A Number Between 1 to 100");
                guessNo=sc.nextInt();

        }
        public void setNoOfGuesses(int noOfGuesses){
                this.noOfGuesses=noOfGuesses;
        }
        public int getNoOfGuesses(){
                return noOfGuesses;
        }

        public void setCntr(){
                cntr++;
        }
        public void isCorrectNumber(){
                if (guessNo==random)
                {
                        System.out.println("You have guessed Correct Number.");
                       correctNo= true;
                }
                else if (guessNo<random)
                {
                        System.out.println("You have guessed the Wrong Number.");
                        System.out.println("Guess a Larger Number");
                        correctNo= false;
                }
                else
                {
                        System.out.println("You have guessed the Wrong Number.");
                        System.out.println("Guess a Smaller Number");
                        correctNo= false;
                }

        }
        public boolean getCorrectNo(){
                return correctNo;
        }

        public void properGame(){
                for (int i=1;i<=noOfGuesses;i++)
                {

                        userInput();
                        isCorrectNumber();
                        if (getCorrectNo())
                        {
                                break;
                        }
                }
                System.out.println("The correct number was "+random);
        }
}

public class Ch_09_Exercise_Guessing_Game {
        public static void main(String[] args) {
                GuessingGame gm=new GuessingGame();

                gm.setNoOfGuesses(10);
                gm.properGame();
        }

}
