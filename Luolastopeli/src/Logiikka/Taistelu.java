package Logiikka;

import Elavat.Elollinen;
import Elavat.Pelihahmo;
import Elavat.Vihollinen;
import java.util.ArrayList;
import java.util.Random;

public class Taistelu {
    
    
    /**
     * Suorittaa yhden vuoron taistelusta hahmon ja vihollisten välillä
     * @param hahmo pelihahmo
     * @param viholliset tämänhetkiset viholliset
     */
    public static void taistelu(Pelihahmo hahmo, ArrayList<Vihollinen> viholliset){
        
            System.out.println("You attacked the " + viholliset.get(0).annaNimi() + ".");
            hyokkaa(hahmo, viholliset.get(0));
            if(viholliset.get(0).annaNykyinenHP()<1){
                System.out.println("The " + viholliset.get(0).annaNimi() + " died.");  
                viholliset.remove(0);
            }
            
            for (Vihollinen vihollinen : viholliset) {
            System.out.println("The " + vihollinen.annaNimi() + " attacked you.");
            hyokkaa(vihollinen, hahmo);           
            if(hahmo.annaNykyinenHP()<1){
                System.out.println("You died.");
                break;
            }
        }
            
        }
       
    /**
     * Suorittaa yhden hyökkäyksen
     * @param hyokkaava hyökkäävä 
     * @param hyokatty hyökkäyksen kohde
     */
    public static void hyokkaa(Elollinen hyokkaava, Elollinen hyokatty){
         Random noppa = new Random();
         int voima=hyokkaava.annaVoima();
         int puolustus=hyokatty.annaPuolustus();
         double kerroin= ((double)(noppa.nextInt(4)+8)/(double)10);
         int vahinko= (int)((double)voima*kerroin-puolustus);
         if(vahinko<1){
             vahinko=0;
         }
         System.out.println(vahinko);
         hyokatty.vahennaNykyistaHP(vahinko);
    }
    
}
