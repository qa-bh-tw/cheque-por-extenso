/**
 * Created by nmoura on 9/14/15.
 */
public class ChequePorExtenso {

    public static final String REAIS = " Reais";
    public static final String REAL = " Real";

    public String getValorPorExtenso(int valor) {

        int indice;

        String unidades[]={"Zero","Um","Dois","Três","Quatro","Cinco","Seis","Sete","Oito",
                "Nove"};

        String dezEdezenas[]={"Dez","Onze","Doze","Treze","Quatorze","Quinze","Dezesseis","Dezessete",
                "Dezoito","Dezenove"};

        String dezenas[]={"","","Vinte","Trinta","Quarenta","Cinquenta","Sessenta","Setenta","Oitenta","Noventa"};

        String valorPorExtenso = "";

        if (valor ==1){
            valorPorExtenso = unidades[valor] + REAL;
        }else if(valor > 1 && valor < 10 ) {
            valorPorExtenso = unidades[valor] + REAIS;
        } else if (valor > 9 && valor < 20) {
            indice = valor - 10;
            valorPorExtenso = dezEdezenas[indice] + REAIS;
        } else if(valor == 20) {
            valorPorExtenso = dezenas[2] + REAIS;
        } else if (valor > 20 && valor < 30) {
            indice = valor - 20;
            valorPorExtenso = dezenas[2] +" e " + unidades[indice] + REAIS;
        }




        return valorPorExtenso;
    }
}
