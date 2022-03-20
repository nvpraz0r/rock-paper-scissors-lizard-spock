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
 * 
 * Don't forget to change default return
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
        if(playerChoice.equalsIgnoreCase("rock") && computerThrow == 3){        //rock win
            gameResult = true;
        } else if(playerChoice.equalsIgnoreCase("rock") && computerThrow == 4){ //rock win
            gameResult = true;
        } else if(playerChoice.equalsIgnoreCase("rock") && computerThrow == 2){ //rock lose
            gameResult = false;
        } else if(playerChoice.equalsIgnoreCase("rock") && computerThrow == 5){ //rock lose
            gameResult = false;
        }

        //paper win and lose conditions
        if(playerChoice.equalsIgnoreCase("paper") && computerThrow == 1){        //paper win
            gameResult = true;
        } else if(playerChoice.equalsIgnoreCase("paper") && computerThrow == 5){ //paper win
            gameResult = true;
        } else if(playerChoice.equalsIgnoreCase("paper") && computerThrow == 3){ //paper lose
            gameResult = false;
        } else if(playerChoice.equalsIgnoreCase("paper") && computerThrow == 5){ //paper lose
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
