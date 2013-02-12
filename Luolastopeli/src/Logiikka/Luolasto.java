package Logiikka;

import Elavat.Pelihahmo;
import Elavat.Vihollinen;
import UI.Kayttoliittyma;
import javax.swing.SwingUtilities;

public class Luolasto {
    public static Pelihahmo hahmo;
    
     public static Pelihahmo getHahmo(){
        return Luolasto.hahmo;
    }
    
    public static void run(){
       hahmo = new Pelihahmo(600,100,160,50);       
       Vihollinen peikko = new Vihollinen("Troll", 400, 110, 40);
       Vihollinen lepakko = new Vihollinen("Bat", 300, 90, 30);
       Vihollinen pollo = new Vihollinen("Owl", 320, 100, 45);
       Vihollinen jatti = new Vihollinen("Ogre", 500, 140, 60);
       
        Kayttoliittyma kayttoliittyma = new Kayttoliittyma(hahmo);
        SwingUtilities.invokeLater(kayttoliittyma);

       Luola luola1= new Luola(hahmo,peikko,lepakko);
       luola1.taistele();
       hahmo.lisaaVoimaa(30);
       hahmo.paranna();
       
       Luola luola2 = new Luola(hahmo, pollo, jatti);
       luola2.taistele();
    }
    
   
            
}
