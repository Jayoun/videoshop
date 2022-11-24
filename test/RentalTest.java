import junit.framework.TestCase;
import org.junit.Before;

public class RentalTest extends TestCase {

    protected Customer c1;
    protected Movie m0, m1, m2;
    Rental r0, r1, r2;


    @Before
    public void setUp() {
        c1 = new Customer("Manuel");

        m0 = new Movie("Accion Mutante", Movie.PriceCode.REGULAR);
        m1 = new Movie("Sky Captain", Movie.PriceCode.CHILDRENS);
        m2 = new Movie("Hermano Oso", Movie.PriceCode.NEW_RELEASE);

        r0 = new Rental(m0, 1);
        r1 = new Rental(m1, 5);
        r2 = new Rental(m2, 10);
    }

    public void testGetDaysRented() {
        assertEquals(1, r0.getDaysRented());
    }

    public void testGetMovie() {
        assertEquals("Accion Mutante", r0.getMovie().getTitle());
        assertEquals(Movie.PriceCode.REGULAR, r0.getMovie().getPriceCode() );
    }
}