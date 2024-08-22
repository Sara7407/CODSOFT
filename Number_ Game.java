//CODSOFT task 1: Number Game


import java.util.*;
public class Number_Game{
    public static void main (String[] args){
        Scanner sc=new Scanner (System.in);
        int chances=8;
        boolean playAgain=true;
        System.out.println("Welcome to the number guessing game! ");
        System.out.println("You have "+chances+" chances to win the game!");
        while(playAgain){
            int rand=getrandN(1,100);
            boolean guess=false;
            for(int i=0;i<chances;i++){
                System.out.print("Chance "+(i+1)+" Enter your guess: ");
                int user=sc.nextInt();
                if(user==rand){
                    guess=true;
                  
                    System.out.println("You're correct!!!");
                    break;
                }
                else if (user>rand){
                    System.out.println("Too High!");
                }
                else{
                    System.out.println("Too Low!");
                }
                System.out.println("Do you want to play Again(y/n)");
                String pA=sc.next();
                playAgain=pA.equalsIgnoreCase("y");

            }
            System.out.println("Thanks for playing!! The number is "+rand);
          

        }
    }

    public static int getrandN(int min, int max){
        return (int)(Math.random()*(max-min+1)+min);
    }
}
