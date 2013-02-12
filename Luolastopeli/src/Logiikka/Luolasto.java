package Logiikka;

import Elavat.Pelihahmo;
import Elavat.Vihollinen;
import UI.Kayttoliittyma;
import javax.swing.SwingUtilities;

public class Luolasto {
    
    public static void run(){
       Pelihahmo hahmo = new Pelihahmo(600,200,160,50);       
       Vihollinen peikko = new Vihollinen("Troll", 400, 110, 40);
       Vihollinen lepakko = new Vihollinen("Bat", 300, 90, 30);
       
        Kayttoliittyma kayttoliittyma = new Kayttoliittyma(hahmo, peikko, lepakko);
        SwingUtilities.invokeLater(kayttoliittyma);

       Luola luola= new Luola(hahmo,peikko,lepakko);
       Luola.taistele();
    }
    
}
