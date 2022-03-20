import java.util.Random;

public class Computer {
    public void computerChoice(String playerChoice){
        Random rand = new Random();
        int computerThrow = rand.nextInt(5) + 1;

        switch (computerThrow) {
            case 1: //rock
                resultOfGame(1, playerChoice);
                break;
            case 2: //paper
                resultOfGame(2, playerChoice);
                break;
            case 3: //scissor
                resultOfGame(3, playerChoice);
                break;
            case 4: //lizard
                resultOfGame(4, playerChoice);
                break;
            case 5: //spock
                resultOfGame(5, playerChoice);
                break;
            default:
                break;
        }

    }
}
