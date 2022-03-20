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
 * 
 *  change: paper, scissor, lizard, spock; win lose conditions
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
        if(playerChoice.equalsIgnoreCase("rock") && computerThrow == 1){ //rock tie
            gameResult = false;
        } else if(playerChoice.equalsIgnoreCase("rock") && computerThrow == 2){ //rock lose
            gameResult = false;
        } else if(playerChoice.equalsIgnoreCase("rock") && computerThrow == 3){ //rock win
            gameResult = true;
        } else if(playerChoice.equalsIgnoreCase("rock") && computerThrow == 4){ //rock win
            gameResult = true;
        } else if(playerChoice.equalsIgnoreCase("rock") && computerThrow == 5){ //rock lose
            gameResult = false;
        }

        //paper win and lose conditions
        if(playerChoice.equalsIgnoreCase("paper") && computerThrow == 1){ //paper 
            gameResult = false;
        } else if(playerChoice.equalsIgnoreCase("paper") && computerThrow == 2){ //paper 
            gameResult = false;
        } else if(playerChoice.equalsIgnoreCase("paper") && computerThrow == 3){ //paper 
            gameResult = true;
        } else if(playerChoice.equalsIgnoreCase("paper") && computerThrow == 4){ //paper 
            gameResult = true;
        } else if(playerChoice.equalsIgnoreCase("paper") && computerThrow == 5){ //paper 
            gameResult = false;
        }

        //scissors win and lose conditions
        if(playerChoice.equalsIgnoreCase("scissors") && computerThrow == 1){ //scissors 
            gameResult = false;
        } else if(playerChoice.equalsIgnoreCase("scissors") && computerThrow == 2){ //scissors 
            gameResult = false;
        } else if(playerChoice.equalsIgnoreCase("scissors") && computerThrow == 3){ //scissors 
            gameResult = true;
        } else if(playerChoice.equalsIgnoreCase("scissors") && computerThrow == 4){ //scissors 
            gameResult = true;
        } else if(playerChoice.equalsIgnoreCase("scissors") && computerThrow == 5){ //scissors 
            gameResult = false;
        }

        //lizard win and lose conditions
        if(playerChoice.equalsIgnoreCase("lizard") && computerThrow == 1){ //lizard 
            gameResult = false;
        } else if(playerChoice.equalsIgnoreCase("lizard") && computerThrow == 2){ //lizard 
            gameResult = false;
        } else if(playerChoice.equalsIgnoreCase("lizard") && computerThrow == 3){ //lizard 
            gameResult = true;
        } else if(playerChoice.equalsIgnoreCase("lizard") && computerThrow == 4){ //lizard 
            gameResult = true;
        } else if(playerChoice.equalsIgnoreCase("lizard") && computerThrow == 5){ //lizard 
            gameResult = false;
        }

        //spock win and lose conditions
        if(playerChoice.equalsIgnoreCase("spock") && computerThrow == 1){ //spock 
            gameResult = false;
        } else if(playerChoice.equalsIgnoreCase("spock") && computerThrow == 2){ //spock 
            gameResult = false;
        } else if(playerChoice.equalsIgnoreCase("spock") && computerThrow == 3){ //spock 
            gameResult = true;
        } else if(playerChoice.equalsIgnoreCase("spock") && computerThrow == 4){ //spock 
            gameResult = true;
        } else if(playerChoice.equalsIgnoreCase("spock") && computerThrow == 5){ //spock 
            gameResult = false;
        }


        if(gameResult == true){
            //win message
        } else if(gameResult == false){
            //defeat message
        } else {
            //???
        }

    }
}
