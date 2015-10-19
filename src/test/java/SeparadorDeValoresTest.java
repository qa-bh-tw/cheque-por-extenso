import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SeparadorDeValoresTest {


    private SeparadorDeValores separadorDeValores;

    @Before
    public void setUp() throws Exception {
        separadorDeValores = new SeparadorDeValores();
    }

    @Test
    public void milharDe0eh0() {
        int milhar = separadorDeValores.milharesEm(0);

        assertEquals(milhar, 0);
    }

    @Test
    public void milharDe1eh0() {
        int milhar = separadorDeValores.milharesEm(1);

        assertEquals(milhar, 0);
    }

    @Test
    public void milharDe999eh0() {
        int milhar = separadorDeValores.milharesEm(999);

        assertEquals(milhar, 0);
    }

    @Test
    public void milharDe1000eh1() {
        int milhar = separadorDeValores.milharesEm(1000);

        assertEquals(milhar, 1);
    }

    @Test
    public void milharDe1001eh1() {
        int milhar = separadorDeValores.milharesEm(1001);

        assertEquals(milhar, 1);
    }

    @Test
    public void milharDe9999eh9() {
        int milhar = separadorDeValores.milharesEm(9999);

        assertEquals(milhar, 9);
    }

    @Test
    public void centenaDe0eh0() {
        int centena = separadorDeValores.centenasEm(0);

        assertEquals(centena, 0);
    }

    @Test
    public void centenaDe1eh0() {
        int centena = separadorDeValores.centenasEm(1);

        assertEquals(centena, 0);
    }

    @Test
    public void centenaDe100eh1() {
        int centena = separadorDeValores.centenasEm(100);

        assertEquals(centena, 1);
    }

    @Test
    public void centenaDe101eh1() {
        int centena = separadorDeValores.centenasEm(101);

        assertEquals(centena, 1);
    }

    @Test
    public void centenaDe999eh9() {
        int centena = separadorDeValores.centenasEm(999);

        assertEquals(centena, 9);
    }

    @Test
    public void centenaDe1000eh0() {
        int centena = separadorDeValores.centenasEm(1000);

        assertEquals(centena, 0);
    }

}
