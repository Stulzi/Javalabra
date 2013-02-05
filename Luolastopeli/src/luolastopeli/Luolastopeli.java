
package luolastopeli;

import Elavat.Elollinen;
import Elavat.Pelihahmo;
import Elavat.Vihollinen;
import Logiikka.Luola;
import Logiikka.Taistelu;
import UI.Kayttoliittyma;
import java.util.Random;
import javax.swing.SwingUtilities;

public class Luolastopeli {


    public static void main(String[] args) { 
        
        //Käyttöliittymä on vasta suunnitteluasteella
        Kayttoliittyma kayttoliittyma = new Kayttoliittyma();
        SwingUtilities.invokeLater(kayttoliittyma);
        
        Pelihahmo hahmo= new Pelihahmo(600, 100, 160, 80);
        Luola luola = new Luola(hahmo, 11);
        luola.taistele();
         
        

        
        
    }
    

}