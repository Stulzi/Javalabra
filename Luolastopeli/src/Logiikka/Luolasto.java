package Logiikka;

import Elavat.Pelihahmo;
import Elavat.Vihollinen;
import UI.Kayttoliittyma;
import javax.swing.SwingUtilities;

public class Luolasto {
    public static Pelihahmo hahmo;
    
    public static void run(){
       hahmo = new Pelihahmo(600,200,160,50);       
       Vihollinen peikko = new Vihollinen("Troll", 400, 110, 40);
       Vihollinen lepakko = new Vihollinen("Bat", 300, 90, 30);
       
        Kayttoliittyma kayttoliittyma = new Kayttoliittyma(hahmo);
        SwingUtilities.invokeLater(kayttoliittyma);

       Luola luola= new Luola(hahmo,peikko,lepakko);
       luola.taistele();
    }
    
    public static Pelihahmo getHahmo(){
        return Luolasto.hahmo;
    }
            
}
