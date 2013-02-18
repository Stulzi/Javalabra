package Logiikka;

import Elavat.Pelihahmo;
import Elavat.Vihollinen;
import UI.Kayttoliittyma;
import java.lang.reflect.InvocationTargetException;
import javax.swing.SwingUtilities;

public class Luolasto {
    public static Pelihahmo hahmo;
    
     public static Pelihahmo getHahmo(){
        return Luolasto.hahmo;
    }
    
    public static void run() throws InterruptedException, InvocationTargetException{
       hahmo = new Pelihahmo(600,100,160,50);       
       Vihollinen peikko = new Vihollinen("Troll", 400, 110, 40);
       Vihollinen lepakko = new Vihollinen("Bat", 300, 90, 30);
       Vihollinen pollo = new Vihollinen("Owl", 320, 100, 45);
       Vihollinen jatti = new Vihollinen("Ogre", 500, 140, 60);
       
        Kayttoliittyma kayttoliittyma = new Kayttoliittyma(hahmo);
        SwingUtilities.invokeAndWait(kayttoliittyma);

       Luola luola1= new Luola(hahmo, kayttoliittyma, peikko, lepakko);
       Luolasto.meneLuolaan(kayttoliittyma);
       luola1.taistele();
       hahmo.lisaaVoimaa(30);
       hahmo.lisaaHP(50);
       hahmo.paranna();
       
       Luola luola2 = new Luola(hahmo, kayttoliittyma, pollo, jatti);
       Luolasto.meneLuolaan(kayttoliittyma);
       luola2.taistele();
    }
    
     public static void meneLuolaan(Kayttoliittyma ui){
        hahmo.asetaTaistelutila("You enter a room. In the room there are" + Luola.listaaViholliset(Luola.getViholliset()) + ".");
        ui.paivitaHahmoAction();
        ui.paivitaStatus();
    }
   

}
