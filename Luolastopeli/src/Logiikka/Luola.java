package Logiikka;

import Elavat.Pelihahmo;
import Elavat.Vihollinen;
import java.util.ArrayList;

public class Luola {
    private static Pelihahmo hahmo;
    private static ArrayList viholliset;
    private int koordinaatti;
    private int vasen;
    private int oikea;
    
    public Luola(Pelihahmo hahmo, int koordinaatti, int vasen, int oikea){
        Luola.hahmo=hahmo;
        this.koordinaatti=koordinaatti;
        this.vasen=vasen;
        this.oikea=oikea;
    }
    
    public Luola(Pelihahmo hahmo, int koordinaatti, int vasen){
        Luola.hahmo=hahmo;
        this.koordinaatti=koordinaatti;
        this.vasen=vasen;
    }
    
    public Luola(Pelihahmo hahmo, int koordinaatti){
        Luola.hahmo=hahmo;
        this.koordinaatti=koordinaatti;
    }
    
    public int getVasen(){
        return this.vasen;
    }
    
    public int getOikea(){
        return this.oikea;
    }
    
    /**
     *Lisää annetut viholliset listaan
     * @param viholliset huoneen viholliset
     */
    public static void synnytaViholliset(Vihollinen ... viholliset){
        Luola.viholliset = new ArrayList<Vihollinen>();
        for (Vihollinen vihollinen : viholliset) {
            Luola.viholliset.add(vihollinen);
        }
    }
    
    /**
     * Tarkistaa onko huoneen viholliset voitettu
     * @return palauttaa arvon true jos viholliset on voitettu
     */
    public static boolean onkoTyhja(){
        if(Luola.viholliset.isEmpty()){
            return true;
        }
        return false;
    }
    
    

    /**
     *Luo huoneeseen viholliset ja aloittaa niiden taistelun hahmon kanssa
     */
    public static void taistele(){
        Vihollinen lepakko= new Vihollinen("Bat", 320, 100, 40);
        Vihollinen peikko= new Vihollinen("Goblin", 450, 160, 50);
        synnytaViholliset(lepakko, peikko);
        
        while(true){
            
            //pitää tehdä ero tavallisten ja erikoishyöökästen välille
            Taistelu.taistelu(hahmo, viholliset);
            if(onkoTyhja()){
                System.out.println("You beat all the enemies!");
                // tänne metodi jolla siirrytään seuraavaan huoneeseen
                break;
            }
            if(hahmo.onkoElossa()==false){
                break;
            }
        }
    }
    
}
