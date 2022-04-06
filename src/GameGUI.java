import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

/**
 * @author Jon/nvpraz0r
 * To Do:
 *  =notifications
 *      -change it to a different message type?
 * 
 *  double check win lose condition logic
 */

/**
 * This class implements the UI for the game
 */
public class GameGUI extends JFrame implements ActionListener{
    
    //class variables
    JButton[] handButtons = new JButton[7];
    JButton rockButton, paperButton, scissorButton, lizardButton, spockButton, randoButton, exitButton;

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
        setSize(400, 400);
        setLayout(null);

        //create button objects
        rockButton = new JButton("Rock");
        paperButton = new JButton("Paper");
        scissorButton = new JButton("Scissors");
        lizardButton = new JButton("Lizard");
        spockButton = new JButton("Spock");
        randoButton = new JButton("Random");
        exitButton = new JButton("Exit");

        //assign values to button array
        handButtons[0] = rockButton;
        handButtons[1] = paperButton;
        handButtons[2] = scissorButton;
        handButtons[3] = lizardButton;
        handButtons[4] = spockButton;
        handButtons[5] = randoButton;
        handButtons[6] = exitButton;


        //assign action listeners and fonts to the buttons
        for (int i = 0; i < handButtons.length; i++) {
            handButtons[i].addActionListener(this);
            handButtons[i].setFont(myFont);
            handButtons[i].setFocusable(false);
        }

        //set up panel
        JPanel panel = new JPanel();
        panel.setBounds(35, 35, 300, 300);
        panel.setLayout(new GridLayout(4, 4, 10, 10));
        panel.setBackground(Color.GRAY);

        //add buttons to the panel
        for (int i = 0; i < handButtons.length; i++) {
            panel.add(handButtons[i]);
        }

        //add panel to the frame
        add(panel);

        //make the window visible
        setVisible(true);
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
        Logic gameLogic = new Logic();

        if(e.getSource() == rockButton){
            gameLogic.GameLogic("rock");
        }
        
        if (e.getSource() == paperButton) {
            gameLogic.GameLogic("paper");
        }
        
        if (e.getSource() == scissorButton) {
            gameLogic.GameLogic("scissors");
        }
        
        if (e.getSource() == lizardButton) {
            gameLogic.GameLogic("lizard");
        }
        
        if (e.getSource() == spockButton) {
            gameLogic.GameLogic("spock");
        }

        if (e.getSource() == randoButton) {
            Random randomNumber = new Random();
            int randomChoice = randomNumber.nextInt(5) + 1;
            //create random #
            //send to computer
            switch(randomChoice){
                case 1:
                    gameLogic.GameLogic("rock");
                    break;
                case 2:
                    gameLogic.GameLogic("paper");
                    break;
                case 3:
                    gameLogic.GameLogic("scissors");
                    break;
                case 4:
                    gameLogic.GameLogic("lizard");
                    break;
                case 5:
                    gameLogic.GameLogic("spock");
                    break;
            }
        }
    }
}