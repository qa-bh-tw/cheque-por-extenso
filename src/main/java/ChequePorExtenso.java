/**
 * Created by nmoura on 9/14/15.
 */
public class ChequePorExtenso {

    public static final String REAIS = " Reais";
    public static final String REAL = " Real";

    public String getValorPorExtenso(final int valor) {

        int indice;
        int indiceUnidades = valor % 10;
        int indiceDezenas = valor / 10;

        String unidades[] = {"Zero", "Um", "Dois", "Três", "Quatro", "Cinco", "Seis", "Sete", "Oito",
                "Nove"};

        String dezEdezenas[] = {"Dez", "Onze", "Doze", "Treze", "Quatorze", "Quinze", "Dezesseis", "Dezessete",
                "Dezoito", "Dezenove"};

        String dezenas[] = {"", "", "Vinte", "Trinta", "Quarenta", "Cinquenta", "Sessenta", "Setenta", "Oitenta", "Noventa"};

        String valorPorExtenso = "";

        if (valor == 1) {
            valorPorExtenso = unidades[valor];
        } else if (valor > 1 && valor < 10) {
            valorPorExtenso = unidades[valor];
        } else if (valor > 9 && valor < 20) {
            indice = valor - 10;
            valorPorExtenso = dezEdezenas[indice];
        } else if (valor % 10 == 0) {
            valorPorExtenso = dezenas[valor / 10];
        } else if (valor > 20 && valor < 100) {
            valorPorExtenso = dezenas[indiceDezenas] + " e " + unidades[indiceUnidades];
        }

        valorPorExtenso += sufixoPara(valor);

        return valorPorExtenso;

    }

    private String sufixoPara(final int valor) {
        String sufixo = "";
        if (valor == 1) {
            sufixo =  REAL;
        } else {
            sufixo =  REAIS;
        }
        return sufixo;
    }

}
