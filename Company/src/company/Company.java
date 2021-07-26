package company;

import controller.*;
import model.Enterprise;
import view.*;
/**
 *
 * @author Oscar Talero
 */
public class Company {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // crea la ventana principal
        Root root = new Root();
        RootControl rootcontrol = new RootControl(root);
        rootcontrol.start();             
    } 
}
