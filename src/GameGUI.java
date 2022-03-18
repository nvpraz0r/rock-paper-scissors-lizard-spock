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
 * Left off:
 * 
 *  =working on computerChoice()
 *      -use random num generator
 *  =working on actionPerformed()
 *      -checking user's choice
 *  =working on validators
 *      -change it to a different message type?
 */

/**
 * This class implements the UI for the game
 */
public class GameGUI extends JFrame implements ActionListener{
    
    //class variables
    public int computerThrow;
    public String playerChoice;
    JButton[] handButtons = new JButton[5];
    JButton rockButton, paperButton, scissorButton, lizardButton, spockButton;

    Font myFont = new Font("Apple Casual",Font.PLAIN,25);
    
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
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLayout(null);

        handButtons[0] = rockButton;
        handButtons[1] = paperButton;
        handButtons[2] = scissorButton;
        handButtons[3] = lizardButton;
        handButtons[4] = spockButton;

        for (int i = 0; i < handButtons.length; i++) {
            handButtons[i].addActionListener(this);
            handButtons[i].setFont(myFont);
            handButtons[i].setFocusable(false);
        }




        setVisible(true);
    }

    /**
     * 
    */
    public void computerChoice(){

    }
    
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
        if(e.getSource() == rockButton){
            computerChoice();

        } else if (e.getSource() == paperButton) {
            computerChoice();

        } else if (e.getSource() == scissorButton) {
            computerChoice();

        } else if (e.getSource() == lizardButton) {
            computerChoice();

        } else if (e.getSource() == spockButton) {
            computerChoice();

        } else {
            //throw error?
        }
    }
}