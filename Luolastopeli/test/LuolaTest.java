
import Elavat.Pelihahmo;
import Elavat.Vihollinen;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class LuolaTest {
    
    public LuolaTest() {
        Pelihahmo hahmo = new Pelihahmo(15,10,5,3);
        Vihollinen peikko = new Vihollinen("Peikko",10,4,2);

    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    

    
    @After
    public void tearDown() {
    }

    @Test
    public void hahmonNimi(){
        assertEquals("You", hahmo.annaNimi());
    }
    
    
    
    
}
