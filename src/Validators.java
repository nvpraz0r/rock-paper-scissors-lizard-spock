import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.text.JTextComponent;

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
 *  This class validates text field input
 */
public class Validators {

    private final Component parentComponent;

    
    /**
     * This is a constructor method
     * @param parent
    */
    public Validators(Component parent) {
        this.parentComponent = parent;
    }
    
    /**
     * This method creates an error window
     * based on the message passed to the method
     * @param message text for the tool tip
    */
    private void showErrorDialog(String message) {
        JOptionPane.showMessageDialog(parentComponent, message, 
                "Invalid Entry", JOptionPane.ERROR_MESSAGE);
    }

    /**
    */
    public void isPresent(JTextComponent c, String fieldName) {
        showErrorDialog("change this message later");
    }
}