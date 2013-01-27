package Logiikka;

import Elavat.Elollinen;
import Elavat.Pelihahmo;
import Elavat.Vihollinen;
import java.util.Random;

public class Taistelu {
    
    
    public void taistelu(){
        while (true) {
            hyokkaa(hahmo, vihollinen);
            if(vihollinen.annaNykyinenHP()<1){
                break;
            }
            hyokkaa(vihollinen, hahmo);
            if(hahmo.annaNykyinenHP()<1){
                break;
            }
        }
    }
    
    public static void hyokkaa(Elollinen hyokkaava, Elollinen hyokatty){
         Random noppa = new Random();
         int voima=hyokkaava.annaVoima();
         int puoloustus=hyokatty.annaPuolustus();
         double kerroin= (noppa.nextDouble()+0.1)*(double)2;
         int vahinko= (int)((double)(voima-puoloustus)*kerroin);
         hyokatty.vahennaNykyistaHP(vahinko);
    }
    
}
