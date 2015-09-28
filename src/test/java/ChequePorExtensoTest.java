import org.junit.Assert;
import org.junit.Test;

public class ChequePorExtensoTest {

    @Test
    public void retornaZeroPorExtenso() throws Exception {
        int valor = 0;

        ChequePorExtenso cheque = new ChequePorExtenso();
        String extenso = cheque.getValorPorExtenso(valor);

        Assert.assertEquals("Zero Real", extenso);
    }


    @Test
    public void retornaUmPorExtenso() throws Exception {
        int valor = 1;

        ChequePorExtenso cheque = new ChequePorExtenso();
        String extenso = cheque.getValorPorExtenso(valor);

        Assert.assertEquals("Um Real", extenso);
    }

    @Test
    public void retornaDoisPorExtenso() {
        int valor = 2;

        ChequePorExtenso cheque = new ChequePorExtenso();
        String extenso = cheque.getValorPorExtenso(valor);

        Assert.assertEquals("Dois Reais", extenso);
    }

    @Test
    public void retornaTresPorExtenso() {
        int valor = 3;

        ChequePorExtenso cheque = new ChequePorExtenso();
        String extenso = cheque.getValorPorExtenso(valor);

        Assert.assertEquals("Três Reais", extenso);

    }

    @Test
    public void retornaDozePorExtenso() {
        int valor = 12;

        ChequePorExtenso cheque = new ChequePorExtenso();
        String extenso = cheque.getValorPorExtenso(valor);

        Assert.assertEquals("Doze Reais", extenso);
    }

    @Test
    public void retornaVintePorExtenso() {
        int valor = 20;

        ChequePorExtenso cheque = new ChequePorExtenso();
        String extenso = cheque.getValorPorExtenso(valor);

        Assert.assertEquals("Vinte Reais", extenso);
    }

    @Test
    public void retornaVinteEcincoPorExtenso() {
        int valor = 25;

        ChequePorExtenso cheque = new ChequePorExtenso();
        String extenso = cheque.getValorPorExtenso(valor);

        Assert.assertEquals("Vinte e Cinco Reais", extenso);
    }

    @Test
    public void retornaTrintaETresPorExtenso() {
        int valor = 33;

        ChequePorExtenso cheque = new ChequePorExtenso();
        String extenso = cheque.getValorPorExtenso(valor);

        Assert.assertEquals("Trinta e Três Reais", extenso);
    }

    @Test
    public void retornaNoventaENovePorExtenso() {
        int valor = 99;

        ChequePorExtenso cheque = new ChequePorExtenso();
        String extenso = cheque.getValorPorExtenso(valor);

        Assert.assertEquals("Noventa e Nove Reais", extenso);
    }

    @Test
    public void retornaCemPorExtenso() {
        int valor = 100;

        ChequePorExtenso cheque = new ChequePorExtenso();
        String extenso = cheque.getValorPorExtenso(valor);

        Assert.assertEquals("Cem Reais", extenso);
    }

    @Test
    public void retornaCentoEUmPorExtenso() {
        int valor = 101;

        ChequePorExtenso cheque = new ChequePorExtenso();
        String extenso = cheque.getValorPorExtenso(valor);

        Assert.assertEquals("Cento e Um Reais", extenso);
    }


}
