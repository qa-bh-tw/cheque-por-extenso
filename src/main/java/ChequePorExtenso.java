/**
 * Created by nmoura on 9/14/15.
 */
public class ChequePorExtenso {

    public String getValorPorExtenso(int valor) {

        String unidades[]={"Zero","Um","Dois","Três","Quatro","Cinco","Seis","Sete","Oito",
                "Nove","Dez","Onze","Doze","Treze","Quatorze","Quinze","Dezesseis","Dezessete",
                "Dezoito","Dezenove"};

        String dezenas[]={"","","Vinte","Trinta","Quarenta","Cinquenta","Sessenta","Setenta","Oitenta","Noventa"};

        String valorPorExtenso = "";

        if(valor <= 19 ) {
            valorPorExtenso = unidades[valor];
        }
        else if (valor > 20 && valor <30)
        {
            int indice = valor - 20;
            valorPorExtenso = "Vinte e " + unidades[indice];
        }

        else {
            valorPorExtenso = "Vinte";
        }

        return valorPorExtenso;
    }
}
