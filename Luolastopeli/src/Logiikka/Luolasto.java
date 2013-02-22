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
    
    /**
     * Luo hahmon, viholliset, käyytöliittymän ja luolat. Pitää yllä koko ohjelman järjestyksessä toimimista.
     * @throws InterruptedException
     * @throws InvocationTargetException
     */
    public static void run() throws InterruptedException, InvocationTargetException{
       hahmo = new Pelihahmo(600,100,160,50);       
       Vihollinen peikko = new Vihollinen("Goblin", 440, 110, 50);
       Vihollinen lepakko = new Vihollinen("Bat", 300, 90, 40);
       Vihollinen pollo = new Vihollinen("Owl", 320, 100, 55);
       Vihollinen jatti = new Vihollinen("Ogre", 500, 140, 70);
       Vihollinen isoPeikko = new Vihollinen("Giant Goblin", 720, 190, 90);
       
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
       hahmo.lisaaSP(40);
       hahmo.lisaaPuolustusta(20);
       hahmo.lisaaVoimaa(20);
       hahmo.paranna();
       
       Luola luola3 = new Luola(hahmo, kayttoliittyma, isoPeikko);
       Luolasto.meneLuolaan(kayttoliittyma);
       luola3.taistele();
    }
    
     /**
     * Päivittää käyttöliittymässä hahmon tapahtumia
     * @param ui käyttöliittymä
     */
    public static void meneLuolaan(Kayttoliittyma ui){
        hahmo.asetaTaistelutila("You enter a room. In the room there is" + Luola.listaaViholliset(Luola.getViholliset()) + ".");
        ui.paivitaHahmoAction();
        ui.paivitaStatus();
    }
   

}
