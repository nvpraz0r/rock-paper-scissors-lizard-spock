/**
 * @author Jon/nvpraz0r

 * To Do:
 * 
 *  =computerChoice()
 *      -use random num generator
 *  =actionPerformed()
 *      -checking user's choice
 *  =notifications
 *      -change it to a different message type?
 */

import java.util.Random;


/**
 * This class represents
 * the computer or opponent
*/
public class Computer {

    Results results = new Results();

    public void computerChoice(String playerChoice){
        Random rand = new Random();
        int computerThrow = rand.nextInt(5) + 1;

        switch (computerThrow) {
            case 1: //rock
                results.resultOfGame(1, playerChoice);
                break;
            case 2: //paper
                results.resultOfGame(2, playerChoice);
                break;
            case 3: //scissor
                results.resultOfGame(3, playerChoice);
                break;
            case 4: //lizard
                results.resultOfGame(4, playerChoice);
                break;
            case 5: //spock
                results.resultOfGame(5, playerChoice);
                break;
            default:
                break;
        }

    }
}
