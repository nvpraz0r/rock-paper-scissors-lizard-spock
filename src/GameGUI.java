import java.util.Random;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

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
public class GameGUI extends JFrame implements ActionListener{
    
    //class variables
    public int computerThrow;
    public int score;
    JButton[] handButtons = new JButton[5];
    JButton rockButton, paperButton, scissorButton, lizardButton, spockButton;
    
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
        setTitle("RockPaperScissorsLizardSpock");
        setSize(500, 500);







        setVisible(true);
    }

    /**
     * This method resets key variables and text fields
    */
    public void setUpGame(){

    }
    
    // // Helper method to return GridBagConstraints objects
    // private GridBagConstraints getConstraints(int x, int y) {
    //     GridBagConstraints c = new GridBagConstraints();
    //     c.anchor = GridBagConstraints.LINE_START;
    //     c.insets = new Insets(5, 5, 0, 5);
    //     c.gridx = x;
    //     c.gridy = y;
    //     return c;
    // }
    
    /**
     * This method starts the application
     */
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new GameGUI().setVisible(true);            
        });
    }

    @Override
    public void actionPerformed(ActionEvent e){

    }
}