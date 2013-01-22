
import Elavat.Pelihahmo;
import Elavat.Vihollinen;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class LuolaTest {
    
    Pelihahmo hahmo;
    Vihollinen peikko;
    
    public LuolaTest() {
    }
    
    @Before
    public void setUp() {
        hahmo = new Pelihahmo(15,10,5,3);
        peikko = new Vihollinen("Peikko",10,4,2);
    }
    
    @Test
    public void hahmoOnElossa(){
        assertTrue(hahmo.onkoElossa());
    }
    
    @Test
    public void hahmoOnKuollut(){
        hahmo.vahennaNykyistaHP(30);
        assertFalse(hahmo.onkoElossa());
    }
    
    @Test
    public void vahennaHahmonHP(){
        hahmo.vahennaNykyistaHP(5);
        assertEquals(10,hahmo.annaNykyinenHP());
    }
    
    @Test
    public void vahennaHahmonSPtaNegatiivisellaLuvulla(){
        hahmo.vahennaNykyistaSP(-5);
        assertEquals(10,hahmo.annaNykyinenSP());
    }
    
    @Test
    public void vahennaHahmonSP(){
        hahmo.vahennaNykyistaSP(5);
        assertEquals(5,hahmo.annaNykyinenSP());
    }
    
    @Test
    public void vahennaHahmonHPtaNegatiivisellaLuvulla(){
        hahmo.vahennaNykyistaHP(-5);
        assertEquals(15,hahmo.annaNykyinenHP());
    }

    @Test
    public void parantaminenOnnistuu(){
        hahmo.vahennaNykyistaHP(5);
        hahmo.vahennaNykyistaSP(5);
        hahmo.paranna();
        assertEquals(15,hahmo.annaNykyinenHP());
        assertEquals(10,hahmo.annaNykyinenSP());
    }
    
    @Test
    public void arvojenLisaaminen(){
        hahmo.lisaaHP(5);
        hahmo.lisaaPuolustusta(5);
        hahmo.lisaaSP(5);
        hahmo.lisaaVoimaa(5);
        assertEquals(20,hahmo.annaHP());
        assertEquals(15,hahmo.annaSP());
        assertEquals(10,hahmo.annaVoima());
        assertEquals(8,hahmo.annaPuolustus());   
    }
    
    @Test
    public void arvojenLisaaminenNegatiivisillaLuvuilla(){
        hahmo.lisaaHP(-5);
        hahmo.lisaaPuolustusta(-5);
        hahmo.lisaaSP(-5);
        hahmo.lisaaVoimaa(-5);
        assertEquals(15,hahmo.annaHP());
        assertEquals(10,hahmo.annaSP());
        assertEquals(5,hahmo.annaVoima());
        assertEquals(3,hahmo.annaPuolustus());   
    }
    
    
    @Test
    public void onkoVihollinenElossa(){
        assertTrue(peikko.onkoElossa());
    }
    
    @Test
    public void onkoVihollinenKuollut(){
        peikko.vahennaNykyistaHP(10);
        assertFalse(peikko.onkoElossa());
    }
    
    @Test
    public void vahennaVihollisenHP(){
        peikko.vahennaNykyistaHP(5);
        assertEquals(5,peikko.annaNykyinenHP());
    }
    
    @Test
    public void vahennaVihollisenHPtaNegatiivisellaLuvulla(){
        peikko.vahennaNykyistaHP(-5);
        assertEquals(10,peikko.annaNykyinenHP());
    }
    
    
}
