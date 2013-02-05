package Elavat;

public class Pelihahmo implements Elollinen{

    private String nimi;
    private int maxHP;
    private int nykyinenHP;
    private int voima;
    private int puolustus;
    private int maxSP;
    private int nykyinenSP;
    
    public Pelihahmo(int maxHP, int maxSP, int voima, int puolustus){
        this.nimi= "You";
        this.maxHP=maxHP;
        this.maxSP=maxSP;
        this.voima=voima;
        this.puolustus=puolustus;
        this.nykyinenHP=maxHP;
        this.nykyinenSP=maxSP;
    }
    
    /**
     *vähentää hahmon HP-arvoa
     * @param maara vähennettävä HP
     */
    @Override
    public void vahennaNykyistaHP(int maara) {
        if(maara<1){
            return;
        }
        this.nykyinenHP=nykyinenHP-maara;
    }

    @Override
    public int annaVoima() {
        return this.voima;
    }

    /**
     *Tarkistaa onko hahmo elossa
     * @return false, jos HP on 0
     */
    @Override
    public boolean onkoElossa() {
        if (this.nykyinenHP<1){
            return false;
        }
        return true;
    }

    @Override
    public int annaPuolustus() {
        return this.puolustus;
    }
    
    /**
     * Vähentää hahmon SP-arvoa
     * @param maara vähennettävä määrä
     */
    public void vahennaNykyistaSP(int maara){
        if(maara<1){
            return;
        }
        this.nykyinenSP=nykyinenSP-maara;
    }
    
    /**
     *parantaa hahmon HP- ja SP-arvot täyteen
     */
    public void paranna(){
        this.nykyinenHP=this.maxHP;
        this.nykyinenSP=this.maxSP;
    }
    
    /**
     *Kasvattaa hahmon maksimi HP-arvoa
     * @param maara lisättävä määrä
     */
    public void lisaaHP(int maara){
        if (maara<1){
            return;
        }
        this.maxHP=maxHP+maara;
    }
    
    /**
     *Kasvattaa hahmon maksimi SP-arvoa
     * @param maara lisättävä määrä
     */
    public void lisaaSP(int maara){
        if(maara<1){
            return;
        }
        this.maxSP=maxSP+maara;
    }
    
    /**
     *Kasvattaa hahmon voimaa
     * @param maara lisättävä määrä
     */
    public void lisaaVoimaa(int maara){
        if(maara<1){
            return;
        }
        this.voima=voima+maara;
    }
    
    /**
     *Kasvattaa hahmon puolustusta
     * @param maara lisättävä määrä
     */
    public void lisaaPuolustusta(int maara) {
        if(maara<1){
            return;
        }
        this.puolustus=puolustus+maara;
    }

    @Override
    public String annaNimi() {
        return this.nimi;
    }
    
    public int annaHP(){
        return this.maxHP;
    }
    
    public int annaNykyinenHP(){
        return this.nykyinenHP;
    }
    
    public int annaSP(){
        return this.maxSP;
    }
    
    public int annaNykyinenSP(){
        return this.nykyinenSP;
    }
    
}
