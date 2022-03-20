/**
 * @author Jon/nvpraz0r

 * To Do:
 *  =notifications
 *      -change it to a different message type?
 * 
 *  double check win lose condition logic
 */

import java.util.Random;


/**
 * This class represents
 * the computer or opponent
*/
public class Computer {


    public void computerChoice(String playerChoice){
        Random rand = new Random();
        int computerThrow = rand.nextInt(5) + 1;
        boolean gameResult = false;
        String resultMessage = "";
        
        //rock,paper,scissor,lizard,spock
        //1,2,3,4,5

        //rock win and lose conditions
        if(playerChoice.equalsIgnoreCase("rock")){
            switch (computerThrow) {
                case 1:
                    gameResult = false; //rock v rock lose
                    break;
                case 2:
                    gameResult = false; //rock v paper lose
                    break;
                case 3:
                    gameResult = true; //rock v scissors win
                    break;
                case 4:
                    gameResult = true; //rock v lizard win
                    break;
                case 5:
                    gameResult = false; //rock v spock lose
                    break;
                default:
                    break;
            }
        }

        //paper win and lose conditions
        if(playerChoice.equalsIgnoreCase("paper")){
            switch (computerThrow) {
                case 1:
                    gameResult = true; //paper v rock win
                    break;
                case 2:
                    gameResult = false; //paper v paper lose
                    break;
                case 3:
                    gameResult = false; //paper v scissors lose
                    break;
                case 4:
                    gameResult = false; //paper v lizard lose
                    break;
                case 5:
                    gameResult = true; //paper v spock win
                    break;
                default:
                    break;
            }
        }

        //scissors win and lose conditions
        if(playerChoice.equalsIgnoreCase("scissors")){
            switch (computerThrow) {
                case 1:
                    gameResult = false; //scissors v rock lose
                    break;
                case 2:
                    gameResult = true; //scissors v paper win
                    break;
                case 3:
                    gameResult = false; //scissors v scissors lose
                    break;
                case 4:
                    gameResult = true; //scissors v lizard win
                    break;
                case 5:
                    gameResult = false; //scissors v spock lose
                    break;
                default:
                    break;
            }
        }

        //lizard win and lose conditions
        if(playerChoice.equalsIgnoreCase("lizard")){
            switch (computerThrow) {
                case 1:
                    gameResult = false; //lizard v rock lose
                    break;
                case 2:
                    gameResult = true; //lizard v paper win
                    break;
                case 3:
                    gameResult = false; //lizard v scissors lose
                    break;
                case 4:
                    gameResult = false; //lizard v lizard lose
                    break;
                case 5:
                    gameResult = true; //lizard v spock win
                    break;
                default:
                    break;
            }
        }

        //spock win and lose conditions
        if(playerChoice.equalsIgnoreCase("spock")){
            switch (computerThrow) {
                case 1:
                    gameResult = true; //spock v rock win
                    break;
                case 2:
                    gameResult = false; //spock v paper lose
                    break;
                case 3:
                    gameResult = true; //spock v scissors win
                    break;
                case 4:
                    gameResult = false; //spock v lizard lose
                    break;
                case 5:
                    gameResult = false; //spock v spock lose
                    break;
                default:
                    break;
            }
        }

        if(gameResult == true){
            //win message
            System.out.println("win");
        } else if(gameResult == false){
            //defeat message
            System.out.println("lose");
        } else {
            //???
        }

    }
}
