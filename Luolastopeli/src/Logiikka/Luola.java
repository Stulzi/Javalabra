package Logiikka;

import Elavat.Pelihahmo;
import Elavat.Vihollinen;
import UI.HyokkayksenKuuntelija;
import java.util.ArrayList;
import java.util.Arrays;

public class Luola {
    private static Pelihahmo hahmo;
    private static ArrayList<Vihollinen> viholliset;
    
    public Luola(Pelihahmo hahmo, Vihollinen... viholliset){
        Luola.hahmo=hahmo;
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
     *Aloittaa taistelun hahmon ja vihollisten välillä
     */
    public static void taistele(){
        
        
        System.out.println("You eneter a room with" + listaaViholliset(viholliset) );
        
        while(true){
            if(onkoTyhja()){
                System.out.println("You beat all the enemies!");
                break;
            }
            if(hahmo.onkoElossa()==false){
                break;
            }
        }
    }
    
}
