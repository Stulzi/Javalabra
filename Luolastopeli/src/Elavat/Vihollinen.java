package Elavat;

public class Vihollinen implements Elollinen{
    
    private int maxHP;
    private int nykyinenHP;
    private int voima;
    private int puolustus;

    public void vihollinen(int maxHP, int voima, int puolustus){
        this.maxHP=maxHP;
        this.nykyinenHP=maxHP;
        this.voima=voima;
        this.puolustus=puolustus;
    }
    
    @Override
    public void vähennäNykyistaHP(int maara) {
        this.nykyinenHP=nykyinenHP-maara;
    }

    @Override
    public int annaVoima() {
        return this.voima;
    }

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
    
}
