package Logiikka;

import Elavat.Elollinen;
import Elavat.Pelihahmo;
import Elavat.Vihollinen;
import java.util.Random;

public class Taistelu {
    
    
    public static void taistelu(Pelihahmo hahmo, Vihollinen vihollinen){
        while (true) {
            System.out.println("You attacked the " + vihollinen.annaNimi() + ".");
            hyokkaa(hahmo, vihollinen);
            if(vihollinen.annaNykyinenHP()<1){
                System.out.println("The " + vihollinen.annaNimi() + " died.");
                break;
            }
            System.out.println("The " + vihollinen.annaNimi() + " attacked you.");
            hyokkaa(vihollinen, hahmo);           
            if(hahmo.annaNykyinenHP()<1){
                System.out.println("You died.");
                break;
            }
        }
    }
    
    public static void hyokkaa(Elollinen hyokkaava, Elollinen hyokatty){
         Random noppa = new Random();
         int voima=hyokkaava.annaVoima();
         int puolustus=hyokatty.annaPuolustus();
         double kerroin= ((double)(noppa.nextInt(4)+8)/(double)10);
         int vahinko= (int)((double)voima*kerroin-puolustus);
         System.out.println(vahinko);
         hyokatty.vahennaNykyistaHP(vahinko);
    }
    
}
