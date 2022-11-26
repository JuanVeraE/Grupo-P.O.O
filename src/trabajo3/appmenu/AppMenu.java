package unal.appmenu;
import javax.swing.JFrame;

/**
 *
 * @author sebastian
 */

public class AppMenu {
    /**
     * @param args
    **/
    
    public static void main(String[] args) {
        frmPrincipal principal= new frmPrincipal();
        principal.setExtendedState(JFrame.MAXIMIZED_BOTH);
        principal.setVisible(true);
    }
}
