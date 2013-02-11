package Logiikka;

import Elavat.Pelihahmo;
import Elavat.Vihollinen;

public class Luolasto {
    
    public static void run(){
       Pelihahmo hahmo = new Pelihahmo(600,200,160,50);
       Vihollinen peikko = new Vihollinen("Troll", 400, 110, 40);
       Vihollinen lepakko = new Vihollinen("Bat", 300, 90, 30);
       Luola luola= new Luola(hahmo,peikko,lepakko);
       luola.taistele();
    }
    
}
