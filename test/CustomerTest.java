import junit.framework.TestCase;
import org.junit.Before;

public class CustomerTest extends TestCase {

    protected Customer c1;
    protected Movie m0, m1, m2;
    Rental r0, r1, r2;


    @Before
    public void setUp() {
        c1 = new Customer("Manuel");

        m0 = new Movie("Accion Mutante", Movie.PriceCode.REGULAR);
        m1 = new Movie("Sky Captain", Movie.PriceCode.NEW_RELEASE);
        m2 = new Movie("Hermano Oso", Movie.PriceCode.CHILDRENS);

        r0 = new Rental(m0, 1);
        r1 = new Rental(m1, 5);
        r2 = new Rental(m2, 10);
    }

    public void testAddRental() {
        c1.addRental(r1);
        assertEquals("Rental Record for Manuel\n" +
                "\tSky Captain\t15.0\n" +
                "Amount owed is 15.0\n" +
                "You earned 2 frequent renter points", c1.statement());
    }

    public void testAddRentals() {
        c1.addRental(r0);
        c1.addRental(r1);
        c1.addRental(r2);

        assertEquals("Rental Record for Manuel\n" +
                "\tAccion Mutante\t2.0\n" +
                "\tSky Captain\t15.0\n" +
                "\tHermano Oso\t12.0\n" +
                "Amount owed is 29.0\n" +
                "You earned 4 frequent renter points", c1.statement());
    }

    public void testTestGetName() {
        assertEquals("Manuel", c1.getName());
    }

    public void testStatement() {
        c1.addRental(r0);
        c1.addRental(r1);
        c1.addRental(r2);

        assertEquals("Rental Record for Manuel\n" +
                "\tAccion Mutante\t2.0\n" +
                "\tSky Captain\t15.0\n" +
                "\tHermano Oso\t12.0\n" +
                "Amount owed is 29.0\n" +
                "You earned 4 frequent renter points", c1.statement());
    }
}