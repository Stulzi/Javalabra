package Logiikka;

import Elavat.Elollinen;
import Elavat.Pelihahmo;
import Elavat.Vihollinen;
import UI.Kayttoliittyma;
import java.util.ArrayList;
import java.util.Random;

public class Taistelu {
    
       private static Pelihahmo hahmo;
       private static Vihollinen vihu;
       private static Kayttoliittyma ui;
    
    /**
     * Suorittaa yhden vuoron taistelusta hahmon ja vihollisten välillä
     * @param hahmo pelihahmo
     * @param viholliset tämänhetkiset viholliset
     */
    public static void taistelu(String komento,Kayttoliittyma ui){
        Taistelu.ui=ui;
        hahmo = Luolasto.getHahmo();
        vihu = Luola.getViholliset().get(0);
        
        if(komento.contentEquals("hyokkaa")){
            hyokkaa(Luolasto.getHahmo(), vihu);
            hahmo.lisaaNykyistaSP(5);
            hahmo.asetaTaistelutila("You attacked the " + vihu.annaNimi() + ".\n");
           
        } else if(komento.contentEquals("special")){
            if(Luolasto.getHahmo().annaNykyinenSP()<30){
                return;
            }
            Luolasto.getHahmo().vahennaNykyistaSP(30);
            erikoishyokkaa(Luolasto.getHahmo(), vihu);
            hahmo.asetaTaistelutila("You attacked the " + vihu.annaNimi() + ".\n");
            
        } else if(komento.contentEquals("paranna")){
            if(Luolasto.getHahmo().annaNykyinenSP()<20){
                return;
            }
            Luolasto.getHahmo().vahennaNykyistaSP(20);
            Luolasto.getHahmo().lisaaNykyistaHP(150);
            hahmo.asetaTaistelutila("You healed yourself.\n");
            
        }
        
            if(!Luola.getViholliset().get(0).onkoElossa()){
                ui.annaVihollinenAction().setText("The " + vihu.annaNimi() + " died.\n");
                Luola.getViholliset().remove(0);
            }
            
            for (Vihollinen vihollinen : Luola.getViholliset()) {
            vihollinen.asetaTaistelutila("The " + vihollinen.annaNimi() + " attacked you.\n");
            hyokkaa(vihollinen, Luolasto.getHahmo());           
            if(Luolasto.getHahmo().annaNykyinenHP()<1){
                hahmo.asetaTaistelutila("You died.");
                break;
            }
            
            
        }
            
        ui.paivitaHahmoAction();
        ui.paivitaVihollinenAction();
            
        }
       
    /**
     * Suorittaa yhden hyökkäyksen
     * @param hyokkaava hyökkäävä (elollinen)
     * @param hyokatty hyökkäyksen kohde (elollinen)
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
         hyokatty.vahennaNykyistaHP(vahinko);
    }

    /**
     * Suorittaa yhden erikoishyökkäyksen. Nämä kuluttavat hahmon SP-arvoa.
     * @param hahmo pelihahmo
     * @param vihollinen vihollinen johon hyökätään
     */
    private static void erikoishyokkaa(Pelihahmo hahmo, Vihollinen vihollinen) {
         Random noppa = new Random();
         int voima=hahmo.annaVoima();
         int puolustus=vihollinen.annaPuolustus();
         double kerroin= ((double)(noppa.nextInt(4)+10)/(double)10);
         int vahinko= (int)((double)voima*kerroin-puolustus);
         if(vahinko<1){
             vahinko=0;
         }
         vihollinen.vahennaNykyistaHP(vahinko);
    }
    
    
    public Vihollinen getVihollinen(){
        return vihu;
    }
}
