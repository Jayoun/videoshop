import junit.framework.TestCase;
import org.junit.Before;

public class MovieTest extends TestCase {

    protected Movie m0, m11, m12, m2;
    protected Customer c1;

    @Before
    public void setUp() {
        m11 = new Movie("Sky Captain", 1);
        m12 = new Movie("Alejandro Magno", 1);
        m0 = new Movie("Accion Mutante", 0);
        m2 = new Movie("Hermano Oso", 2);
    }


    public void testGetPriceCode() {
        assertEquals(0, m0.getPriceCode());
        assertEquals(1, m11.getPriceCode());
        assertEquals(2, m2.getPriceCode());
    }

    public void testSetPriceCode() {
        m12.setPriceCode(4);
        assertEquals(4, m12.getPriceCode());
    }

    public void testGetTitle() {
        assertEquals("Accion Mutante", m0.getTitle());
        assertEquals("Sky Captain", m11.getTitle());
        assertEquals("Hermano Oso", m2.getTitle());
    }

}