package Elavat;

public class Vihollinen implements Elollinen{
    
    private String nimi;
    private int maxHP;
    private int nykyinenHP;
    private int voima;
    private int puolustus;

    public Vihollinen(String nimi, int maxHP, int voima, int puolustus){
        this.maxHP=maxHP;
        this.nykyinenHP=maxHP;
        this.voima=voima;
        this.puolustus=puolustus;
        this.nimi=nimi;
    }
    
    /**
     * Vähentää vihollisen HP-arvoa
     * @param maara vähennettävä määrä
     */
    @Override
    public void vahennaNykyistaHP(int maara) {
        if (maara<1){
            return;
        }
        this.nykyinenHP=nykyinenHP-maara;
    }

    @Override
    public int annaVoima() {
        return this.voima;
    }

    /**
     * Tarkistaa onko vihollinen elossa
     * @return false jos HP on 0
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
    
}
