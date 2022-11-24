import junit.framework.TestCase;
import org.junit.Before;

public class MovieTest extends TestCase {

    protected Movie m0, m11, m12, m2;
    protected Customer c1;


    @Before
    public void setUp() {
        m11 = new Movie("Sky Captain", Movie.PriceCode.CHILDRENS);
        m12 = new Movie("Alejandro Magno", Movie.PriceCode.CHILDRENS);
        m0 = new Movie("Accion Mutante", Movie.PriceCode.REGULAR);
        m2 = new Movie("Hermano Oso", Movie.PriceCode.NEW_RELEASE);
    }

    public void testGetPriceCode() {
        assertEquals(Movie.PriceCode.REGULAR, m0.getPriceCode());
        assertEquals(Movie.PriceCode.CHILDRENS, m11.getPriceCode());
        assertEquals(Movie.PriceCode.NEW_RELEASE, m2.getPriceCode());
    }

    public void testSetPriceCode() {
        m12.setPriceCode(Movie.PriceCode.NEW_RELEASE);
        assertEquals(Movie.PriceCode.NEW_RELEASE, m12.getPriceCode());
    }

    public void testGetTitle() {
        assertEquals("Accion Mutante", m0.getTitle());
        assertEquals("Sky Captain", m11.getTitle());
        assertEquals("Hermano Oso", m2.getTitle());
    }

}