import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

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

/**
 * This class implements the UI for the game
 */
public class GameGUI extends JFrame implements ActionListener{
    
    //class variables
    public String playerChoice;
    public int computerChoice;
    JButton[] handButtons = new JButton[7];
    JButton rockButton, paperButton, scissorButton, lizardButton, spockButton, randoButton, exitButton;
    Computer computer = new Computer();

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
        if(e.getSource() == rockButton){
            playerChoice = "rock";
            computer.computerChoice(playerChoice);

        } else if (e.getSource() == paperButton) {
            playerChoice = "paper";
            computer.computerChoice(playerChoice);

        } else if (e.getSource() == scissorButton) {
            playerChoice = "scissors";
            computer.computerChoice(playerChoice);

        } else if (e.getSource() == lizardButton) {
            playerChoice = "lizard";
            computer.computerChoice(playerChoice);

        } else if (e.getSource() == spockButton) {
            playerChoice = "spock";
            computer.computerChoice(playerChoice);

        } else {
            //throw error?
        }
    }
}