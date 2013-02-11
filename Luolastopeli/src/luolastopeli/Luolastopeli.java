
package luolastopeli;

import Logiikka.Luolasto;
import UI.Kayttoliittyma;
import javax.swing.SwingUtilities;

public class Luolastopeli {


    public static void main(String[] args) { 
        
        //Käyttöliittymä on vasta suunnitteluasteella
        Kayttoliittyma kayttoliittyma = new Kayttoliittyma();
        SwingUtilities.invokeLater(kayttoliittyma);
        
        Luolasto.run(); 
        
        
    }
    

}