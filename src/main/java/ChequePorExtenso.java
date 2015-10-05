public class ChequePorExtenso {

    public static final String REAIS = " Reais";
    public static final String REAL = " Real";
    public static final String CEM = "Cem";


    private final String menoresQueVinte[] = {"Zero", "Um", "Dois", "Três", "Quatro", "Cinco", "Seis", "Sete", "Oito",
            "Nove", "Dez", "Onze", "Doze", "Treze", "Quatorze", "Quinze", "Dezesseis", "Dezessete",
            "Dezoito", "Dezenove"};

    private final String dezenas[] = {"", "", "Vinte", "Trinta", "Quarenta", "Cinquenta", "Sessenta", "Setenta", "Oitenta",
            "Noventa"};

    private final String centenas[] = {"", "Cento", "Duzentos", "Trezentos", "Quatrocentos", "Quinhentos", "Seiscentos",
            "Setecentos", "Oitocentos", "Novecentos"};


    public String getValorPorExtenso(final int valor) {

        String valorPorExtenso = "";
        int indice;
        int indiceUnidades = valor % 10;
        int indiceDezenas = valor / 10;
        int indiceCentenas = valor / 100;

        if (valor < 100) {
            valorPorExtenso = retornaValorPorExtensoUnidadesEDezenas(valor);
        } else if (valor >= 100) {
            if (valor == 100) {
                valorPorExtenso = CEM;
            } else if (valor > 100 && valor < 110) {
                valorPorExtenso = centenas[indiceCentenas] + " e " + menoresQueVinte[indiceUnidades];
            } else if (valor == 110) {
                indice = valor - 100;
                valorPorExtenso = centenas[indiceCentenas] + " e " + menoresQueVinte[indice];
            }
        }

        valorPorExtenso += sufixoPara(valor);

        return valorPorExtenso;

    }

    private String retornaValorPorExtensoUnidadesEDezenas(int valor) {
        int indiceUnidades = valor % 10;
        int indiceDezenas = valor / 10;
        String valorPorExtenso = "";
        if (valor >= 0 && valor < 20) {
            valorPorExtenso = menoresQueVinte[valor];
        } else if (ehDezenaRedonda(valor)) {
            valorPorExtenso = dezenas[valor / 10];
        } else if (valor > 20) {
            valorPorExtenso = dezenas[indiceDezenas] + " e " + menoresQueVinte[indiceUnidades];
        }
        return valorPorExtenso;
    }

    private boolean ehDezenaRedonda(int valor) {
        return valor % 10 == 0;
    }

    private String sufixoPara(final int valor) {
        return valor <= 1 ? REAL : REAIS;
    }

}
