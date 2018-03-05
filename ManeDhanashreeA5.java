import java.util.Random;
import java.util.Scanner;

public class ManeDhanashreeA5 {
    private static int showRandomInteger(int start, int end, Random random) {
        int range = end - start + 1;   //gets the range
        int fraction = (int) (range * random.nextDouble());  // computes fraction of the range
        int randomNumber = (fraction + start);  //final random number
        System.out.println(randomNumber); //to check the won scenario, remove the comment '//'
        return randomNumber;   //returns the random number to the main method
    }

    private static void playGame(int randomNum, int currentCounter, boolean lotteryWon){

        if(lotteryWon){
            System.out.println("Hurray! You won the lottery!");
        }
        else{
            System.out.println("Sorry! You lost!");
        }
        System.out.println("Random number generated: " + randomNum);
        System.out.println("Number of trials: " + (currentCounter));
    }

    private static boolean isResponseValid(String responseString)   //validating the input response: user should enter Y or N only otherwise breaks the game
    {
        if(responseString.equals("Y") || responseString.equals("N"))
        {
            return true;
        }
        return false;
    }

    private static boolean isLotteryNumberInRange(int lotteryNum, int start, int end)
    {
        if(lotteryNum >= start && lotteryNum <= end)
        {
            return true;
        }
        return false;
    }

    public static void main(String args[]) {
        int min = 25; //assign start range
        int max = 75;   //assign end range
        int maxTries = 3;
        Random random = new Random();   //create an object of random class
        int randomNum = showRandomInteger(min, max, random);  //call method to generate a random number

        Scanner inputLotteryNumber = new Scanner(System.in);

        int counter = 0;
        boolean lotteryWon = false;

        while (true)
        {
            if(counter == 0)
                System.out.println("This is your trial 1. Guess a number to win the lottery!");
            else if (counter == 1)
                System.out.println("Alas! Please try again. This is your trial 2!");
            else if(counter == 2)
                System.out.println("Bad luck! You got one more trial!");

            int inputNum = inputLotteryNumber.nextInt();
            //System.out.println(inputNum);

            if(inputNum == randomNum)
            {
                lotteryWon = true;
            }

            if(isLotteryNumberInRange(inputNum, min, max)){
                counter++;
            }
            else {
                System.out.println("Please enter valid lottery number in the range of 25 and 75");
                continue;
            }

            if(lotteryWon){
                playGame(randomNum, counter, true);
            } else if(counter == maxTries ){
                playGame(randomNum, counter, false);
            }

            if(counter == maxTries  || lotteryWon)
            {
                System.out.print("Would you like to play again? (Y/N)");
                String continueLottery = inputLotteryNumber.next();  // taking the response if yes 'Y' and if no then 'N'

                if(isResponseValid(continueLottery)) {
                    if(continueLottery.equals("N")){
                        break;
                    }
                    else if(continueLottery.equals("Y")) {            // logic to regenerate the new random number and reset the counter if player wants to play the game
                        counter = 0;
                        lotteryWon = false;
                        randomNum = showRandomInteger(min, max, random);
                    }
                }
                else {                                                  // if player enters invalid response then ask the player to start again
                    System.out.println("Play again response is not valid.");
                    break;
                }
            }
        }
    }
}
