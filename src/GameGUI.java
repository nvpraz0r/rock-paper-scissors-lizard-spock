import java.util.Random;
import javax.swing.*;
import java.awt.*;

/**
 * @author Jon/nvpraz0r
 * 
 * 
 * To do:
 *  -create rock paper scissors lizard spock
 *      + with images that a player can select???
 * 
 */

/**
 * This class implements the UI for the game
 */
public class GameGUI extends JFrame{
    
    //class variables
    public int target;
    private int score;
    private JTextField playerScoreField;
    private JTextField playerGuessField;
    private JTextField guessesRemainingField;
    
    /**
     * This method sets the look and feel
    */
    public GameGUI(){
        try {
            UIManager.setLookAndFeel(
                    UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException |
                 IllegalAccessException | UnsupportedLookAndFeelException e) {
            System.out.println(e);
        }        
        initComponents();
    }
    
    /**
     * This method defines and creates UI elements
     */
    private void initComponents(){

        setVisible(true);
        setSize(400, 280);
    }

    /**
     * This method resets key variables and text fields
    */
    public void setUpGame(){
        //set random number
        Random rand = new Random();
        target = rand.nextInt(5) + 1;

        //set game variables
        playerScoreField.setText(Integer.toString(score));
        guessesRemainingField.setText("5");
        playerGuessField.setText("");

        //REMOVE THIS
        System.out.println(target); //printing target to test scoring
        //REMOVE THIS
    }
    
    // Helper method to return GridBagConstraints objects
    private GridBagConstraints getConstraints(int x, int y) {
        GridBagConstraints c = new GridBagConstraints();
        c.anchor = GridBagConstraints.LINE_START;
        c.insets = new Insets(5, 5, 0, 5);
        c.gridx = x;
        c.gridy = y;
        return c;
    }
    
    /**
     * This method starts the application
     */
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new GameGUI().setVisible(true);            
        });
    }
}