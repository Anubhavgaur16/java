import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args){
        String[] choices = {"rock", "paper", "scissors"};
        String userChoice;
        String computerChoice;

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String playAgain = "yes";
        
        System.out.println("welcome to rock paper scissors game!");
        do{
            System.out.print("enter your choice (rock, paper, scissors): ");
            userChoice = scanner.nextLine().toLowerCase();
            computerChoice = choices[random.nextInt(choices.length)];

            if(userChoice.equals("rock") || userChoice.equals("paper") || userChoice.equals("scissors")) {
                System.out.println("computer choice: " + computerChoice);

                if(userChoice.equals(computerChoice)){
                    System.out.println("it's a tie!");
                }
                else if((userChoice.equals("rock") && computerChoice.equals("scissors"))||
                        (userChoice.equals("paper") && computerChoice.equals("rock"))||
                        (userChoice.equals("scissors") && computerChoice.equals("paper"))){
                        System.out.println("you win!");
                }
                else{
                    System.out.println("you lose!");
                }
            }
            else{
                System.out.println("invalid choice, please enter rock, paper, or scissors.");
                continue;
            }
            System.out.print("do you wantt to play again? (yes/no): ");
            playAgain = scanner.nextLine().toLowerCase();
        }while(playAgain.equals("yes"));

        System.out.println("thanks for playing!");
    }
}