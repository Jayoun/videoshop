import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class VideoClubAplicacionTest extends TestCase {
    protected Movie m0, m11, m12, m2;
    protected Customer c1;



    @Before
    public void setUp() {
        m11 = new Movie("Sky Captain", Movie.PriceCode.NEW_RELEASE);
        m12 = new Movie("Alejandro Magno", Movie.PriceCode.NEW_RELEASE);
        m0 = new Movie("Accion Mutante", Movie.PriceCode.REGULAR);
        m2 = new Movie("Hermano Oso", Movie.PriceCode.CHILDRENS);

        c1 = new Customer("Manuel");
    }

    @After
    public void tearDown() throws Exception {}

    @Test
    public void testAlquiler() {

        Rental r1 = new Rental(m11, 5);
        Rental r2 = new Rental(m0, 1);
        Rental r3 = new Rental(m2, 10);

        c1.addRental(r1);
        c1.addRental(r2);
        c1.addRental(r3);

        String salida = c1.statement();

        String salidaEsperada = new String("Rental Record for Manuel\n"
                + "\tSky Captain\t15.0\n" + "\tAccion Mutante\t2.0\n"
                + "\tHermano Oso\t12.0\n" + "Amount owed is 29.0\n"
                + "You earned 4 frequent renter points");

        assertTrue("Calcula mal el alquiler", salidaEsperada.equals(salida));

    }
}