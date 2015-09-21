import org.junit.Assert;
import org.junit.Test;

public class ChequePorExtensoTest {

    @Test
    public void retornaUmPorExtenso() throws Exception {
        int valor = 1;

        ChequePorExtenso cheque = new ChequePorExtenso();
        String extenso = cheque.getValorPorExtenso(valor);

        Assert.assertEquals(extenso, "Um Real");
    }

    @Test
    public void retornaDoisPorExtenso() {
        int valor = 2;

        ChequePorExtenso cheque = new ChequePorExtenso();
        String extenso = cheque.getValorPorExtenso(valor);

        Assert.assertEquals(extenso, "Dois");
    }

    @Test
    public void retornaTresPorExtenso(){
        int valor= 3;

        ChequePorExtenso cheque = new ChequePorExtenso();
        String extenso = cheque.getValorPorExtenso(valor);

        Assert.assertEquals(extenso, "Três");

    }

    @Test
    public void retornaDozePorExtenso(){
        int valor = 12;

        ChequePorExtenso cheque = new ChequePorExtenso();
        String extenso = cheque.getValorPorExtenso(valor);

        Assert.assertEquals(extenso,"Doze");
    }

    @Test
    public void retornaVintePorExtenso(){
        int valor = 20;

        ChequePorExtenso cheque = new ChequePorExtenso();
        String extenso = cheque.getValorPorExtenso(valor);

        Assert.assertEquals(extenso,"Vinte");
    }

    @Test
    public void retornaVinteEcincoPorExtenso(){
        int valor = 25;

        ChequePorExtenso cheque = new ChequePorExtenso();
        String extenso = cheque.getValorPorExtenso(valor);

        Assert.assertEquals(extenso,"Vinte e Cinco");
    }


}
