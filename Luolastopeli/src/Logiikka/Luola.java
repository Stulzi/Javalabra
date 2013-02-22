package Logiikka;

import Elavat.Pelihahmo;
import Elavat.Vihollinen;
import UI.HyokkayksenKuuntelija;
import UI.Kayttoliittyma;
import java.util.ArrayList;
import java.util.Arrays;

public class Luola {
    private static Pelihahmo hahmo;
    private static ArrayList<Vihollinen> viholliset;
    Kayttoliittyma ui;
    
    public Luola(Pelihahmo hahmo, Kayttoliittyma ui, Vihollinen... viholliset){
        Luola.hahmo=hahmo;
        this.ui = ui;
        Luola.viholliset= new ArrayList<Vihollinen>();
        Luola.viholliset.addAll(Arrays.asList(viholliset));
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
    
    public static ArrayList<Vihollinen> getViholliset(){
        return Luola.viholliset;
    }
    
    /**
     * Antaa String-muotoisen esityksen listassa olevista vihollisista
     * @param viholliset lista vihollisista
     * @return String-esitys
     */
    public static String listaaViholliset(ArrayList<Vihollinen> viholliset){
       
        String lista = "";
        for (Vihollinen vihollinen : viholliset) {
            lista = lista + " a " + vihollinen.annaNimi(); 
            if(!vihollinen.equals(viholliset.get(viholliset.size()-1))){
               lista = lista + " and";
            }
        }
        
        return lista;
    }
    
    

    /**
     *Lopettaa taistelun jos pelihahmo on kuollut tai kaikki viholliset ovat kuolleet
     */
    public void taistele(){
        
        
        
        while(true){
            if(onkoTyhja()){
                hahmo.asetaTaistelutila("You beat all the enemies!\n");              
                break;
            }
            if(hahmo.onkoElossa()==false){
                break;
            }
        }
    }
    
   
    
}
