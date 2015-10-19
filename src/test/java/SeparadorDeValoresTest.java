import org.junit.Assert;
import org.junit.Test;

public class SeparadorDeValoresTest {


    @Test
    public void milharDe0eh0() {
        SeparadorDeValores separadorDeValores = new SeparadorDeValores();

        int milhar= separadorDeValores.milharesEm(0);

        Assert.assertEquals(milhar, 0);
    }

    @Test
    public void milharDe1eh0() {
        SeparadorDeValores separadorDeValores = new SeparadorDeValores();

        int milhar= separadorDeValores.milharesEm(1);

        Assert.assertEquals(milhar, 0);
    }

    @Test
    public void milharDe999eh0() {
        SeparadorDeValores separadorDeValores = new SeparadorDeValores();

        int milhar= separadorDeValores.milharesEm(999);

        Assert.assertEquals(milhar, 0);
    }

    @Test
    public void milharDe1000eh1() {
        SeparadorDeValores separadorDeValores = new SeparadorDeValores();

        int milhar= separadorDeValores.milharesEm(1000);

        Assert.assertEquals(milhar, 1);
    }

    @Test
    public void milharDe1001eh1() {
        SeparadorDeValores separadorDeValores = new SeparadorDeValores();

        int milhar= separadorDeValores.milharesEm(1001);

        Assert.assertEquals(milhar, 1);
    }

    @Test
    public void milharDe9999eh9() {
        SeparadorDeValores separadorDeValores = new SeparadorDeValores();

        int milhar = separadorDeValores.milharesEm(9999);

        Assert.assertEquals(milhar, 9);
    }

    @Test
    public void centenaDe0eh0() {
        SeparadorDeValores separadorDeValores = new SeparadorDeValores();

        int centena = separadorDeValores.centenasEm(0);

        Assert.assertEquals(centena, 0);
    }



}
